package com.kob.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RestController

@RequestMapping("/pk/")
public class BotInfoController {
    @RequestMapping("getbotinfo/")

    public List<Map<String,String>> getBotInfo(){
        List<Map<String,String>> list = new LinkedList<>();
        Map<String, String> bot1 = new HashMap<>();
        bot1.put("name", "trigger");
        bot1.put("rateing", "1500");

        Map<String, String> bot2 = new HashMap<>();
        bot2.put("name", "apple");
        bot2.put("rateing", "1600");

        Map<String, String> bot3 = new HashMap<>();
        bot3.put("name", "orange");
        bot3.put("rateing", "1700");

        list.add(bot1);
        list.add(bot2);
        list.add(bot3);

        return list;
    }
}
