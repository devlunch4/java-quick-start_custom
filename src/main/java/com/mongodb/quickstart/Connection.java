package com.mongodb.quickstart;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class Connection {

    public static void main(String[] args) {
        String connectionString = System.getProperty("mongodb.uri");
                //mongodb+srv://java:<password>@cluster0.qcj0s.mongodb.net/myFirstDatabase?retryWrites=true&w=majority
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            List<Document> databases = mongoClient.listDatabases().into(new ArrayList<>());
            databases.forEach(db -> System.out.println(db.toJson()));
        }
    }
    // todo Test
    // https://vscode.dev/github/devlunch4/java-quick-start_custom
}
