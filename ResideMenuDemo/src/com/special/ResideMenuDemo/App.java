package com.special.ResideMenuDemo;

import android.app.Application;
import android.widget.ImageView;

import com.special.ResideMenu.ResideMenu;

/**
 * Created by gusta on 28/11/2016.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ResideMenu.imageLoader = new ResideMenu.ImageLoader() {
            @Override
            public void loadFromUrl(String url, ImageView imageView) {
//                Picasso.with(imageView.getContext()).load(url).into(imageView);
            }
        };
    }
}
