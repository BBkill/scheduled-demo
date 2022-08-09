package com.example.demolog4j.controller;

import com.example.demolog4j.service.Servicef;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/test")
public class Controller {

    private final Servicef servicef;

    @Autowired
    public Controller(Servicef servicef) {
        this.servicef = servicef;
    }

    @GetMapping
    //@Scheduled(cron = "1 * * * * *")
    @Scheduled(fixedRate = 1000)
    public void test() {
        servicef.testScheduled();
    }


//    @PostMapping(value = "/uploadFile")
//    public String submit(@RequestParam("file") MultipartFile file) {
//
//        return "fileUploadView";
//    }
}
