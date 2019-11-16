package com.example.answerme;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class FirebaseManager extends AppCompatActivity {


    private final FirebaseDatabase firebaseDatabase;
    private final DatabaseReference databaseReference;
    private String res = "";
    private String email = "";
    private String country = "";
    private String province = "";
    private String name = "";
    private Long points = 0L;
    private Long role = 1L;
    private boolean blocked = false;
    private String password = "";

    public FirebaseManager() {
        // Inicializando Firebase DB
        FirebaseApp.initializeApp(this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
    }

    public void registerUser(User user) {
        try {
            databaseReference.child("USUARIO").child(user.getUserName()).setValue(user);
        } catch (DatabaseException ex) {
            Toast.makeText(this, "Ha ocurrido un error en el sistema", Toast.LENGTH_SHORT);
        }
    }



    public String loginUser(String username, String password) {
        String passwordAux = getPassword(username);

        if (passwordAux.equals(password)) {
            res = username;
        } else {

        }
        return res;
    }



    public User getUser (String username) {
        User user = new User();

        user.setName(getName(username));
        user.setUserName(username);
        user.setEmail(getEmail(username));
        user.setPassword(getPassword(username));
        user.setCountry(getCountry(username));
        user.setProvince(getProvince(username));
        user.setPoints(getPoints(username));
        user.setRole(getRole(username));
        user.setBlocked(getBlocked(username));

        return user;
    }

    private boolean getBlocked(String username) {
        DatabaseReference ref = firebaseDatabase.getReference("/USUARIO/"
                + username + "/blocked");

        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                blocked = (boolean) dataSnapshot.getValue();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {}
        });
        return blocked;
    }

    public String getName (String username) {
        DatabaseReference ref = firebaseDatabase.getReference("/USUARIO/"
                + username + "/name");

        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                name = String.valueOf(dataSnapshot.getValue());
                System.out.println(name);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {}
        });
        return name;
    }

    public String getPassword (String username) {
        DatabaseReference ref = firebaseDatabase.getReference("/USUARIO/"
                + username + "/password");

        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                password = String.valueOf(dataSnapshot.getValue());
                System.out.println(password);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {}
        });
        return password;
    }

    public String getEmail (String username) {
        DatabaseReference ref = firebaseDatabase.getReference("/USUARIO/"
                + username + "/email");

        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                email = String.valueOf(dataSnapshot.getValue());
                System.out.println(email);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {}
        });
        return email;
    }

    public String getCountry (String username) {
        DatabaseReference ref = firebaseDatabase.getReference("/USUARIO/"
                + username + "/country");

        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                country = String.valueOf(dataSnapshot.getValue());
                System.out.println(country);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {}
        });
        return country;
    }

    public String getProvince (String username) {
        DatabaseReference ref = firebaseDatabase.getReference("/USUARIO/"
                + username + "/province");

        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                province = String.valueOf(dataSnapshot.getValue());
                System.out.println(province);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {}
        });
        return province;
    }

    public Long getRole (String username) {
        DatabaseReference ref = firebaseDatabase.getReference("/USUARIO/"
                + username + "/role");

        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                role = (Long) dataSnapshot.getValue();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {}
        });
        return role;
    }

    public Long getPoints (String username) {
        DatabaseReference ref = firebaseDatabase.getReference("/USUARIO/"
                + username + "/points");

        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                points = (Long) dataSnapshot.getValue();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {}
        });
        return points;
    }

}
