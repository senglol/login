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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        firebaseAuth = FirebaseAuth.getInstance();



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
