package top.taru.information.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.taru.information.dao.SongDao;
import top.taru.information.entity.Song;
import top.taru.information.service.SongService;
@Service
public class SongImpl implements SongService {
    @Autowired
    SongDao songDao;
     public Integer postSong(Song song){
    return    songDao.postSong(song);
   };
}
