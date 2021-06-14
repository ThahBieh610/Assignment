package com.example.celebquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView nicki;
    ImageView bonang;
    ImageView savege;
    Button NickiMinaj;
    Button Savage;
    Button Bonang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Savage =(Button)findViewById(R.id.Savage);
        Bonang =(Button)findViewById(R.id.Bonang);

        addListenerOnButton();

    }

    private void addListenerOnButton() {
        nicki = (ImageView) findViewById(R.id.one);

        NickiMinaj = (Button) findViewById(R.id.NickiMinaj);
        NickiMinaj.setOnClickListener(new View.OnClickListener()

        {

            @Override
            public void onClick(View arg0) {
                nicki.setImageResource(R.drawable.nicki);
            }

        });

        Context context = getApplicationContext();
        CharSequence text = "Click Next";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        Toast.makeText(context, text, duration).show();

        {
            bonang = (ImageView) findViewById(R.id.one);

            Bonang = (Button) findViewById(R.id.Bonang);
            Bonang.setOnClickListener(new View.OnClickListener()

            {

                @Override
                public void onClick(View arg0) {
                    bonang.setImageResource(R.drawable.bonang);
                }

            });

        }

        {
            savege = (ImageView) findViewById(R.id.one);

            Savage = (Button) findViewById(R.id.Savage);
            Savage.setOnClickListener(new View.OnClickListener()

            {

                @Override
                public void onClick(View arg0) {
                    savege.setImageResource(R.drawable.savege);
                }

            });

        }
    }
}