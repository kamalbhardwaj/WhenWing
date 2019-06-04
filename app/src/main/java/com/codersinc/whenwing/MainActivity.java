package com.codersinc.whenwing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    public void submit(View view){
        Intent intent = new Intent(this,location.class);
        startActivity(intent);
        MainActivity.this.finish();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);


        EditText phone = findViewById(R.id.editText3);
        Button button = findViewById(R.id.button);
    }
}
