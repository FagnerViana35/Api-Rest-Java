package com.ifsp.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.ifsp.cadastro.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;

    private String name;
    private String phone;
    private String email;
    private boolean checkoutEmails = false;
    private String sexo;
    private String city;
    private String uf;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        activityMainBinding.inputNameFull.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                name = charSequence.toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {}
        });

        activityMainBinding.inputPhone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                phone = charSequence.toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {}
        });

        activityMainBinding.inputEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                email = charSequence.toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {}
        });

        activityMainBinding.inputCity.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                city = charSequence.toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {}
        });

        activityMainBinding.checkbox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (activityMainBinding.checkbox1.isChecked()){
                    checkoutEmails = true;
                }else{
                    checkoutEmails = false;
                }
            }
        });

        activityMainBinding.sexoMasculino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sexo = String.valueOf(activityMainBinding.sexoMasculino.getText());
            }
        });

        activityMainBinding.sexoFeminino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sexo = String.valueOf(activityMainBinding.sexoFeminino.getText());
            }
        });

        activityMainBinding.inputUf.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0 ){
                    uf = "AC Acre";
                }else if(i == 1){
                   uf = "AL Alagoas";
                }else if(i == 2){
                    uf = "AP Amapá";
                }else if(i == 3){
                    uf = "AM Amazonas";
                }else if(i == 4){
                    uf = "CE Ceará";
                }else if(i == 5){
                    uf = "DF Distrito Federal";
                }else if(i == 6) {
                    uf = "ES Espírito Santo";
                }else if(i == 7){
                    uf = "GO Goiás";
                }else if(i == 8){
                    uf = "MA Maranhão";
                }else if(i == 9){
                    uf = "MT Mato Grosso";
                }else if(i == 10){
                    uf = "MS Mato Grosso do Sul";
                }else if(i == 11){
                    uf = "MG Minas Gerais";
                }else if(i == 12){
                    uf = "PA Pará";
                }else if(i == 13){
                    uf = "PB Paraíba";
                }else if(i == 14){
                    uf = "PR Paraná";
                }else if(i == 15) {
                    uf = "PE Pernambuco";
                }else if(i == 16){
                    uf = "PI Piauí";
                }else if(i == 17){
                    uf = "RN Rio Grande do Norte";
                }else if(i == 18){
                    uf = "RS Rio Grande do Sul";
                }else if(i == 19){
                    uf = "RO Rondônia";
                }else if(i == 20){
                    uf = "RR Roraima";
                }else if(i == 21){
                    uf = "SC Santa Catarina";
                }else if(i == 22){
                    uf = "SP São Paulo";
                }else if(i == 23){
                    uf = "SE Sergipe";
                }else if(i == 24) {
                    uf = "TO Tocantins";
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });

        activityMainBinding.botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Formulario formulario = new Formulario( name, phone, email, checkoutEmails, sexo, city, uf);
                Toast.makeText(MainActivity.this, formulario.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        activityMainBinding.botaoLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityMainBinding.inputNameFull.setText("");
                activityMainBinding.inputPhone.setText("");
                activityMainBinding.inputEmail.setText("");
                activityMainBinding.inputCity.setText("");
                activityMainBinding.checkbox1.setChecked(false);
                activityMainBinding.sexoMasculino.setChecked(false);
                activityMainBinding.sexoFeminino.setChecked(false);
            }
        });
    }
}