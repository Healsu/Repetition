//This is what we call our "parent class" which is where we will extend from.
public class mailInfo {
    //We have our attributes
    private String mailType;
    private String userMail;

    //And our constructor (You cant extend withouth a constructor, or else it doesnt know the information
    // for the attributes)
    public mailInfo(String mailType, String userMail) {
        this.mailType = mailType;
        this.userMail = userMail;
    }

    public String getMailType() {
        return mailType;
    }
    public void setMailType(String mailType) {
        this.mailType = mailType;
    }
    public String getUserMail() {
        return userMail;
    }
    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }
}
