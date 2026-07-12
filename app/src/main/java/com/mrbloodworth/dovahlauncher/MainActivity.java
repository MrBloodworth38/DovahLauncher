package com.mrbloodworth.dovahlauncher;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView deviceStatus = findViewById(R.id.deviceStatus);
        Button playButton = findViewById(R.id.playButton);
        Button locateButton = findViewById(R.id.locateButton);
        Button settingsButton = findViewById(R.id.settingsButton);

        deviceStatus.setText("Target device: Galaxy S24+\\nInput: Bluetooth keyboard + mouse");

        playButton.setOnClickListener(view ->
                Toast.makeText(this, "Runtime not installed yet.", Toast.LENGTH_SHORT).show());

        locateButton.setOnClickListener(view ->
                Toast.makeText(this, "Skyrim file detection is the next milestone.", Toast.LENGTH_SHORT).show());

        settingsButton.setOnClickListener(view ->
                Toast.makeText(this, "Settings are coming next.", Toast.LENGTH_SHORT).show());
    }
}
