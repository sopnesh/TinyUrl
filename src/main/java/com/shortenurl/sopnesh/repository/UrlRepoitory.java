package com.shortenurl.sopnesh.repository;

import com.shortenurl.sopnesh.pojo.entity.UrlDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbTable;
import software.amazon.awssdk.enhanced.dynamodb.TableSchema;

@Repository
public class UrlRepoitory {

    //TODO change name of the table.
    private final DynamoDbTable<UrlDetails> urlTable;

    public UrlRepoitory(DynamoDbEnhancedClient enhancedClient){
        this.urlTable = enhancedClient.table("UrlDetails", TableSchema.fromBean(UrlDetails.class));
        try{
            urlTable.createTable();
        } catch (Exception e) {
            //TODO - throw exception in a better way.
            throw new RuntimeException(e);
        }
    }

    public void save(UrlDetails user) {
        urlTable.putItem(user);
    }


}
