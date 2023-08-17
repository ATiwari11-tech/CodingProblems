package com.LLD.factory.version3;

public class PostGreDBFactory implements DatabaseFactory{
    @Override
    public Query createQuery() {
        return new PostGreQuery();
    }
}
