package com.example.jcpmg.faltas;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;

import Aluno_Disciplina.Aluno;

public class MainActivity extends AppCompatActivity {

    private Button novoPerfil;
    public Aluno novoAluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        novoPerfil = (Button) findViewById(R.id.novoPerfil);

        clicandoNovoPerfil();
        recebendoNomePerfil();

}
    public void clicandoNovoPerfil()
    {
    //inicializando o botão de novo perfil

        novoPerfil.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, NovoPerfil.class));
            }
        });
        novoAluno = new Aluno();
    }

    public void recebendoNomePerfil() {

        Bundle novoNome = getIntent().getExtras();
        if (novoNome != null) {
            novoAluno.setNome(novoNome.getString("PerfilNome"));
            Toast.makeText(MainActivity.this, "Olá " + novoAluno.getNome() + " seu perfil foi criado!", Toast.LENGTH_LONG).show();
        }
    }







    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
