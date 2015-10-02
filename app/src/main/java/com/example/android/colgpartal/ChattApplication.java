package com.example.android.colgpartal;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

import model.Colg;

/**
 * Created by paulodichone on 4/10/15.
 */
public class ChattApplication extends Application {

    public static final String APP_KEY_ID = "DLaP289m95tXF5UOQd4dKBHN0yMHtCLlKkCYCjTg";
    public static final String APP_CLIENT_ID = "h5tgpDGsFpAE3DTfvrE2pwQ3h1gCcaIFrWNGHh68";

    @Override
    public void onCreate() {
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        ParseObject.registerSubclass(Colg.class);

        Parse.initialize(this, "metwWjc2cc4YjPBb4dtc9H41zZUYO0EmwbDYTOqf", "w0KNMSiP4DseOw4BCw9WkXIUQb0eDhwkJj58NHc8");

    }
}
