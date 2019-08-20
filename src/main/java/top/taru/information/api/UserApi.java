package top.taru.information.api;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import top.taru.information.entity.User;
import top.taru.information.vo.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "api/users")
public class UserApi {

    static Map<String, User> users = Collections.synchronizedMap(new HashMap<String, User>());

    public JsonResult getUser(){
        JsonResult result=null;


        return result;
    }

        @RequestMapping(value="/", method= RequestMethod.POST)
        public JsonResult postUser(@ModelAttribute User user) {
            JsonResult result=null;

            // 处理"/users/"的POST请求，用来创建User
            // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
            System.out.println(user);
            //users.put(user.getUser_id(), user);
            result=new JsonResult("200","test",null);
            return result;
        }

    public JsonResult deleteUser(){
        JsonResult result=null;

        return result;
    }

    public JsonResult getUserList(){
        JsonResult result=null;


        return result;
    }
}
