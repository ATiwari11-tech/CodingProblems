package com.LLD.Builder;

import javax.naming.directory.InvalidAttributesException;

public class Student {//Class should be immutable i.e.class shouldn't have setter method
    private int age;
    private String fName;
    private String lName;
    private String gender;

    private double psp;
    private double weight;

    private Student(Builder builder){//this was public before in Version1 and Version2
        this.age = builder.getAge();
        this.fName = builder.getfName();
        this.lName = builder.getlName();
        this.weight = builder.getWeight();
        this.psp = builder.getPsp();
    }

    public boolean validate(){
        if(fName.length() + lName.length() <= 5)//Sample validation logic
            return false;
        return true;
    }


    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder {
        public int getAge() {
            return age;
        }

        public String getfName() {
            return fName;
        }

        public String getlName() {
            return lName;
        }

        public String getGender() {
            return gender;
        }

        public double getPsp() {
            return psp;
        }

        public double getWeight() {
            return weight;
        }

        private int age;
        private String fName;

        private String lName;
        private String gender;

        private double psp;
        private double weight;

        public Builder() {

        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setfName(String fName) {
            this.fName = fName;
            return this;
        }

        public Builder setlName(String lName) {
            this.lName = lName;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }
        public Student build() {
            //return null;// We need Student object here but Student constructor is private, if something is private then
            //it will be visible within in the same class so we need Builder class inside Student class i.e. Inner Class
            //Now code should be as below
//        if(!validate())
//            throw new InvalidAttributesException();
            return new Student(this);//what does the constructor of Student expect, builder class so pass this
        }
    }
    }
