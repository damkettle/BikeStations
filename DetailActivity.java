package com.example.damien.bikestations;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.widget.ImageView;

public class DetailActivity extends AppCompatActivity {

    //Student 1508795 Damien Kettle

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent in = getIntent();
        int index = in.getIntExtra("com.example.damien.bikestations.ITEM_INDEX", -1);

        if(index > -1){
            int pic = getImg(index);
            ImageView img = (ImageView) findViewById(R.id.imageView);
            scaleImg(img, pic);
        }
    }

    //method to get the image from the array
    private int getImg(int index){
        switch (index){
            case 0: return R.drawable.dublinbusinessschool;
            case 1: return R.drawable.drurycar;
            case 2: return R.drawable.bowe;
            default: return -1;
        }
    }

    //Method to scale image to fit the screen
    private void scaleImg(ImageView img, int pic ){
        Display screen = getWindowManager().getDefaultDisplay();
        BitmapFactory.Options options = new BitmapFactory.Options();

        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), pic, options);

        int imgWidth = options.outWidth;
        int screenWidth = screen.getWidth();

        if(imgWidth > screenWidth){
            int ratio = Math.round((float)imgWidth / (float)screenWidth);
            options.inSampleSize = ratio;
        }
        options.inJustDecodeBounds = false;
        Bitmap scaledImg = BitmapFactory.decodeResource(getResources(), pic, options);
        img.setImageBitmap(scaledImg);
    }
}

















