package com.LLD.factory.version3;

public class PostGreDatabase implements Database {
    @Override
    public DatabaseFactory createDatabaseFactory() {
        return new PostGreDBFactory();
    }
}
