package com.codecool.sportSite.Service;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@Service
public class NewsService {
    private final String url = "https://newsapi.org/v2/top-headlines?sources=bbc-sport&apiKey=81ae151ea996440ba155436c41d1174f";
    public Map<String, String> makeUrl() throws IOException{
        System.setProperty("http.agent", "Chrome");
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER, true);
        Map<String, String> myMap = mapper.readValue(new URL(url), HashMap.class);
        return myMap;
    }
}
