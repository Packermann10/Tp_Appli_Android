package com.example.pierre.tp_appli_mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button); // on déclare le boutton
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // procédure pour passer d'une activité à une autre
                Log.i("Mon Application", "Mon appli écrit dans la log"); // écriture dans la log

                Intent MonIntent = new Intent(MainActivity.this, interface2.class); // on déclare l'intent
                startActivity(MonIntent);
            }
        });
    }
}
