package im.dlg.botsdk.model;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import im.dlg.grpc.services.UsersOuterClass;
import lombok.Getter;

public class User {

    @Getter
    private final Peer peer;
    @Getter
    private final String name;
    @Getter
    private final String nick;
    @Getter
    private final String about;
    @Getter
    private final Sex sex;
    @Getter
    private final String language;
    @Getter
    private final String timeZone;
    @Getter
    private final String customProfile;
    @Getter
    private final CustomerProfile customerProfileEntity;
    @Getter
    private final UserAvatar userAvatar;
    @Getter
    private final boolean isBot;


    private User(Builder builder) {
        peer = builder.peer;
        name = builder.name;
        nick = builder.nick;
        about = builder.about;
        sex = builder.sex;
        language = builder.language;
        timeZone = builder.timeZone;
        customProfile = builder.customProfileJson;
        customerProfileEntity = builder.customerProfile;
        this.userAvatar = builder.userAvatar;
        isBot = builder.isBot;
    }


    @Deprecated
    public User(Peer peer, String name, String nick, Sex sex, String about, String language, String timeZone) {
        this(peer, name, nick, sex, about, language, timeZone, null);
    }

    @Deprecated
    public User(Peer peer, String name, String nick, Sex sex, String about, String language, String timeZone, String customProfile) {
        this.peer = peer;
        this.name = name;
        this.nick = nick;
        this.about = about;
        this.sex = sex;
        this.language = language;
        this.timeZone = timeZone;
        Gson gson = new Gson();
        CustomerProfile customerEntity = gson.fromJson(customProfile, CustomerProfile.class);
        this.customProfile = customProfile;
        customerProfileEntity = customerEntity;
        userAvatar = null;
        isBot = false;
    }

    public CustomerProfile getCustomerProfileEntity() {
        return customerProfileEntity;
    }

    public boolean isBot() {
        return isBot;
    }

    public enum Sex {
        MALE,
        FEMALE;

        public static Sex fromServerModel(UsersOuterClass.Sex sex) {
            return sex.getNumber() == 3 ? MALE : FEMALE;
        }

        public UsersOuterClass.Sex toServer() {
            switch (this) {
                case MALE:
                    return UsersOuterClass.Sex.SEX_MALE;
                case FEMALE:
                    return UsersOuterClass.Sex.SEX_FEMALE;
                default:
                    return UsersOuterClass.Sex.UNRECOGNIZED;
            }
        }
    }

    public static final class Builder {
        private Peer peer;
        private String name;
        private String nick;
        private String about;
        private Sex sex;
        private String language;
        private String timeZone;
        private String customProfileJson;
        private CustomerProfile customerProfile;
        private UserAvatar userAvatar;
        private Boolean isBot;

        public Builder() {
        }

        public Builder peer(Peer val) {
            peer = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder nick(String val) {
            nick = val;
            return this;
        }

        public Builder about(String val) {
            about = val;
            return this;
        }

        public Builder sex(Sex val) {
            sex = val;
            return this;
        }

        public Builder language(String val) {
            language = val;
            return this;
        }

        public Builder timeZone(String val) {
            timeZone = val;
            return this;
        }

        public Builder userAvatar(UserAvatar val) {
            userAvatar = val;
            return this;
        }

        public Builder isBot(Boolean val){
            isBot = val;
            return this;
        }

        public Builder customProfileJson(String val) {
            customProfileJson = val;

            try {
                Gson gson = new Gson();
                customerProfile = gson.fromJson(val, CustomerProfile.class);

            } catch (JsonSyntaxException e) {
                e.printStackTrace();
            }

            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
