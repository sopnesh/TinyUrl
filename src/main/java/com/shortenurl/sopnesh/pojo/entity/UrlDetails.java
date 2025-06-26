package com.shortenurl.sopnesh.pojo.entity;

//import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
//import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;

//TODO - use lombok
//@DynamoDbBean
public class UrlDetails {

    //TODO - change to numeric
    private String id;
    private String shortUrl;
    private String longUrl;
    private Instant createdAt;
    private LocalDate expiryDate;

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

//    @DynamoDbPartitionKey
    //TODO - check auto generation techniques
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLongUrl() {
        return longUrl;
    }

    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
}
