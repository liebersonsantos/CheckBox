package com.example.lieberson.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBoxcao;
    private CheckBox checkBoxgato;
    private CheckBox checkBoxpapagaio;

    private Button botaomostrar;
    private TextView textoExibicao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxcao = findViewById(R.id.checkBoxCaoId);
        checkBoxgato = findViewById(R.id.checkBoxGatoId);
        checkBoxpapagaio = findViewById(R.id.checkBoxPapagaioId);

        botaomostrar = findViewById(R.id.botaoMostrarId);

        textoExibicao = findViewById(R.id.textoExibicaoId);


        botaomostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String itemSelecionado = "";

               itemSelecionado +="item: " + checkBoxcao.getText() + "Status: " + checkBoxcao.isChecked() + "\n";
               itemSelecionado +="item: " + checkBoxgato.getText() + "Status: " + checkBoxgato.isChecked() + "\n";
               itemSelecionado +="item: " + checkBoxpapagaio.getText() + "Status: " + checkBoxpapagaio.isChecked() + "\n";

               textoExibicao.setText(itemSelecionado);





            }
        });








    }
}
