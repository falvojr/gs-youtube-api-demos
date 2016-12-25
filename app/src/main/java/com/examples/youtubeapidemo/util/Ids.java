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
        public static final String VIDEO_ID = "-xNN-bJQ4vI";
    }

    public static class FragmentDemoActivity {
        public static final String VIDEO_ID = "-xNN-bJQ4vI";
    }

    public static class FullscreenDemoActivity {
        public static final String VIDEO_ID = "-xNN-bJQ4vI";
    }

    public static class IntentsDemoActivity {
        public static final String VIDEO_ID = "-xNN-bJQ4vI";
        public static final String PLAYLIST_ID = "PLQMAjqIRdQxiFDvW1FrghrbFG26nSP0JG";
        public static final String USER_ID = "Google";
        public static final String CHANNEL_ID = "UCzuqhhs6NWbgTzMuM09WKDQ";
    }

    public static class PlayerControlsDemoActivity {
        public static final ListEntry[] ENTRIES = {
                new ListEntry("Montanha Russa", "-xNN-bJQ4vI", false),
                new ListEntry("The Walking Dead", "nRQsn_qd2Vs", false),
                new ListEntry("360 VR Playlist", "PLQMAjqIRdQxiFDvW1FrghrbFG26nSP0JG", true)};
    }

    public static class PlayerViewDemoActivity {
        public static final String VIDEO_ID = "-xNN-bJQ4vI";
    }

    public static class StandalonePlayerDemoActivity {
        public static final String VIDEO_ID = "EFslfVDzyG0";
        public static final String PLAYLIST_ID = "PLQMAjqIRdQxiFDvW1FrghrbFG26nSP0JG";
        public static final ArrayList<String> VIDEO_IDS = new ArrayList<>(
                Arrays.asList(new String[]{"p3VJAgcrSIA", "vjxd3TxQ-s0", "5GSICpwRStY"})
        );
    }

    public static class VideoListDemoActivity {
        public static final List<VideoEntry> VIDEO_LIST;

        static {
            List<VideoEntry> list = new ArrayList<>();
            list.add(new VideoEntry("Roller Coasters Orlando and Tampa", "p3VJAgcrSIA"));
            list.add(new VideoEntry("Stratos (Space)", "vjxd3TxQ-s0"));
            list.add(new VideoEntry("The Amazing Spider-Man 2", "5GSICpwRStY"));
            list.add(new VideoEntry("Mega Coaster 360 VR", "-xNN-bJQ4vI"));
            list.add(new VideoEntry("3D F-18 Fighter", "EFslfVDzyG0"));
            list.add(new VideoEntry("Shark 360", "rG4jSz_2HDY"));
            list.add(new VideoEntry("JURASSIC PARK VR", "PntXvz5omik"));
            VIDEO_LIST = Collections.unmodifiableList(list);
        }
    }

    public static class VideoWallDemoActivity {
        public static final String PLAYLIST_ID = "PLQMAjqIRdQxiFDvW1FrghrbFG26nSP0JG";
    }
}
