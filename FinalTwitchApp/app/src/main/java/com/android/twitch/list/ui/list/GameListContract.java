package com.android.twitch.list.ui.list;

import com.android.twitch.list.data.models.Game;

import java.util.List;

/**
 * Created by android on 03/04/16.
 */
public class GameListContract {

    public interface View {
        void showRefreshing();
        void dismissRefreshing();
        void showError();
        void updateTopGames(List<Game> games);
        void showGameDetails(Game game);
        void showEmptyResult();
        void showLoadingFirst();
    }

    public interface Presenter {
        void onCreate();
        void refreshTopGames();
        void onDestroy();
        void onGameSelected(Game game);
    }
}
