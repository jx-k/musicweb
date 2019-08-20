package top.taru.information.entity;

/**
 * 歌单实体
 */
public class SongList {
    private String songlistId;
    private String songlistName;
    private String songlistDescribe;
    private String songlistFound;
    private String songlistPhoto;
    private String songlistTime;
    private Integer songlistCollect;
    private Integer songlistPlayNumber;
    private Integer songlistReprint;

    public String getSonglistId() {
        return songlistId;
    }

    public void setSonglistId(String songlistId) {
        this.songlistId = songlistId;
    }

    public String getSonglistName() {
        return songlistName;
    }

    public void setSonglistName(String songlistName) {
        this.songlistName = songlistName;
    }

    public String getSonglistDescribe() {
        return songlistDescribe;
    }

    public void setSonglistDescribe(String songlistDescribe) {
        this.songlistDescribe = songlistDescribe;
    }

    public String getSonglistFound() {
        return songlistFound;
    }

    public void setSonglistFound(String songlistFound) {
        this.songlistFound = songlistFound;
    }

    public String getSonglistPhoto() {
        return songlistPhoto;
    }

    public void setSonglistPhoto(String songlistPhoto) {
        this.songlistPhoto = songlistPhoto;
    }

    public String getSonglistTime() {
        return songlistTime;
    }

    public void setSonglistTime(String songlistTime) {
        this.songlistTime = songlistTime;
    }

    public Integer getSonglistCollect() {
        return songlistCollect;
    }

    public void setSonglistCollect(Integer songlistCollect) {
        this.songlistCollect = songlistCollect;
    }

    public Integer getSonglistPlayNumber() {
        return songlistPlayNumber;
    }

    public void setSonglistPlayNumber(Integer songlistPlayNumber) {
        this.songlistPlayNumber = songlistPlayNumber;
    }

    public Integer getSonglistReprint() {
        return songlistReprint;
    }

    public void setSonglistReprint(Integer songlistReprint) {
        this.songlistReprint = songlistReprint;
    }

    @Override
    public String toString() {
        return "SongList{" +
                "songlistId='" + songlistId + '\'' +
                ", songlistName='" + songlistName + '\'' +
                ", songlistDescribe='" + songlistDescribe + '\'' +
                ", songlistFound='" + songlistFound + '\'' +
                ", songlistPhoto='" + songlistPhoto + '\'' +
                ", songlistTime='" + songlistTime + '\'' +
                ", songlistCollect=" + songlistCollect +
                ", songlistPlayNumber=" + songlistPlayNumber +
                ", songlistReprint=" + songlistReprint +
                '}';
    }



}
