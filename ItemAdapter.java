package com.example.damien.bikestations;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ItemAdapter extends BaseAdapter {

    //Student 1508795 Damien Kettle

    LayoutInflater mInflator;
    String[] items;
    String[] location;
    String[] description;

    public ItemAdapter(Context c, String[] i, String[] l, String[] d){
        items = i;
        location = l;
        description = d;
        mInflator = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = mInflator.inflate(R.layout.my_list_view, null);
        TextView txtName = (TextView) v.findViewById(R.id.txtName);
        TextView txtLocation = (TextView) v.findViewById(R.id.txtLocation);
        TextView txtDescription = (TextView) v.findViewById(R.id.txtDescription);

        String name = items[i];
        String loc = location[i];
        String desc = description[i];

        txtName.setText(name);
        txtLocation.setText(loc);
        txtDescription.setText(desc);

        return v;
    }
}
