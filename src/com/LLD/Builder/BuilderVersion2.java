//package com.LLD.Builder;
//
//public class BuilderVersion2 {
//    public int getAge() {
//        return age;
//    }
//
//    public String getfName() {
//        return fName;
//    }
//
//    public String getlName() {
//        return lName;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public double getPsp() {
//        return psp;
//    }
//
//    public double getWeight() {
//        return weight;
//    }
//
//    private int age;
//    private String fName;
//
//    private String lName;
//    private String gender;
//
//    private double psp;
//    private double weight;
//
//    public BuilderVersion2(){
//
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setfName(String fName) {
//        this.fName = fName;
//    }
//
//    public void setlName(String lName) {
//        this.lName = lName;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public void setPsp(double psp) {
//        this.psp = psp;
//    }
//
//    public void setWeight(double weight) {
//        this.weight = weight;
//    }
//
//    public Student build(){
//        return null;// We need Student object here but Student constructor is private, if something is private then
//        //it will be visible within in the same class so we need Builder class inside Student class i.e. Inner Class
//    }
//}
