package com.android.twitch.list.injection.ui;

import com.android.twitch.list.injection.PerActivity;
import com.android.twitch.list.ui.list.GameListActivity;

import dagger.Component;

/**
 * Created by android on 6/10/2017.
 */
@PerActivity
@Component(modules = GameListPresenterModule.class)
public interface GameListPresenterComponent {
    void inject(GameListActivity gameListActivity);
}
