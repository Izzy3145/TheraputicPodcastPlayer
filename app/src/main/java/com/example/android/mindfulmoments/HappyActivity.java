package com.example.android.mindfulmoments;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class HappyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy);

        ArrayList<String> podcasts = new ArrayList<String>();
        podcasts.add(0, "podcast discussing happy emotions - 1");
        podcasts.add(1, "podcast discussing happy emotions - 2");
        podcasts.add(2, "podcast discussing happy emotions - 3");
        podcasts.add(3, "podcast discussing happy emotions - 4");
        podcasts.add(4, "podcast discussing happy emotions - 5");
        podcasts.add(5, "podcast discussing happy emotions - 6");
        podcasts.add(6, "podcast discussing happy emotions - 7");
        podcasts.add(7, "podcast discussing happy emotions - 8");
        podcasts.add(8, "podcast discussing happy emotions - 9");
        podcasts.add(9, "podcast discussing happy emotions - 10");
        podcasts.add(10, "podcast discussing happy emotions - 11");
        podcasts.add(11, "podcast discussing happy emotions - 12");
        podcasts.add(12, "podcast discussing happy emotions - 13");
        podcasts.add(13, "podcast discussing happy emotions - 14");
        podcasts.add(14, "podcast discussing happy emotions - 15");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, podcasts);
        ListView listView = (ListView) findViewById(R.id.activity_happy);
        listView.setAdapter(itemsAdapter);

        //set intent
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Launching new Activity on selecting single List Item
                Intent i = new Intent(getApplicationContext(), NowPlayingActivity.class);
                // sending data to new activity
                startActivity(i);
            }
        });
    }
}