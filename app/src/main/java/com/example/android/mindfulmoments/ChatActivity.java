package com.example.android.mindfulmoments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        ArrayList<String> podcasts = new ArrayList<String>();
        podcasts.add(0,"conversation one");
        podcasts.add(1,"conversation two");
        podcasts.add(2,"conversation three");
        podcasts.add(3,"conversation four");
        podcasts.add(4,"conversation five");
        podcasts.add(5,"conversation six");
        podcasts.add(6,"conversation seven");
        podcasts.add(7,"conversation eight");
        podcasts.add(8,"conversation nine");
        podcasts.add(9,"conversation ten");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, podcasts);
        ListView listView = (ListView) findViewById(R.id.activity_chat);
        listView.setAdapter(itemsAdapter);
    }
}
