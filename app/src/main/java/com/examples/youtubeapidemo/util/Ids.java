package com.examples.youtubeapidemo.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Static container class for holding Youtube ids.
 * <p>
 * Created by falvojr on 12/25/16.
 */
public abstract class Ids {

    public static class ActionBarDemoActivity {
        public static final String VIDEO_ID = "9c6W4CCU9M4";
    }

    public static class FragmentDemoActivity {
        public static final String VIDEO_ID = "nCgQDjiotG0";
    }

    public static class FullscreenDemoActivity {
        public static final String VIDEO_ID = "avP5d16wEp0";
    }

    public static class IntentsDemoActivity {
        public static final String VIDEO_ID = "-Uwjt32NvVA";
        public static final String PLAYLIST_ID = "PLF3DFB800F05F551A";
        public static final String USER_ID = "Google";
        public static final String CHANNEL_ID = "UCVHFbqXqoYvEWM1Ddxl0QDg";
    }

    public static class PlayerControlsDemoActivity {
        public static final ListEntry[] ENTRIES = {
                new ListEntry("Androidify App", "irH3OSOskcE", false),
                new ListEntry("Chrome Speed Tests", "nCgQDjiotG0", false),
                new ListEntry("Playlist: Google I/O 2012", "PL56D792A831D0C362", true)};
    }

    public static class PlayerViewDemoActivity {
        public static final String VIDEO_ID = "wKJ9KzGQq0w";
    }

    public static class StandalonePlayerDemoActivity {
        public static final String VIDEO_ID = "cdgQpa1pUUE";
        public static final String PLAYLIST_ID = "7E952A67F31C58A3";
        public static final ArrayList<String> VIDEO_IDS = new ArrayList<>(
                Arrays.asList(new String[]{"cdgQpa1pUUE", "8aCYZ3gXfy8", "zMabEyrtPRg"})
        );
    }

    public static class VideoListDemoActivity {
        public static final List<VideoEntry> VIDEO_LIST;

        static {
            List<VideoEntry> list = new ArrayList<>();
            list.add(new VideoEntry("YouTube Collection", "Y_UmWdcTrrc"));
            list.add(new VideoEntry("GMail Tap", "1KhZKNZO8mQ"));
            list.add(new VideoEntry("Chrome Multitask", "UiLSiqyDf4Y"));
            list.add(new VideoEntry("Google Fiber", "re0VRK6ouwI"));
            list.add(new VideoEntry("Autocompleter", "blB_X38YSxQ"));
            list.add(new VideoEntry("GMail Motion", "Bu927_ul_X0"));
            list.add(new VideoEntry("Translate for Animals", "3I24bSteJpw"));
            VIDEO_LIST = Collections.unmodifiableList(list);
        }
    }

    public static class VideoWallDemoActivity {
        public static final String PLAYLIST_ID = "wKJ9KzGQq0w";
    }
}
