package com.LLD.factory.version1;

public class Client {
    public static void main(String args[]){
        Database db;//this will come from different implementation class
        Query q;
        if(db instanceof  PostGreDatabase){//Violates SRP and OCP
            q = new PostGreQuery();
        }
        else if(db instanceof MySQLDatabase){
            q = new MySQLQuery();
        }
    }
}
