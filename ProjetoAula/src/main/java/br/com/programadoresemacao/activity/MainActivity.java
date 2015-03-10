package br.com.programadoresemacao.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import br.com.programadoresemacao.projetoaula.R;

public class MainActivity extends Activity{
	Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

	public void click(View view) {
		switch (view.getId()) {
            case R.id.main_activity_btn_ciclo_de_vida:
                intent = new Intent(this, CicloDeVidaActivity.class);
                startActivity(intent);
                break;
            case R.id.main_btn_componentes:
                intent = new Intent(this, ComponentesActivity.class);
                startActivity(intent);
                break;
            case R.id.main_btn_text_view:
                intent = new Intent(this, TextViewActivity.class);
                startActivity(intent);
                break;
            case R.id.main_btn_drag_drop:
                intent = new Intent(this, DragDropActivity.class);
                startActivity(intent);
                break;
            case R.id.main_btn_envia_objeto:
                intent = new Intent(this, EnviaObjetoActivity.class);
                startActivity(intent);
                break;
		}
	}

    /*
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_pessoa);

		ListView listViewPessoa = (ListView) findViewById(R.id.listViewPessoa);
		ArrayList<Object> pessoas = new ArrayList<Object>();
		pessoas.add(new Pessoa(R.drawable.e1, "Nome1", "12345678911"));
		pessoas.add(new Pessoa(R.drawable.e2, "Nome2", "12345678912"));
		pessoas.add(new Pessoa(R.drawable.e3, "Nome3", "12345678913"));

		listViewPessoa = (new Utils()).geraListView(pessoas, this);

	}

	@Override
	public void onClick(View view) {

	}
	*/
}
