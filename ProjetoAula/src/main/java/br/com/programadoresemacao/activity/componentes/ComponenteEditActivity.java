package br.com.programadoresemacao.activity.componentes;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import br.com.programadoresemacao.projetoaula.R;

public class ComponenteEditActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_componente_edit);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,
                new String[] {"Abelha", "Abobora", "Amarelo", "Casa","Carro", "Teste", "Wiliam"}
        );
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView)findViewById(R.id.componentes_edit_edt_auto_complete);
        autoCompleteTextView.setAdapter(adapter);
    }
}
