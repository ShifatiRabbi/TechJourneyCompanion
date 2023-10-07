package com.example.techjourneycompanion;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
public class CurrencyConverter extends AppCompatActivity {


    Button btnClear, btnCalculate;
    EditText edtInput;
    RadioButton USDtoBDT, BDTtoUSD, INRtoUSD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);


        btnCalculate = findViewById(R.id.btnCalculate);
        btnClear = findViewById(R.id.btnClear);
        edtInput = findViewById(R.id.edtInput);
        BDTtoUSD = findViewById(R.id.BDTtoUSD);
        USDtoBDT = findViewById(R.id.USDtoBDT);
        INRtoUSD = findViewById(R.id.INRtoUSD);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double input = new Double(edtInput.getText().toString());

                if(BDTtoUSD.isChecked()){
                    double result = ConvertCurrency.BDTtoUSD(input);
                    edtInput.setText(new Double(result).toString());
                }
                else if(USDtoBDT.isChecked()){
                    double result = ConvertCurrency.USDtoBDT(input);
                    edtInput.setText(new Double(result).toString());
                }
                else if(INRtoUSD.isChecked()){
                    double result = ConvertCurrency.INRtoUSD(input);
                    edtInput.setText(new Double(result).toString());
                }
            }
        });

    }
    public static class ConvertCurrency {

        public static double USDtoBDT(double usdB) {
            usdB = usdB * 107;
            return usdB;
        }

        public static double BDTtoUSD(double bdtU) {
            bdtU = bdtU / 107;
            return bdtU;
        }

        public static double INRtoUSD(double inrU) {
            inrU = inrU / 82;
            return inrU;
        }
    }
}
