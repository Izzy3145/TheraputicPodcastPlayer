package com.example.android.mindfulmoments;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.onClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create new objects of the ImageView class for buttons on the Home screen
        ImageView happyImage = (ImageView) findViewById(R.id.happy);
        ImageView sadImage = (ImageView) findViewById(R.id.sad);

        // assign event listeners to each of the emotion buttons, with instructions on all abstract methods
        happyImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent happyIntent = new Intent(MainActivity.this, HappyActivity.class);
                startActivity(happyIntent);
            }
        });

        sadImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent sadIntent = new Intent(MainActivity.this, SadActivity.class);
                startActivity(sadIntent);
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
                                Intent mainIntent = new Intent(MainActivity.this, MainActivity.class);
                                startActivity(mainIntent);
                                break;
                            case R.id.action_chat:
                                Intent chatIntent = new Intent(MainActivity.this, ChatActivity.class);
                                startActivity(chatIntent);
                                break;
                            case R.id.action_playing:
                                Intent playingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                                startActivity(playingIntent);
                                break;
                        }
                        return false;
                    }
                });
    }
}
