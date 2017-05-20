package com.example.android.mindfulmoments;

/**
 * Created by izzystannett on 13/05/2017.
 * creating a class of objects to be passed into the custom array adapter
 * representing a list of podcasts
 */

public class Podcast {
    /**
     * initialise member variables
     */
    private String mPodcastName;
    private String mPodcastAuthor;

    /**
     * create constructor
     *
     * @param podcastName
     * @param podcastAuthor
     */
    public Podcast(String podcastName, String podcastAuthor) {
        mPodcastName = podcastName;
        mPodcastAuthor = podcastAuthor;
    }

    /**
     * create getter methods
     */
    public String getPodcastName() {
        return mPodcastName;
    }

    public String getPodcastAuthor() {
        return mPodcastAuthor;
    }

}
