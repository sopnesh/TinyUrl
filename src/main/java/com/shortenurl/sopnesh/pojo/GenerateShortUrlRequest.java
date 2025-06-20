package com.shortenurl.sopnesh.pojo;

public class GenerateShortUrlRequest {

    String originalUrl;

    //TODO - use lombok
    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }
}
