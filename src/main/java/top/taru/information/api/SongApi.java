package top.taru.information.api;

import top.taru.information.vo.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    @RequestMapping(value = "/api/songs")
    public class SongApi {

        public JsonResult postSong(){
            JsonResult result=null;

            return result;
        }

        public JsonResult getSongs(){
            JsonResult result=null;

            return result;
        }

        public JsonResult getSong(){
            JsonResult result=null;

            return result;
        }
}
