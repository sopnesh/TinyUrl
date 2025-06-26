package com.shortenurl.sopnesh.service;

import com.shortenurl.sopnesh.pojo.GenerateShortUrlRequest;
import com.shortenurl.sopnesh.pojo.entity.UrlDetails;
//import com.shortenurl.sopnesh.repository.UrlRepoitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

// TODO - check for logs class
@Service
public class UrlService {

    //TODO - validate request

    //TODO - check for alias
    //TODO - check for provided expired date

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int LENGTH = 8;
    private static final SecureRandom random = new SecureRandom();


//    @Autowired
//    public UrlRepoitory urlRepoitory;

    private static Map<String, String> urlMapping = new HashMap<>();

    private static String generateRandomAlphanumeric() {
        StringBuilder sb = new StringBuilder(LENGTH);
        for (int i = 0; i < LENGTH; i++) {
            int index = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(index));
        }
        return sb.toString();
    }

    public void createShortUrl(GenerateShortUrlRequest generateShortUrlRequest){

        UrlDetails urlDetails = new UrlDetails();
        String shortUrl = generateRandomAlphanumeric();
        urlMapping.put(shortUrl, generateShortUrlRequest.getOriginalUrl());
        //TODO - add business logic.

//        urlRepoitory.save(urlDetails);
    }

    public String retrieveOriginalUrl(String shortUrl){
        return urlMapping.get(shortUrl);
    }




}
