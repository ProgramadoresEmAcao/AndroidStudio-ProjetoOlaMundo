package br.com.programadoresemacao.activity.componentes;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import br.com.programadoresemacao.projetoaula.R;

public class ComponenteRadioGroupActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_componente_radio_group);
    }

    public void click(View view){
        RadioGroup radioGroup01 = (RadioGroup)findViewById(R.id.componentes_radiogroup_rgr_radiogroup01);
        RadioGroup radioGroup02 = (RadioGroup)findViewById(R.id.componentes_radiogroup_rgr_radiogroup02);

        String mensagem = "RadioGroup 01: ";

        switch (radioGroup01.getCheckedRadioButtonId()){
            case R.id.componentes_radiogroup_rbt_radio01:
                mensagem += "radio01 ";
                break;
            case R.id.componentes_radiogroup_rbt_radio02:
                mensagem += "radio02 ";
                break;
            case R.id.componentes_radiogroup_rbt_radio03:
                mensagem += "radio03 ";
                break;
            default:
                mensagem += "nenhum ";
                break;
        }
        mensagem += "\nRadioGroup 02: ";
        switch (radioGroup02.getCheckedRadioButtonId()){
            case R.id.componentes_radiogroup_rbt_radio11:
                mensagem += "radio11";
                break;
            case R.id.componentes_radiogroup_rbt_radio12:
                mensagem += "radio12";
                break;
            case R.id.componentes_radiogroup_rbt_radio13:
                mensagem += "radio13";
                break;
        }

        Toast.makeText(this,mensagem,Toast.LENGTH_LONG).show();

    }
}
