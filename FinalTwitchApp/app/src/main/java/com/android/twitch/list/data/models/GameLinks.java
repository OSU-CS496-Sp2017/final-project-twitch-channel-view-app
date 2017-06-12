package com.android.twitch.list.data.models;

import java.io.Serializable;

/**
 * Created by android on 6/10/2017.
 */
public class GameLinks implements Serializable {
    public final String self, next;

    public GameLinks() {
        this(null, null);
    }

    public GameLinks(String self, String next) {
        this.self = self;
        this.next = next;
    }
}
