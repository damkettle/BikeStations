package com.example.damien.bikestations;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapStations extends FragmentActivity implements OnMapReadyCallback {

    //Student 1508795 Damien Kettle

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_stations);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker for Dublin and set the zoom level

        LatLng dublinBikes = new LatLng(53.341703, -6.266022);
        mMap.addMarker(new MarkerOptions().position(dublinBikes).title("Dublin Bike Stations"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dublinBikes));
        float zoomLevel = (float) 18.0;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(dublinBikes, zoomLevel));
    }
}
