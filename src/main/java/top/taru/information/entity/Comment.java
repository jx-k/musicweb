package top.taru.information.entity;

/**
 * 评论实体
 */
public class Comment {
    private Integer commentId;
    private String commentContent;
    private String commentUserid;
    private Integer commentFather;
    private String commentDatetime;
    private Integer commentNumber;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCommentUserid() {
        return commentUserid;
    }

    public void setCommentUserid(String commentUserid) {
        this.commentUserid = commentUserid;
    }

    public Integer getCommentFather() {
        return commentFather;
    }

    public void setCommentFather(Integer commentFather) {
        this.commentFather = commentFather;
    }

    public String getCommentDatetime() {
        return commentDatetime;
    }

    public void setCommentDatetime(String commentDatetime) {
        this.commentDatetime = commentDatetime;
    }

    public Integer getCommentNumber() {
        return commentNumber;
    }

    public void setCommentNumber(Integer commentNumber) {
        this.commentNumber = commentNumber;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", commentContent='" + commentContent + '\'' +
                ", commentUserid='" + commentUserid + '\'' +
                ", commentFather=" + commentFather +
                ", commentDatetime='" + commentDatetime + '\'' +
                ", commentNumber=" + commentNumber +
                '}';
    }


}
