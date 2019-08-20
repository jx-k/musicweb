package top.taru.information.dao;

import org.apache.ibatis.annotations.Mapper;
import top.taru.information.entity.Song;

@Mapper
public interface SongDao {
   Integer postSong(Song song);
}
