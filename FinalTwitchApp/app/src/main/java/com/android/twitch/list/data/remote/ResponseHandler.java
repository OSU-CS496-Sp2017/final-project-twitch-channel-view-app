package com.android.twitch.list.data.remote;

/**
 * Created by android on 6/10/2017.
 */
public interface ResponseHandler<T> {
    void onSuccess(T response);
    void onError(int responseCode, String message);
}
