package com.br.cursotoggleeswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private Switch campoSenha;
    private ToggleButton campoToggle;
    private TextView textoResultadoSwithc, textoResultadoToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoSenha = findViewById(R.id.edit_switch);
        campoToggle = findViewById(R.id.edit_toggleButton);
        textoResultadoSwithc = findViewById(R.id.text_resultadoSwitch);
        textoResultadoToggle = findViewById(R.id.text_resultadoToggle);


        toggleButton();
    }

    public void toggleButton(){

        campoToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                String textoToggle ="";
                if (campoToggle.isChecked()){
                    String opSelec = "Toggle Ligado!";
                    textoToggle = opSelec;

                    //textoResultadoToggle.setText("Toggle Ligado!");
                }else{
                    String opSelec = "Toggle Desligado!";
                   textoToggle = opSelec;

                   //textoResultadoToggle.setText("Toggle Desligado!");
                }
                textoResultadoToggle.setText(textoToggle);
            }
        });


    }

    public void enviar(View view){



        if (campoSenha.isChecked()){
            textoResultadoSwithc.setText("Switch Ligado");
        }else{
            textoResultadoSwithc.setText("Switch Desligado");
        }

    }

}