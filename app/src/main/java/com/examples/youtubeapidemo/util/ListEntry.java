package com.examples.youtubeapidemo.util;

/**
 * Created by falvojr on 12/25/16.
 */
public class ListEntry {
    public final String title;
    public final String id;
    public final boolean isPlaylist;

    public ListEntry(String title, String videoId, boolean isPlaylist) {
        this.title = title;
        this.id = videoId;
        this.isPlaylist = isPlaylist;
    }

    @Override
    public String toString() {
        return title;
    }
}
