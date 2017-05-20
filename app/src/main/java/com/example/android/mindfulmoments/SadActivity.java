package com.example.android.mindfulmoments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.id.list;

public class SadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sad);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        //create ArrayList to hold objects of the Podcast class, and add objects to the ArrayList
        ArrayList<Podcast> podcasts = new ArrayList<>();
        podcasts.add(new Podcast("listening number one", "Dr. A. Psychologist"));
        podcasts.add(new Podcast("listening number two", "Dr. B. Psychologist"));
        podcasts.add(new Podcast("listening number three", "Dr. C. Psychologist"));
        podcasts.add(new Podcast("listening number four", "Dr. D. Psychologist"));
        podcasts.add(new Podcast("listening number five", "Dr. A. Psychologist"));
        podcasts.add(new Podcast("listening number six", "Dr. B. Psychologist"));
        podcasts.add(new Podcast("listening number seven", "Dr. C. Psychologist"));
        podcasts.add(new Podcast("listening number eight", "Dr. D. Psychologist"));
        podcasts.add(new Podcast("listening number nine", "Dr. A. Psychologist"));
        podcasts.add(new Podcast("listening number ten", "Dr. B. Psychologist"));
        podcasts.add(new Podcast("listening number ten", "Dr. C. Psychologist"));
        podcasts.add(new Podcast("listening number ten", "Dr. D. Psychologist"));

        //create custom adapter
        PodcastAdapter adapter = new PodcastAdapter(this, podcasts);
        //intitialise listView object
        ListView listView = (ListView) findViewById(R.id.activity_sad);
        //Inflate header view
        ViewGroup headerView = (ViewGroup) getLayoutInflater().inflate(R.layout.sad_list_header, listView, false);
        //add header to listView
        listView.addHeaderView(headerView);
        //set the itemsAdapter to the listView
        listView.setAdapter(adapter);

        //set event listener on list views, with intent
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Launching Now PLaying Activity on selecting single List Item
                Intent i = new Intent(getApplicationContext(), NowPlayingActivity.class);
                // sending data to new activity
                startActivity(i);
            }
        });
    }
}
