package com.playplan.mix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.idlefish.flutterboost.FlutterBoost;
import com.idlefish.flutterboost.FlutterBoostRouteOptions;

import java.util.HashMap;

import io.flutter.embedding.android.FlutterActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FlutterBoostRouteOptions options = new FlutterBoostRouteOptions.Builder()
                        .pageName("mainPage")
                        .arguments(new HashMap<>())
                        .requestCode(1111)
                        .build();
                FlutterBoost.instance().open(options);
               // MainActivity.this.startActivity(MyFlutterActvity.createDefaultIntent(MainActivity.this));
            }
        });

    }
}