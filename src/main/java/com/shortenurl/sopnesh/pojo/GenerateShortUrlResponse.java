package com.shortenurl.sopnesh.pojo;

public class GenerateShortUrlResponse {

    //TODO - use lombok
    String originalUrl;
    String shortUrl;

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String shortUrl() {
        return shortUrl;
    }

    public GenerateShortUrlResponse setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
        return this;
    }
}
