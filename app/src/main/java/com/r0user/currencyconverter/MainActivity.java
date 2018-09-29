package com.r0user.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertAmount(View view){


        EditText rsAmount = findViewById(R.id.rsAmount);
        Log.i("amount", "Entered Amount is" + rsAmount.getText().toString());

        if (rsAmount.getText().toString().equals(""))
        {
            Toast.makeText(MainActivity.this, "Enter Some Value First",Toast.LENGTH_SHORT).show();
        }

        else
        {
            Double rsAmountDouble = Double.parseDouble(rsAmount.getText().toString());
            Double dollarAmount = rsAmountDouble * 0.014;
            Toast.makeText(MainActivity.this, "$" + dollarAmount.toString(),Toast.LENGTH_SHORT).show();
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
