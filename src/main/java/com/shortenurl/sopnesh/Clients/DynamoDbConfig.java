//package com.shortenurl.sopnesh.Clients;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;
//import software.amazon.awssdk.regions.Region;
//import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
//
////Note - if we don't use Configuration, @Bean will return new instance each time.
////@Configuration
//public class DynamoDbConfig {
//
//    @Bean
//    //todo - check use of dynamodb enhanced client
//    public DynamoDbClient dynamoDbClient(){
//        return DynamoDbClient.builder()
//                .region(Region.US_WEST_2)
//                .build();
//        //todo - this app can be defined in multiple regions
//        //todo - check what would be region in that case.
//    }
//
//    @Bean
//    public DynamoDbEnhancedClient dynamoDbEnhancedClient(DynamoDbClient dynamoDbClient) {
//        return DynamoDbEnhancedClient.builder()
//                .dynamoDbClient(dynamoDbClient)
//                .build();
//    }
//}
