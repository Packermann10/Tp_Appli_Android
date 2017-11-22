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

public class interface3 extends AppCompatActivity {

    // on déclare les identifiants pour le passage des données
    final String EXTRA_NOM = "user_nom";
    final String EXTRA_PRENOM = "user_prenom";
    final String EXTRA_DATE = "user_date";
    final String EXTRA_EMAIL = "user_email";
    final String EXTRA_ADRESSE = "user_adresse";
    final String EXTRA_COMMENTAIRE = "user_commentaire";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interface3);

        Intent MonIntent2 = getIntent();// on récupère l'intent avec la méthode getIntent

        //on déclare les TextView pour récupérer l'identifiant
        TextView sexe = (TextView) findViewById(R.id.textView);
        TextView nom = (TextView) findViewById(R.id.textView2);
        TextView prenom = (TextView) findViewById(R.id.textView3);
        TextView date = (TextView) findViewById(R.id.textView4);
        TextView email = (TextView) findViewById(R.id.textView5);
        TextView adresse = (TextView) findViewById(R.id.textView6);
        TextView commentaire = (TextView) findViewById(R.id.textView7);

        if (MonIntent2 != null) { // intent différent de null
            nom.setText(MonIntent2.getStringExtra(EXTRA_NOM)); // on affiche la valeur grâce à l'identifiant
            prenom.setText(MonIntent2.getStringExtra(EXTRA_PRENOM));
            date.setText(MonIntent2.getStringExtra(EXTRA_DATE)); // on affiche la valeur grâce à l'identifiant
            email.setText(MonIntent2.getStringExtra(EXTRA_EMAIL));
            adresse.setText(MonIntent2.getStringExtra(EXTRA_ADRESSE)); // on affiche la valeur grâce à l'identifiant
            commentaire.setText(MonIntent2.getStringExtra(EXTRA_COMMENTAIRE));
        }

        //on déclare les boutons
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);

        button3.setOnClickListener(new View.OnClickListener() { // pour passer sur la vue3
            @Override
            public void onClick(View v3) { // porcédure pour aller sur la prochaine activité
                Log.i("Mon Application", "Mon appli écrit dans la log");


                Intent MonIntent3 = new Intent(interface3.this, interface4.class); // déclare un nouvel intent
                startActivity(MonIntent3);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() { // pour passer sur la vue3
            @Override
            public void onClick(View v3) { //procédure pour retourner à l'écran d'accueil quand on clique sur le bouton
                Log.i("Mon Application", "Mon appli écrit dans la log");
                Intent MonIntent3 = new Intent(interface3.this, MainActivity.class); // déclare un nouvel intent
                startActivity(MonIntent3);
            }
        });
    }
}
