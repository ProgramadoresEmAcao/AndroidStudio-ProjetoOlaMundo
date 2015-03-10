package br.com.programadoresemacao.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import br.com.programadoresemacao.bean.Pessoa;
import br.com.programadoresemacao.bean.PessoaEnviaObjeto;
import br.com.programadoresemacao.projetoaula.R;

public class RecebeObjetoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recebe_objeto);

        Intent intent = getIntent();
        PessoaEnviaObjeto pessoa = (PessoaEnviaObjeto)intent.getSerializableExtra("objeto");

        ((TextView)findViewById(R.id.txt_par_nome)).setText(pessoa.getNome());
        ((TextView)findViewById(R.id.txt_par_telefone)).setText(pessoa.getTelefone());
        ((TextView)findViewById(R.id.txt_par_sexo)).setText(pessoa.getSexo());
    }
}
