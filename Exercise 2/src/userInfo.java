public class userInfo extends mailInfo{
    private String userName;
    private String userPassword;

    //We set up the constructor with the additional information from the extended class
    public userInfo(String mailType, String userMail, String userName, String userPassword) {
        //We set up a super to refer to the object of the parent class
        super(mailType, userMail);
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "userInfo{" +
                "userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}
