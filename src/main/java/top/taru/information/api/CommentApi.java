package top.taru.information.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.taru.information.vo.JsonResult;

    @RestController
    @RequestMapping(value = "/api/songs")
    public class CommentApi {

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
