package com.LLD.factory.version3;

public class MySQLDBFactory implements DatabaseFactory{
    @Override
    public Query createQuery() {
        return new MySQLQuery();
    }
}
