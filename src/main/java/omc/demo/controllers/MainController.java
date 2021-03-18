package omc.demo.controllers;


import omc.demo.classes.Cache;
import omc.demo.classes.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class MainController {
    Cache userCache = new Cache();
    User user = new User("4");



    @GetMapping("/get-user-data")
    @ResponseBody
    public String UserData(@RequestParam String id) throws InterruptedException {
            if (userCache.get(id) == null){
                userCache.keySet(id, user.getDataSlow());
            }
            return userCache.get(id);
    }


}


