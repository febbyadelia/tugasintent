package com.example.febyintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button moreApps = (Button) findViewById(R.id.moreApps);
        Button openBrowser = (Button) findViewById(R.id.openBrowser);

        openBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Implicit Intent

                Intent Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/cheezycode"));
                startActivity(intent);
            }
        });
    }

    public void Telpon(View view) {
        if(!txtnomor.getText().toString().isEmpty());
            String nmr = txtnomor.getText().toString();
            Intent intent = new Intent(Intent. ACTION_DIAL);
            Intent.setData(Uri.fromParts("tel",nmr,null));
            startActivity(intent);
        }else{
            Toast.makeText(MainActivity.this, "Maaf tidak boleh kosong", Toast.LENGTH_SHORT).show();
        }
    }

    public void Browsing(View view){
        String url = "https://wifilogin.google.com";
        Intent intent = new Intent(Intent. ACTION_VIEW);
        intent.setData(Uri. pars(url));
        startActivity(intent);
    }