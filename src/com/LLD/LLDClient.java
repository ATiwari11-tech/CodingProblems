//Design a User system of any online learning platform
//Users->Student, Instructor
//Common property they can have is -> Name, Age
//Common behavior without which they can't use learning platform -> login()
//There can be more specific property and behaviors of every other user

package com.LLD;

class Users {
    int age;
    String userName;
    String password;
    String displayId;
    String displayPicUrl;
    public void login(){
        System.out.println("User logging In");
    }
}
class Instructor extends Users{
    void cancelClass(){
        System.out.println("Cancel Class");
    }
    void rescheduleClass(){
        System.out.println("Reschedule Class");
    }

    void scheduleClass(){
        System.out.println("Schedule Class");
    }
}

class Student extends Users{
    double psp;
    void pauseCourse(){
        System.out.println("Pausing Course");
    }
    void changeBatch(){
        System.out.println("Changing Batch");
    }

}

class Mentor extends Users{
    void provideFeedback(){
     System.out.println("Providing Feedback");
    }
}

public class LLDClient
{
    public static void main(String args[]){
//        Student s1 = new Student();//Valid
        Users u1 = new Student();//Valid because Student IS A User but Not Every User IS A Student
//        s1.userName = "Abhishek";
//        s1.password = "abc123";
//        s1.psp=5.0;
//        s1.displayId="Abhi_T";
//        s1.login();
//        s1.pauseCourse();
        u1.userName = "Abhishek";
        u1.password = "abc123";
        //u1.psp=5.0;//Not Allowed because it's of type Student
        u1.displayId="Abhi_T";
        u1.login();
//        u1.pauseCourse();
        Instructor i = new Instructor();
        i.userName="Pratik";
        i.password="tef123";
        i.displayId="Pratik";
        i.login();
        i.scheduleClass();
        i.cancelClass();
        i.rescheduleClass();
        Mentor m = new Mentor();
        m.userName="Akhil";
        m.password="t1245";
        m.displayId="Akk";
        m.login();
        m.provideFeedback();
    }
}


