package im.dlg.botsdk.domain;

import dialog.Peers;
import dialog.UsersOuterClass;

public class User {
    public enum Sex {
        MALE, FEMALE;

        public static Sex fromServerModel(UsersOuterClass.Sex sex) {
            return sex.getNumber() == 3 ? MALE : FEMALE;
        }
    }
    private Peers.OutPeer outPeer;
    private String name;
    private String nick;
    private String about;
    private Sex sex;
    private String language;
    private String timeZone;

    public User(Peers.OutPeer outPeer, String name, String nick, Sex sex, String about, String language, String timeZone) {
        this.outPeer = outPeer;
        this.name = name;
        this.nick = nick;
        this.about = about;
        this.language = language;
        this.timeZone = timeZone;
    }

    public Peers.OutPeer getOutPeer() {
        return outPeer;
    }

    public String getName() {
        return name;
    }

    public String getNick() {
        return nick;
    }

    public String getAbout() {
        return about;
    }

    public String getLanguage() {
        return language;
    }

    public String getTimeZone() {
        return timeZone;
    }
}
