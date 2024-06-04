package org.example;

public class Main {
    public static void main(String[] args) {

        var session = Database.getSessionFactory();
        session.getSchemaManager().exportMappedObjects(true);

    }
}