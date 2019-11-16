package com.example.answerme;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Profile extends AppCompatActivity {

    @BindView(R.id.user_name)
    TextView userName;
    @BindView(R.id.user_email)
    TextView userEmail;
    @BindView(R.id.user_country)
    TextView userCountry;
    @BindView(R.id.user_province)
    TextView userProvince;
    @BindView(R.id.user_role)
    TextView userRole;
    @BindView(R.id.user_points)
    TextView userPoints;
    @BindView(R.id.user_username)
    TextView userUsername;
    private User user;

    private FirebaseManager firebaseManager = new FirebaseManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ButterKnife.bind(this);

        Intent incomeIntent = getIntent();

        // METER EN UN HILO
        user = firebaseManager.getUser(incomeIntent.getStringExtra("username"));

        userUsername.setText(user.getUserName());
        userName.setText(user.getName());
        userEmail.setText(user.getEmail());
        userCountry.setText(user.getCountry());
        userProvince.setText(user.getProvince());
        userPoints.setText(String.valueOf(user.getPoints()));
        userRole.setText(String.valueOf(user.getRole()));

    }
}
