package com.LLD.factory.version2;

public class PostGreDatabase implements Database {
    @Override
    public Query createQuery() {
        return new PostGreQuery();
    }
}
