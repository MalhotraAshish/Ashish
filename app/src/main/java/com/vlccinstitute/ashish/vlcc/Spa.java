package com.vlccinstitute.ashish.vlcc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by 500039306 on 3/21/2016.
 */
public class Spa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spa);

        TextView tvspa1 = (TextView)findViewById(R.id.spatype1);
        tvspa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent spa1 = new Intent(Spa.this, SpaType1.class);
                startActivity(spa1);
            }
        });

        TextView tvspa2 = (TextView)findViewById(R.id.spatype2);
        tvspa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent spa2 = new Intent(Spa.this, SpaType2.class);
                startActivity(spa2);
            }
        });

        TextView tvspa3 = (TextView)findViewById(R.id.spatype3);
        tvspa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent spa3 = new Intent(Spa.this, SpaType3.class);
                startActivity(spa3);
            }
        });
    }
}
