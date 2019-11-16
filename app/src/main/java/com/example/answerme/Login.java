package com.example.answerme;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseException;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class Login extends AppCompatActivity {

    @BindView(R.id.userLoginField)
    AppCompatEditText userLoginField;
    @BindView(R.id.passwordLoginField)
    AppCompatEditText passwordLoginField;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    FirebaseManager firebaseManager = new FirebaseManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        // Inicializando Firebase DB
        FirebaseApp.initializeApp(this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();


    }

    @OnClick({R.id.registerButton, R.id.loginButton})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.registerButton:
                Intent i = new Intent(Login.this, Register.class);
                startActivity(i);
                break;
            case R.id.loginButton:
                if ((firebaseManager.loginUser(userLoginField.getText().toString(),
                        passwordLoginField.getText().toString())).length() != 0) {
                    Intent intent = new Intent(Login.this, Profile.class);
                    intent.putExtra("username", userLoginField.getText().toString());
                    startActivity(intent);
                }
                break;
        }
    }
}
