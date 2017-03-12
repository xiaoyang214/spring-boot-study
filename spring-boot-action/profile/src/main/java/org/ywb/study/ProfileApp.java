package org.ywb.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/3/12.
 */
@SpringBootApplication
@RestController
public class ProfileApp {

    @RequestMapping(value = "/index")
    public String index(){
        return "hello profile";
    }

    public static void main(String[] args) {
        SpringApplication.run(ProfileApp.class, args);
    }
}
