package br.com.programadoresemacao.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

import br.com.programadoresemacao.bean.PessoaEnviaObjeto;
import br.com.programadoresemacao.projetoaula.R;


public class EnviaObjetoActivity extends Activity {
    TextView txtNome;
    TextView txtTelefone;
    RadioGroup rdrSexo;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_envia_objeto);

        carregaComponentes();
    }



    public void enviar(View view) {
        String sexo = "";
        switch(rdrSexo.getCheckedRadioButtonId()){
            case R.id.envia_objeto_rbn_sexo_masculino:
                sexo = "Masculino";
                break;
            default:
                sexo = "Feminino";
                break;
        }

        PessoaEnviaObjeto pessoa = new PessoaEnviaObjeto(txtNome.getText().toString(), txtTelefone.getText().toString(), sexo);

        intent = new Intent(this, RecebeObjetoActivity.class);
        intent.putExtra("objeto", pessoa);
        startActivity(intent);
    }

    private void carregaComponentes() {
        txtNome = (TextView)findViewById(R.id.envia_objeto_edt_nome);
        txtTelefone = (TextView)findViewById(R.id.envia_objeto_edt_telefone);
        rdrSexo =  (RadioGroup)findViewById(R.id.envia_objeto_rgr_sexo);
    }
}
