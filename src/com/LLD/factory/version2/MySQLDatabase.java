package com.LLD.factory.version2;

public class MySQLDatabase implements Database {
    @Override
    public Query createQuery() {
        return new MySQLQuery();
    }
}
