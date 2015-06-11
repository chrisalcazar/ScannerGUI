package com.example.christian.scannertest.scannergui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class Character extends Activity {

    ImageButton ib,ib2,ib3,ib4;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set the main content layout of the Activity
        setContentView(R.layout.character);
        ib=(ImageButton)findViewById(R.id.ib);
        ib2=(ImageButton)findViewById(R.id.ib2);
        ib3=(ImageButton)findViewById(R.id.ib3);
        ib4=(ImageButton)findViewById(R.id.ib4);
        Bundle bundle=this.getIntent().getExtras();
        if(getIntent().getIntExtra("image", 0) != 0){
            int pic=bundle.getInt("image");
            ib.setImageResource(pic);
        }
        if(getIntent().getIntExtra("armor2", 0) != 0){
            int pic2=bundle.getInt("armor2");
            ib.setImageResource(pic2);
        }
        if(getIntent().getIntExtra("armor3", 0) != 0){
            int pic3=bundle.getInt("armor3");
            ib.setImageResource(pic3);
        }
        if(getIntent().getIntExtra("shoes1", 0) != 0){
            int pic4=bundle.getInt("shoes1");
            ib2.setImageResource(pic4);
        }

        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ImageButton ib = (ImageButton)v;
                Intent myIntent = new Intent(Character.this, Equipment.class);
                //myIntent.putExtra("key", value); //Optional parameters
                Character.this.startActivity(myIntent);
            }
        });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ImageButton ib = (ImageButton)v;
                Intent myIntent = new Intent(Character.this, Equipment.class);
                //myIntent.putExtra("key", value); //Optional parameters
                Character.this.startActivity(myIntent);
            }
        });
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ImageButton ib = (ImageButton)v;
                Intent myIntent = new Intent(Character.this, Equipment.class);
                //myIntent.putExtra("key", value); //Optional parameters
                Character.this.startActivity(myIntent);
            }
        });
        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ImageButton ib = (ImageButton)v;
                Intent myIntent = new Intent(Character.this, Equipment.class);
                //myIntent.putExtra("key", value); //Optional parameters
                Character.this.startActivity(myIntent);
            }
        });
    }

}