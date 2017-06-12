package com.android.twitch.list.data.cache;

import com.android.twitch.list.data.models.TopGames;

import io.paperdb.Paper;

/**
 * Created by android on 6/10/2017.
 */
public class GamesCache {

    public void save(TopGames topGames) {
        Paper.book().write(TopGames.TOPGAMES_TAG, topGames);
    }

    public TopGames retrieve() {
        return Paper.book().read(TopGames.TOPGAMES_TAG, null);
    }
}
