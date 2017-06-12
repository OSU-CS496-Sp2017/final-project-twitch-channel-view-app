package com.android.twitch.list.injection.ui;

import com.android.twitch.list.injection.PerActivity;
import com.android.twitch.list.ui.list.GameListContract;
import com.android.twitch.list.ui.list.GameListPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by android on 6/10/2017.
 */
@Module
public class GameListPresenterModule {

    private GameListContract.View view;

    private GameListPresenter presenter;

    public GameListPresenterModule(GameListContract.View view) {
        this.view = view;
        presenter = new GameListPresenter(view);
    }

    @PerActivity
    @Provides
    GameListContract.View providesGameListView() {
        return view;
    }

    @PerActivity
    @Provides
    GameListPresenter providesGameListPresenter(GameListContract.View view) {
        return presenter;
    }

    @PerActivity
    @Provides
    GameListContract.Presenter providesPresenter() {
        return presenter;
    }
}
