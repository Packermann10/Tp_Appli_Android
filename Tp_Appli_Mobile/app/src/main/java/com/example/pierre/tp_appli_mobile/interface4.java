package com.example.pierre.tp_appli_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Pierre on 22/11/2017.
 */

public class interface4 extends AppCompatActivity {

    //Pour récupérer le nom et le prénom
    final String EXTRA_NOM = "user_nom"; // on déclare l'identifiant pour le passage de données
    final String EXTRA_PRENOM = "user_prenom"; // on déclare l'identifiant pour le passage de données

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interface4);

        Intent MonIntent2 = getIntent();// on récupère l'intent pour les valeurs du nm et prenom avec getIntent

        // on déclare les boutons et TextView
        TextView nom = (TextView) findViewById(R.id.textView9);
        TextView prenom= (TextView) findViewById(R.id.textView10);

        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);

        button5.setOnClickListener(new View.OnClickListener() { // pour passer sur la vue3
            @Override
            public void onClick(View v3) { // procédure pour choisir le sport1
                Log.i("Mon Application", "Mon appli écrit dans la log");

                Intent MonIntent4 = new Intent(interface4.this, interface5.class); // déclare un nouvel intent
                startActivity(MonIntent4);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() { // pour passer sur la vue3
            @Override
            public void onClick(View v3) { // procédure pour choisir le sport2
                Log.i("Mon Application", "Mon appli écrit dans la log");

                Intent MonIntent4 = new Intent(interface4.this, interface5.class); // déclare un nouvel intent
                startActivity(MonIntent4);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() { // pour passer sur la vue3
            @Override
            public void onClick(View v3) { // procédure pour choisir le sport3
                Log.i("Mon Application", "Mon appli écrit dans la log");

                Intent MonIntent4 = new Intent(interface4.this, interface5.class); // déclare un nouvel intent
                startActivity(MonIntent4);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() { // pour passer sur la vue3
            @Override
            public void onClick(View v3) { // procédure pour retourner sur l'écran d'accueil
                Log.i("Mon Application", "Mon appli écrit dans la log");

                Intent MonIntent4 = new Intent(interface4.this, MainActivity.class); // déclare un nouvel intent
                startActivity(MonIntent4);
            }
        });
    }
}

