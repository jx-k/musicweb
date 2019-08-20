package top.taru.information.entity;

public class User {
    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", user_username='" + user_username + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_telphone='" + user_telphone + '\'' +
                ", user_sex='" + user_sex + '\'' +
                ", user_address='" + user_address + '\'' +
                ", user_bird='" + user_bird + '\'' +
                ", user_messages=" + user_messages +
                ", user_chatmessages='" + user_chatmessages + '\'' +
                ", user_infore=" + user_infore +
                ", user_comment=" + user_comment +
                ", user_describe='" + user_describe + '\'' +
                ", user_status='" + user_status + '\'' +
                '}';
    }

    private String user_id;
    private String user_username;
    private String user_password;
    private String user_name;
    private String user_telphone;
    private String user_sex;
    private String user_address;
    private String user_bird;
    private Integer user_messages;
    private String user_chatmessages;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_username() {
        return user_username;
    }

    public void setUser_username(String user_username) {
        this.user_username = user_username;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_telphone() {
        return user_telphone;
    }

    public void setUser_telphone(String user_telphone) {
        this.user_telphone = user_telphone;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public String getUser_bird() {
        return user_bird;
    }

    public void setUser_bird(String user_bird) {
        this.user_bird = user_bird;
    }

    public Integer getUser_messages() {
        return user_messages;
    }

    public void setUser_messages(Integer user_messages) {
        this.user_messages = user_messages;
    }

    public String getUser_chatmessages() {
        return user_chatmessages;
    }

    public void setUser_chatmessages(String user_chatmessages) {
        this.user_chatmessages = user_chatmessages;
    }

    public Integer getUser_infore() {
        return user_infore;
    }

    public void setUser_infore(Integer user_infore) {
        this.user_infore = user_infore;
    }

    public Integer getUser_comment() {
        return user_comment;
    }

    public void setUser_comment(Integer user_comment) {
        this.user_comment = user_comment;
    }

    public String getUser_describe() {
        return user_describe;
    }

    public void setUser_describe(String user_describe) {
        this.user_describe = user_describe;
    }

    public String getUser_status() {
        return user_status;
    }

    public void setUser_status(String user_status) {
        this.user_status = user_status;
    }

    private Integer user_infore;
    private Integer user_comment;
    private String user_describe;
    private String user_status;
}