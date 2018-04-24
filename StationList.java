package com.example.damien.bikestations;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class StationList extends AppCompatActivity {

    //Student 1508795 Damien Kettle

    ListView lstStationList;
    String[] items;
    String[] location;
    String[] description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station_list);

        Resources res = getResources();
        lstStationList = (ListView)findViewById(R.id.lstStationList);
        items = res.getStringArray(R.array.items);
        location = res.getStringArray(R.array.location);
        description = res.getStringArray(R.array.Description);

        ItemAdapter itemAdapter = new ItemAdapter(this, items, location, description);
        lstStationList.setAdapter(itemAdapter);

        lstStationList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent showDetailActivity = new Intent(getApplicationContext(), DetailActivity.class);
                showDetailActivity.putExtra("com.example.damien.bikestations.ITEM_INDEX", i);
                startActivity(showDetailActivity);

            }
        });




    }
}
