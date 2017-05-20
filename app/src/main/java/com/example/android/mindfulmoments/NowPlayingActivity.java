package com.example.android.mindfulmoments;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // set up event listener for the button on the NowPlayingActivity
        Button chatButton = (Button) findViewById(R.id.to_chat);
        chatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chatIntent = new Intent(NowPlayingActivity.this, ChatActivity.class);
                startActivity(chatIntent);
            }
        });

        //set event listeners and intents on all bottom navigation bar menu items
        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_home:
                                Intent mainIntent = new Intent(NowPlayingActivity.this, MainActivity.class);
                                startActivity(mainIntent);
                                break;
                            case R.id.action_chat:
                                Intent chatIntent = new Intent(NowPlayingActivity.this, ChatActivity.class);
                                startActivity(chatIntent);
                                break;
                            case R.id.action_playing:
                                Intent playingIntent = new Intent(NowPlayingActivity.this, NowPlayingActivity.class);
                                startActivity(playingIntent);
                                break;
                        }
                        return false;
                    }
                });
    }
}
