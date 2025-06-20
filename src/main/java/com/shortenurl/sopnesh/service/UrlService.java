package com.shortenurl.sopnesh.service;

import com.shortenurl.sopnesh.pojo.GenerateShortUrlRequest;
import com.shortenurl.sopnesh.pojo.entity.UrlDetails;
import com.shortenurl.sopnesh.repository.UrlRepoitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// TODO - check for logs class
@Service
public class UrlService {

    //TODO - validate request

    //TODO - check for alias
    //TODO - check for provided expired date

    @Autowired
    public UrlRepoitory urlRepoitory;

    public void createShortUrl(GenerateShortUrlRequest generateShortUrlRequest){

        UrlDetails urlDetails = new UrlDetails();
        //TODO - add business logic.
        urlRepoitory.save(urlDetails);
    }


}
