package com.taotao.task;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * author: wumiaogong
 * time: 16/12/16.
 */
@Component("AbController")
@EnableScheduling
public class AbController {

//    public static void main(String[] args) {
//        test();
//    }
    @Scheduled(cron = "0/3 * * * * ?")
    public static void test(){
        System.out.println("===========进来了。。。");
        System.out.println(new Date());
    }
}
