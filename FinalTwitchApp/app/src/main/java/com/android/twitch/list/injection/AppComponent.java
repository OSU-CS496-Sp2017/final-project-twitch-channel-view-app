package com.android.twitch.list.injection;

import com.android.twitch.list.data.cache.GamesCache;
import com.android.twitch.list.data.remote.GamesApiServices;
import com.android.twitch.list.data.remote.RetrofitClient;
import com.android.twitch.list.injection.data.CacheModule;
import com.android.twitch.list.injection.data.GameApiModule;
import com.android.twitch.list.ui.details.GameDetailsActivity;
import com.android.twitch.list.ui.list.GameListAdapter;
import com.android.twitch.list.ui.list.GameListPresenter;
import com.squareup.picasso.Picasso;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by android on 6/10/2017.
 */
@Singleton
@Component(modules = {AppModule.class, CacheModule.class, GameApiModule.class})
public interface AppComponent {

    RetrofitClient getRetrofit();

    GamesCache getCache();

    GamesApiServices getApiServices();

    Picasso getPicasso();

    void inject(GameDetailsActivity gameDetailsActivity);
    void inject(GameListAdapter adapter);
    void inject(GameListPresenter presenter);
}
