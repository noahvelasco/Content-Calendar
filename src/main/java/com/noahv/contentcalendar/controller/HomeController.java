package com.noahv.contentcalendar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.noahv.contentcalendar.config.ContentCalendarProperties;

@RestController
public class HomeController {

    private final ContentCalendarProperties properties;

    public HomeController(ContentCalendarProperties properties) {
        this.properties = properties;
    }

    @GetMapping("/")
    public ContentCalendarProperties home() {
        return properties;
    }

}
