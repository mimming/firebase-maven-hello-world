package com.mycompany.app;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        Firebase myFirebaseRef = new Firebase("https://dinosaurs.firebaseio.com/");

        myFirebaseRef.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(DataSnapshot snapshot) {
                System.out.println(snapshot.getValue()); 
            }

            @Override
            public void onCancelled(FirebaseError error) {
            }

        });

        myFirebaseRef.child("dinosaurs").setValue("are neat");

        
        // Give it 5 seconds to execute, since they're running on deamon threads
        Thread.sleep(5 * 1000);
    }
}
