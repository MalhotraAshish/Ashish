package com.vlccinstitute.ashish.vlcc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by 500039306 on 3/21/2016.
 */
public class Cosmetology extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cosmetology);

        TextView tvdic = (TextView)findViewById(R.id.cosmetologytype1);
        tvdic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dic = new Intent(Cosmetology.this, Dic.class);
                startActivity(dic);
            }
        });

        TextView tvadc = (TextView)findViewById(R.id.cosmetologytype2);
        tvadc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent adc = new Intent(Cosmetology.this, Adc.class);
                startActivity(adc);
            }
        });
        TextView tvpdc = (TextView)findViewById(R.id.cosmetologytype3);
        tvpdc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pdc = new Intent(Cosmetology.this, Pdc.class);
                startActivity(pdc);
            }
        });

        TextView tvgmic = (TextView)findViewById(R.id.cosmetologytype4);
        tvgmic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gmic = new Intent(Cosmetology.this, Gmic.class);
                startActivity(gmic);
            }
        });
    }
}
