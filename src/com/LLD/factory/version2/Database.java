package com.LLD.factory.version2;

public interface Database {
    Query createQuery();

    //Create Connection
    //Create Transaction
    //CreateSecurityyLater

    //Doing all above violates SRP i.e. too many responsibilities which breaks 'I' also which states segregate
    //interfaces or divide responsibilities
    //Need Version3
}
