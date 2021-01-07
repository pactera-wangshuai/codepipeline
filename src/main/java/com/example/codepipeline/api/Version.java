package com.example.codepipeline.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * version
 *
 * @author Pactera WangShuai
 * @date 2021/1/7 11:06
 */
@RestController
public class Version {
    @Value("${spring.profiles.active}")
    private String active;
    @Value("${name}")
    private String name;
    @Value("${version}")
    private String version;


    @GetMapping("/")
    public String version() {
        return String.format("Name=>%s:%s Version=>%s Now=>%s", name, active, version, LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}
