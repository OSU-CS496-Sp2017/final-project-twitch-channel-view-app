# TwitchExample
![](https://circleci.com/gh/android/TwitchExample/tree/master.svg?style=shield&circle-token=:circle-token)
Android example which consumes twitch API and lists twitch's top 50 games.

Everything is 100% Android Native, built on Android Studio 2.0 (with Gradle). 
This project implementation is based on Model View Presenter (MVP) architecture.
CircleCi is used for continuous integration.

# Libraries used 

* Retrofit 2.0 for network communication;
* Moshi for JSON parser;
* Dagger 2 for dependency injection;
* Butterknife for View injection;
* PaperDB for Cache (Offline data);
* JUnit 4 and Robolectric for Unit Tests;
* Pull to Refresh (Google's SwipeRefreshLayout - Support Library)

# Setup #

After cloning this repository, just open Android Studio 2.0 and import the project (File -> New -> Import Project). You need Android SDK 23, Build Tools 23.0.2 and Android Support Library 23.2.0 installed in order to build this project as is.

# Run #

Just select "App" on Android Studio and Run it. You can also run directly from terminal, just go to `path/to/TwitchExample` and do a `./gradlew clean assembleDebug` to generate a debug apk.

If you want to build and run all unit tests, use `./gradlew clean assembleDebug cleanTest testDebug`.

# Screen Captures #

![](https://raw.githubusercontent.com/android/TwitchExample/master/images/game_list_activity.png)
![](https://raw.githubusercontent.com/android/TwitchExample/master/images/game_details_activity.png)

