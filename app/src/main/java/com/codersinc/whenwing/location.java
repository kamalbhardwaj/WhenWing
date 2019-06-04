package com.codersinc.whenwing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class location extends AppCompatActivity {

    public void move(View view){
        Intent intent1 = new Intent(this,Services.class);
        startActivity(intent1);
        location.this.finish();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
    }
}
