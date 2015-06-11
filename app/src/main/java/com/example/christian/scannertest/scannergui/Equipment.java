package com.example.christian.scannertest.scannergui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;


public class Equipment extends ActionBarActivity {
    ImageButton ar1,ar2,ar3,s1,s2,s3,g1,g2,g3,shield,ib,ib2,ib3,ib4,ib5,ib6;
    Button ea1,ea2,ea3,es1,es2,es3,eg1,eg2,eg3,eshield;
    TextView ta1,ta2,ta3,ts1,ts2,ts3,tg1,tg2,tg3,tshield;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipment);
        Intent intent = getIntent();
        String value = intent.getStringExtra("key");
        ib=(ImageButton)findViewById(R.id.ib);
        ib2=(ImageButton)findViewById(R.id.ib2);
        ib3=(ImageButton)findViewById(R.id.ib3);
        ib4=(ImageButton)findViewById(R.id.ib4);
        ar1=(ImageButton)findViewById(R.id.chest1);
        ar2=(ImageButton)findViewById(R.id.chest2);
        ar3=(ImageButton)findViewById(R.id.chest3);
        s1=(ImageButton)findViewById(R.id.shoes1);
        s2=(ImageButton)findViewById(R.id.shoes2);
        s3=(ImageButton)findViewById(R.id.shoes3);
        g1=(ImageButton)findViewById(R.id.gloves1);
        g2=(ImageButton)findViewById(R.id.gloves2);
        g3=(ImageButton)findViewById(R.id.gloves3);
        shield=(ImageButton)findViewById(R.id.shield1);
        ta1=(TextView)findViewById(R.id.test1);
        ta2=(TextView)findViewById(R.id.test2);
        ta3=(TextView)findViewById(R.id.test3);
        ts1=(TextView)findViewById(R.id.test4);
        ts2=(TextView)findViewById(R.id.test5);
        ts3=(TextView)findViewById(R.id.test6);
        tg1=(TextView)findViewById(R.id.test7);
        tg2=(TextView)findViewById(R.id.test8);
        tg3=(TextView)findViewById(R.id.test9);
        tshield=(TextView)findViewById(R.id.test10);
        ea1=(Button)findViewById(R.id.eArmor1);
        ea2=(Button)findViewById(R.id.eArmor2);
        ea3=(Button)findViewById(R.id.eArmor3);
        es1=(Button)findViewById(R.id.eShoes1);
        es2=(Button)findViewById(R.id.eShoes2);
        es3=(Button)findViewById(R.id.eShoes3);
        eg1=(Button)findViewById(R.id.eGloves1);
        eg2=(Button)findViewById(R.id.eGloves2);
        eg3=(Button)findViewById(R.id.eGloves3);
        eshield=(Button)findViewById(R.id.eShield);

        Integer test = 1;
        if(test==1){
            ar1.setVisibility(View.GONE);
        }else{
            ar1.setVisibility(View.VISIBLE);
        }

        ar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ImageButton ar1 = (ImageButton)v;
                if(ta1.getVisibility()==View.GONE) {
                    ta1.setVisibility(View.VISIBLE);
                    ea1.setVisibility(View.VISIBLE);
                }else{
                    ta1.setVisibility(View.GONE);
                    ea1.setVisibility(View.GONE);
                }
            }
        });
        ar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ImageButton ar1 = (ImageButton)v;
                if(ta2.getVisibility()==View.GONE) {
                    ta2.setVisibility(View.VISIBLE);
                    ea2.setVisibility(View.VISIBLE);
                }else{
                    ta2.setVisibility(View.GONE);
                    ea2.setVisibility(View.GONE);
                }
            }
        });
        ar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ImageButton ar1 = (ImageButton)v;
                if(ta3.getVisibility()==View.GONE) {
                    ta3.setVisibility(View.VISIBLE);
                    ea3.setVisibility(View.VISIBLE);
                }else{
                    ta3.setVisibility(View.GONE);
                    ea3.setVisibility(View.GONE);
                }
            }
        });
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ImageButton ar1 = (ImageButton)v;
                if(ts1.getVisibility()==View.GONE) {
                    ts1.setVisibility(View.VISIBLE);
                    es1.setVisibility(View.VISIBLE);
                }else{
                    ts1.setVisibility(View.GONE);
                    es1.setVisibility(View.GONE);
                }
            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ImageButton ar1 = (ImageButton)v;
                if(ts2.getVisibility()==View.GONE) {
                    ts2.setVisibility(View.VISIBLE);
                    es2.setVisibility(View.VISIBLE);
                }else{
                    ts2.setVisibility(View.GONE);
                    es2.setVisibility(View.GONE);
                }
            }
        });
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ImageButton ar1 = (ImageButton)v;
                if(ts3.getVisibility()==View.GONE) {
                    ts3.setVisibility(View.VISIBLE);
                    es3.setVisibility(View.VISIBLE);
                }else{
                    ts3.setVisibility(View.GONE);
                    es3.setVisibility(View.GONE);
                }
            }
        });
        g1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ImageButton ar1 = (ImageButton)v;
                if(tg1.getVisibility()==View.GONE) {
                    tg1.setVisibility(View.VISIBLE);
                    eg1.setVisibility(View.VISIBLE);
                }else{
                    tg1.setVisibility(View.GONE);
                    eg1.setVisibility(View.GONE);
                }
            }
        });
        g2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ImageButton ar1 = (ImageButton)v;
                if(tg2.getVisibility()==View.GONE) {
                    tg2.setVisibility(View.VISIBLE);
                    eg2.setVisibility(View.VISIBLE);
                }else{
                    tg2.setVisibility(View.GONE);
                    eg2.setVisibility(View.GONE);
                }
            }
        });
        g3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ImageButton ar1 = (ImageButton)v;
                if(tg3.getVisibility()==View.GONE) {
                    tg3.setVisibility(View.VISIBLE);
                    eg3.setVisibility(View.VISIBLE);
                }else{
                    tg3.setVisibility(View.GONE);
                    eg3.setVisibility(View.GONE);
                }
            }
        });
        shield.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ImageButton ar1 = (ImageButton)v;
                if(tshield.getVisibility()==View.GONE) {
                    tshield.setVisibility(View.VISIBLE);
                    eshield.setVisibility(View.VISIBLE);
                }else{
                    tshield.setVisibility(View.GONE);
                    eshield.setVisibility(View.GONE);
                }
            }
        });

        ea1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(Equipment.this, Character.class);
                Bundle bundle=new Bundle();
                bundle.putInt("image",R.drawable.armor1);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        ea2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(Equipment.this, Character.class);
                Bundle bundle=new Bundle();
                bundle.putInt("armor2",R.drawable.armor2);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        ea3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(Equipment.this, Character.class);
                Bundle bundle=new Bundle();
                bundle.putInt("armor3",R.drawable.armor3);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        es1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(Equipment.this, Character.class);
                Bundle bundle=new Bundle();
                bundle.putInt("shoes1",R.drawable.shoes1);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        es2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                setContentView(R.layout.character);
                ib2=(ImageButton)findViewById(R.id.ib2);
                ib2.setImageResource(R.drawable.shoes2);
            }
        });
        es3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                setContentView(R.layout.character);
                ib2=(ImageButton)findViewById(R.id.ib2);
                ib2.setImageResource(R.drawable.shoes3);
            }
        });
        eg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                setContentView(R.layout.character);
                ib3=(ImageButton)findViewById(R.id.ib3);
                ib3.setImageResource(R.drawable.gloves1);
            }
        });
        eg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                setContentView(R.layout.character);
                ib3=(ImageButton)findViewById(R.id.ib3);
                ib3.setImageResource(R.drawable.gloves2);
            }
        });
        eg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                setContentView(R.layout.character);
                ib3=(ImageButton)findViewById(R.id.ib3);
                ib3.setImageResource(R.drawable.gloves3);
            }
        });
        eshield.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                setContentView(R.layout.character);
                ib4=(ImageButton)findViewById(R.id.ib4);
                ib4.setImageResource(R.drawable.shield1);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_equipment, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
