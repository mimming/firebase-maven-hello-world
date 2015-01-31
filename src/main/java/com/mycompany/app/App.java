package com.mycompany.app;

import com.firebase.client.Firebase;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Firebase myFirebaseRef = new Firebase("https://dinosaurs.firebaseio.com/");
        myFirebaseRef.child("dinosaurs").setValue("are cool");
    }
}
