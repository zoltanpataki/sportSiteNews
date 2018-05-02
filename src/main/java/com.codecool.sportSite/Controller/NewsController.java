package com.codecool.sportSite.Controller;

import com.codecool.sportSite.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class NewsController {

    @Autowired
    NewsService newsService;

    @GetMapping(value = "new-news")
    public ResponseEntity getNews() throws IOException{
        return new ResponseEntity<>(newsService.makeUrl(), HttpStatus.OK);
    }
}
