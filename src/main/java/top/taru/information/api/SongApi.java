package top.taru.information.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.taru.information.entity.Song;
import top.taru.information.service.SongService;
import top.taru.information.vo.JsonResult;

@RestController
    @RequestMapping(value = "/api/songs")
    public class SongApi {
    @Autowired
    SongService songService;
        public JsonResult postSong(){
            JsonResult result=null;

            return result;
        }

    /**
     * 添加歌曲
     * @param song
     * @return
     */
    @PostMapping(value = "/")
        public JsonResult postSong(@MatrixVariable  Song song){
            JsonResult result=null;
        songService.postSong(song);
            return result;
        }
    @GetMapping(value = "/")
    public JsonResult getSong(@MatrixVariable  Song song){
        JsonResult result=null;
        songService.postSong(song);
        return result;
    }
}
