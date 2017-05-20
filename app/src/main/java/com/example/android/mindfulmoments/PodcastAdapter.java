package com.example.android.mindfulmoments;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by izzystannett on 13/05/2017.
 * Create a new custom adapter that takes Podcast objects
 */

public class PodcastAdapter extends ArrayAdapter<Podcast> {

    //create a constructor for PodcastAdapter that removes the layout TextView requirement
    public PodcastAdapter(Activity context, ArrayList<Podcast> podcasts) {
        super(context, 0, podcasts);
    }

    //override the getView method so we are not limited to passing just one TextView in
    //to the ListView
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // get the Podcast object in this position in the list
        Podcast currentPodcast = getItem(position);

        // define the current selected view as an object of the view class
        //check if the view is being reused, if not inflate it
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //find the TextView in the list_item.xml layout with the id podcast_name_text_view
        // and create an object of the view class for it
        TextView podcastTextView = (TextView) listItemView.findViewById(R.id.podcast_name_text_view);

        // get the podcast name from the Podcast object and assign it to this TextView
        podcastTextView.setText(currentPodcast.getPodcastName());

        // do the same for podcast_author_text_view
        TextView authorTextView = (TextView) listItemView.findViewById(R.id.podcast_author_text_view);
        authorTextView.setText(currentPodcast.getPodcastAuthor());

        // return the whole list item view containing two TextViews
        // so that it can be shown in ListView
        return listItemView;

    }

}
