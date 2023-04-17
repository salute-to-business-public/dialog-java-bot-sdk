package im.dlg.botsdk.model.reactions;

import im.dlg.grpc.services.MessagingOuterClass;
import im.dlg.grpc.services.ReactionsOuterClass;

import java.util.List;

public class Reaction {

    /**
     * Emoji code
     */
    private final String code;

    /**
     * User ids
     */
    private final List<Integer> userIds;

    /**
     * Total amount reactions. Calculate on server
     */
    private final Integer usersAmount;

    public Reaction(ReactionsOuterClass.MessageReactions reactions){
        ReactionsOuterClass.Reaction reaction = reactions.getReactions(0);
        code = reaction.getCode();
        userIds = reaction.getUsersList();
        usersAmount = reaction.getUsersCount();
    }

    public Reaction(MessagingOuterClass.MessageReaction reaction)
    {
        code = reaction.getCode();
        userIds = reaction.getUsersList();
        usersAmount = reaction.getUsersCount();
    }

    public Reaction(ReactionsOuterClass.Reaction reaction){
        code = reaction.getCode();
        userIds = reaction.getUsersList();
        usersAmount = reaction.getUsersAmount();
    }


    public Reaction(String code, List<Integer> userIds, Integer usersAmount) {
        this.code = code;
        this.userIds = userIds;
        this.usersAmount = usersAmount;
    }

    private Reaction(Builder builder) {
        code = builder.code;
        userIds = builder.userIds;
        usersAmount = builder.usersAmount;
    }

    public String getCode() {
        return code;
    }

    public List<Integer> getUserIds() {
        return userIds;
    }

    public Integer getUsersAmount() {
        return usersAmount;
    }

    public ReactionsOuterClass.Reaction toSerer(){
        return ReactionsOuterClass.Reaction.newBuilder()
                .setCode(code)
                .addAllUsers(userIds)
                .build();
    }

    @Override
    public String toString() {
        return "Reaction{" +
                "code='" + code + '\'' +
                ", userIds=" + userIds +
                ", usersAmount=" + usersAmount +
                '}';
    }

    public static final class Builder {
        private final String code;
        private final List<Integer> userIds;
        private final Integer usersAmount;

        public Builder(String code, List<Integer> userIds, Integer usersAmount) {
            this.code = code;
            this.userIds = userIds;
            this.usersAmount = usersAmount;
        }

        public Reaction build() {
            return new Reaction(this);
        }
    }
}
