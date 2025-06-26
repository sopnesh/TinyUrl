package com.shortenurl.sopnesh.controller;

import com.shortenurl.sopnesh.pojo.GenerateShortUrlRequest;
import com.shortenurl.sopnesh.pojo.GenerateShortUrlResponse;
import com.shortenurl.sopnesh.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping("/")
public class UrlController {

    @Autowired
    UrlService urlService;

    @GetMapping("/{hash}")
    //TODO - Check use of ResponseEntity
    public RedirectView retrieveOriginalUrl(@PathVariable String hash){
        String originalUrl = urlService.retrieveOriginalUrl(hash);
        return new RedirectView(originalUrl);

    }

    @PostMapping("/shorturl")
    public GenerateShortUrlResponse createShortUrl(@RequestBody GenerateShortUrlRequest request){

        urlService.createShortUrl(request);
        //TODO - check between responseEntity and Redirect View
        return null;

    }


}
