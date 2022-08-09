package com.example.demolog4j.service;

import com.example.demolog4j.controller.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Service
public class ServiceIml implements Servicef{
    private final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Override
    public void testScheduled() {
        logger.info("hi there");
    }
//
//    public void saveFile(MultipartFile multipartFile) {
//        String url = "E:\\Work\\Demo\\demolog4j\\src\\main\\java\\com\\example\\demolog4j\\model\\img";
//        multipartFile.transferTo(1);
//    }
}
