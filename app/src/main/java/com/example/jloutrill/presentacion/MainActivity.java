package com.example.jloutrill.presentacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.R.attr.onClick;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText nombres;
    private EditText edad;
    private EditText apellidos;
    private Button mostrar;
    private Button limpiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mostrar = (Button) findViewById(R.id.button);
        limpiar = (Button) findViewById(R.id.button2);
        nombres = (EditText) findViewById(R.id.editText);
        edad = (EditText) findViewById(R.id.editText2);
        apellidos = (EditText) findViewById(R.id.editText3);
        mostrar.setOnClickListener(MainActivity.this);
        limpiar.setOnClickListener(MainActivity.this);
    }



    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button:
                this.nombres.setText("Manuel Alberto");
                this.apellidos.setText("Tórrez Vado");
                this.edad.setText("18 años");
                break;
            case R.id.button2:
                this.nombres.getText().clear();
                this.apellidos.getText().clear();
                this.edad.getText().clear();
        }

    }

}
