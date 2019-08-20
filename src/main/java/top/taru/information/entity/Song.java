package top.taru.information.entity;

/**
 * 歌曲实体
 */
public class Song {

    private String songId;
    private String songName;
    private String songSonger;
    private String songUploadUser;
    private String songPhoto;
    private String songPlace;
    private String songTime;
    private String songLrc;
    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongSonger() {
        return songSonger;
    }

    public void setSongSonger(String songSonger) {
        this.songSonger = songSonger;
    }

    public String getSongUploadUser() {
        return songUploadUser;
    }

    public void setSongUploadUser(String songUploadUser) {
        this.songUploadUser = songUploadUser;
    }

    public String getSongPhoto() {
        return songPhoto;
    }

    public void setSongPhoto(String songPhoto) {
        this.songPhoto = songPhoto;
    }

    public String getSongPlace() {
        return songPlace;
    }

    public void setSongPlace(String songPlace) {
        this.songPlace = songPlace;
    }

    public String getSongTime() {
        return songTime;
    }

    public void setSongTime(String songTime) {
        this.songTime = songTime;
    }

    public String getSongLrc() {
        return songLrc;
    }

    public void setSongLrc(String songLrc) {
        this.songLrc = songLrc;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songId='" + songId + '\'' +
                ", songName='" + songName + '\'' +
                ", songSonger='" + songSonger + '\'' +
                ", songUploadUser='" + songUploadUser + '\'' +
                ", songPhoto='" + songPhoto + '\'' +
                ", songPlace='" + songPlace + '\'' +
                ", songTime='" + songTime + '\'' +
                ", songLrc='" + songLrc + '\'' +
                '}';
    }


}
