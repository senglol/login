package com.example.user.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class user extends AppCompatActivity {
    private FirebaseAuth firebaseAuth;
    private Button p1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        p1=findViewById(R.id.profile);
        firebaseAuth = FirebaseAuth.getInstance();
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(user.this,Profile_activity.class));
            }
        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.logout,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.LogoutMenu:{
                firebaseAuth.signOut();
                startActivity(new Intent(user.this,MainActivity.class));
                finish();
                break;
            }
            case R.id.ProfileMenu:{
                startActivity(new Intent(user.this,Profile_activity.class));
                break;
            }
            case R.id.Announcement:{
                startActivity(new Intent(user.this,Announcement.class));
                break;
            }

        }

        return super.onOptionsItemSelected(item);
    }
}
