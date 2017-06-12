package com.android.twitch.list.injection.data;

import com.android.twitch.list.data.cache.GamesCache;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by android on 6/10/2017.
 */
@Module
public class CacheModule {

    @Provides
    @Singleton
    GamesCache providesCache() {
        return new GamesCache();
    }
}
