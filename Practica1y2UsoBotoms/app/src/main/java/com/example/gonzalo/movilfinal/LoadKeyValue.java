package com.example.gonzalo.movilfinal;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoadKeyValue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_key_value);
    }
    public void loadKeyValue(View view) {
        SharedPreferences sharedPref =
                getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        String lastValue = sharedPref.getString(getString(R.string.button_last_value),"None");
        TextView textView = (TextView) findViewById(R.id.textView4);
        textView.setText(lastValue);
    }
}
