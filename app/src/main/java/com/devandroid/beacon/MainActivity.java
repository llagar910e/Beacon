package com.devandroid.beacon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    MyBeacon beacon;

    public void createBeacon(android.content.Context context, String id1, String id2, String id3){
        beacon = new MyBeacon();
        beacon.setBeacon(context, id1, id2, id3);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String id1 = "2f234454-cf6d-4a0f-adf2-f4911ba9ffa7";
        final String id2="Radio";
        final String id3="3";

        createBeacon(getApplicationContext(), id1, id2, id3);
    }
}
