Twitch Final Project App

CS 496

Scott Russell

This app displays a list of the Top 10 Most popular Games of Twitch currently

Selecting a game will bring up a window with more detailed information (Channels playing that game, total views, ect)

Scrolling down from the top will reload the games, possibly changing the order based on if games outrank one another

Planning on implimenting a Settings Tab where the User can store information for future.
(possible create a second tab for favorited games, and be able to add games to the favorite from the detailed view)


The Injection Filese were auto-geneated by Butterknife (http://jakewharton.github.io/butterknife/) 
I was testing out trying to easily bind views to layers, but it is not important for the implimentation.

The Project:
1. Has multiple activities (By clicking on a game to enter a more detailed view)

2. Connects to the Twitch API to access current information

3. Has implimented simple Activity Lifecycle commands (OnCreate, OnDestroy, onResume)

4. Has a natural and easy to use UI (with dynamic windows to swip through

I have not yet implimented a Stored Prefernces or SQL Database to draw information from
I plan on using the settings page to be able to complete this functionality later this week.
