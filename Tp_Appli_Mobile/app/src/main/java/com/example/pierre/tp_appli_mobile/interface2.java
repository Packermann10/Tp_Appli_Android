package com.example.pierre.tp_appli_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Pierre on 22/11/2017.
 */

public class interface2 extends AppCompatActivity {

    //Ici on déclare les identifiants pour le passage de données

    //final String EXTRA_SEXE = "user_sexe";
    final String EXTRA_NOM = "user_nom";
    final String EXTRA_PRENOM = "user_prenom";
    final String EXTRA_DATE = "user_date";
    final String EXTRA_EMAIL = "user_email";
    final String EXTRA_ADRESSE = "user_adresse";
    final String EXTRA_COMMENTAIRE = "user_commentaire";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interface2);

        //Ici on déclare tous les boutons et editText

        Button button2 = (Button) findViewById(R.id.button2);
        final EditText nom = (EditText) findViewById(R.id.editText);
        final EditText prenom = (EditText) findViewById(R.id.editText2);
        final EditText date = (EditText) findViewById(R.id.editText3);
        final EditText email = (EditText) findViewById(R.id.editText4);
        final EditText adresse = (EditText) findViewById(R.id.editText5);
        final EditText commentaire = (EditText) findViewById(R.id.editText6);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) { // procédure pour passer d'une activité à une autre
                Log.i("Mon Application", "interface2"); // écriture dans la log

                Intent MonIntent2 = new Intent(interface2.this, interface3.class); // on déclare l'intent

                // association des valeurs avec la méthode putExtra
                MonIntent2.putExtra(EXTRA_NOM, nom.getText().toString());
                MonIntent2.putExtra(EXTRA_PRENOM, prenom.getText().toString());
                MonIntent2.putExtra(EXTRA_DATE, date.getText().toString());
                MonIntent2.putExtra(EXTRA_EMAIL, email.getText().toString());
                MonIntent2.putExtra(EXTRA_ADRESSE, adresse.getText().toString());
                MonIntent2.putExtra(EXTRA_COMMENTAIRE, commentaire.getText().toString());
                //méthode pour lancer l'acitivité suivante
                startActivity(MonIntent2);
            }
        });
    }
}
