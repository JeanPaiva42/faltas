package com.example.jcpmg.faltas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by jcpmg on 24/09/2016.
 */
public class NovoPerfil extends Activity {

    EditText nomePerfil;
    Button addPerfil;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.novo_perfil);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        nomePerfil = (EditText) findViewById(R.id.nomePerfil);
    }
        //inicializando o botão de novo perfil


        void clicandoNovoPerfil()
    {
        addPerfil = (Button) findViewById(R.id.perfilCriado);
        addPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String n = nomePerfil.getText().toString();

                //Assim eu mando a informação sobre o perfil para a outra activity
                Intent novoNome = new Intent(NovoPerfil.this, NovoPerfil.class);
                novoNome.putExtra("PerfilNome", n);
                startActivity(novoNome);
                startActivity(new Intent(NovoPerfil.this, MainActivity.class));

            }
        });


    }




    }

