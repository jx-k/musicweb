package top.taru.information.entity;

/**
 * 用户实体
 */
public class User {
    private String userId;
    private String userUsername;
    private String userPassword;
    private String userName;
    private String userTelphone;
    private String userSex;
    private String userAddress;
    private String userBird;
    private Integer userMessages;
    private String userChatmessages;
    private Integer userInfore;
    private Integer userComment;
    private String userDescribe;
    private String userStatus;

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserTelphone() {
        return userTelphone;
    }

    public void setUserTelphone(String userTelphone) {
        this.userTelphone = userTelphone;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserBird() {
        return userBird;
    }

    public void setUserBird(String userBird) {
        this.userBird = userBird;
    }

    public Integer getUserMessages() {
        return userMessages;
    }

    public void setUserMessages(Integer userMessages) {
        this.userMessages = userMessages;
    }

    public String getUserChatmessages() {
        return userChatmessages;
    }

    public void setUserChatmessages(String userChatmessages) {
        this.userChatmessages = userChatmessages;
    }

    public Integer getUserInfore() {
        return userInfore;
    }

    public void setUserInfore(Integer userInfore) {
        this.userInfore = userInfore;
    }

    public Integer getUserComment() {
        return userComment;
    }

    public void setUserComment(Integer userComment) {
        this.userComment = userComment;
    }

    public String getUserDescribe() {
        return userDescribe;
    }

    public void setUserDescribe(String userDescribe) {
        this.userDescribe = userDescribe;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userUsername='" + userUsername + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userName='" + userName + '\'' +
                ", userTelphone='" + userTelphone + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userBird='" + userBird + '\'' +
                ", userMessages=" + userMessages +
                ", userChatmessages='" + userChatmessages + '\'' +
                ", userInfore=" + userInfore +
                ", userComment=" + userComment +
                ", userDescribe='" + userDescribe + '\'' +
                ", userStatus='" + userStatus + '\'' +
                '}';
    }


}