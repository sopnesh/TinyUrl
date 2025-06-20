package com.shortenurl.sopnesh.controller;

import com.shortenurl.sopnesh.pojo.GenerateShortUrlRequest;
import com.shortenurl.sopnesh.pojo.GenerateShortUrlResponse;
import com.shortenurl.sopnesh.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class UrlController {

    @Autowired
    UrlService urlService;

    @GetMapping("/{hash}")
    //TODO - Check use of ResponseEntity
    public void retrieveOriginalUrl(@PathVariable String hash){


    }

    @PostMapping("/shorturl")
    public GenerateShortUrlResponse createShortUrl(@RequestBody GenerateShortUrlRequest request){

        urlService.createShortUrl(request);
        //TODO - check between responseEntity and Redirect View
        return null;

    }


}
