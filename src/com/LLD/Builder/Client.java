package com.LLD.Builder;

public class Client {
    public static void main(String args[]){

        //Version1
//        Builder builder = new Builder();
//        builder.setAge(32);
//        builder.setfName("Naman");
//        builder.setlName("Shukla");
//        builder.setPsp(91.23);
//        builder.setWeight(68.95);
//
//        Student student = new Student(builder);

        //Version2
//        Builder builder = Student.getBuilder();
//        builder.setAge(32);
//        builder.setfName("Naman");
//        builder.setlName("Shukla");
//        builder.setPsp(91.23);
//        builder.setWeight(68.95);
//
//        Student student = new Student(builder);//this is good but problem is if null is passed here then there will be
        //run time exception, one option is to create private constructor  but then how to access getter and setter methods
        //with a new object so we need version3

        //Version3
//        Student.Builder builder = Student.getBuilder();
//        builder.setAge(32);
//        builder.setfName("Naman");
//        builder.setlName("Shukla");
//        builder.setPsp(91.23);
//        builder.setWeight(68.95);
//
//        Student student = builder.build();// but now there is no possibility that null will be passed

        //Version 4
        Student student = Student.getBuilder()//production level code
                .setAge(32)
                .setfName("Naman")
                .setlName("Shukla")
                .setPsp(78.89)
                .setWeight(68.90)
                .build();//Now Builder class is completely responsible for creating objects(build Students) and validation also
    }
}
