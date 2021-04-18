package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("OsGmcVxHiCLGUFPZXpU2eNbuFENfGsNZTNOq4O1F")
                .clientKey("pcXm1QL7jFzV6MuVi8gUWZonMBvyazyaKsKjc68b")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
