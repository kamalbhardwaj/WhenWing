package com.codersinc.whenwing;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Services extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

    }

    public void ar(View view){
        Intent intent = new Intent(this,tabs.class);
        startActivity(intent);
    }

    public void hs(View view){
        Intent intent = new Intent(this,tabs.class);
        startActivity(intent);
    }

    public void tp(View view){
        Intent intent = new Intent(this,tabs.class);
        startActivity(intent);
    }
}
