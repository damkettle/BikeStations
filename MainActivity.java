package com.example.damien.bikestations;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Student 1508795 Damien Kettle
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button to go to the about bikes screen
        Button btnDublinBikes = (Button)findViewById(R.id.btnDublinBikes);
        btnDublinBikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), DublinBikes.class);
                startActivity(startIntent);
            }
        });
        //Button to go to Our Bike Locations
        Button btnOurBikes = (Button)findViewById(R.id.btnOurBikes);
        btnOurBikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ourBikesIntent = new Intent(getApplicationContext(), BikeStationMap.class);
                startActivity(ourBikesIntent);
            }
        });
        //Button to go to Stations List
        Button btnStationsMap = (Button)findViewById(R.id.btnBikeStationMap);
        btnStationsMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent stationIntent = new Intent(getApplicationContext(), StationList.class);
                startActivity(stationIntent);
            }
        });
        //Button to go to Google Maps
        Button btnLocations = (Button)findViewById(R.id.btnLocations);
        btnLocations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mapIntent = new Intent(getApplicationContext(),MapStations.class);
                startActivity(mapIntent);
            }
        });

    }
}


//https://drive.google.com/open?id=1iA8TXQvr_0cX-2HmWkMhTcLmAs_MEg5j&usp=sharing

//<iframe src="https://www.google.com/maps/d/embed?mid=1iA8TXQvr_0cX-2HmWkMhTcLmAs_MEg5j" width="640" height="480"></iframe>