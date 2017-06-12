package com.android.twitch.list.injection.data;

import com.android.twitch.list.data.remote.GamesApiServices;
import com.android.twitch.list.data.remote.RetrofitClient;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by android on 6/10/2017.
 */
@Module
public class GameApiModule {
    @Provides
    @Singleton
    public GamesApiServices providesGamesApiServices(RetrofitClient retrofitClient) {
        return new GamesApiServices(retrofitClient);
    }
}
