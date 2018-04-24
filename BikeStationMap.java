package com.example.damien.bikestations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class BikeStationMap extends AppCompatActivity {

    //Student 1508795 Damien Kettle

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bike_station_map);

        String url = "https://drive.google.com/open?id=1iA8TXQvr_0cX-2HmWkMhTcLmAs_MEg5j&usp=sharing";
        WebView view = (WebView)this.findViewById(R.id.webView);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }
}
