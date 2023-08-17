package com.LLD.factory.version3;

public class MySQLDatabase implements Database {

    @Override
    public DatabaseFactory createDatabaseFactory() {
        return new MySQLDBFactory();
    }
}
