package com.hacktivate8.assignment2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv_jumlah;
    Button b_hitung;
    EditText et_kata;
    int jumlah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_jumlah = findViewById(R.id.tv_totalID);
        b_hitung = findViewById(R.id.b_tambahID);
        et_kata = findViewById(R.id.et_kataID);

        b_hitung.setOnClickListener(this);
    }

    @Override
    public void onClick (View v) {
        System.out.println("+1");

        String current_tv_jumlah = tv_jumlah.getText().toString();
        int current_jumlah = Integer.valueOf(current_tv_jumlah);

        jumlah = current_jumlah + 1;
        tv_jumlah.setText(String.valueOf(jumlah));
    }

    @Override
    public void onSaveInstanceState (Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("count", String.valueOf(tv_jumlah.getText()));
    }

    @Override
    public void onRestoreInstanceState (Bundle mySavedState) {
        super.onRestoreInstanceState(mySavedState);
        if (mySavedState != null) {
            String jumlah = mySavedState.getString("count");
            if (jumlah != null) tv_jumlah.setText(jumlah);
        }
    }

}