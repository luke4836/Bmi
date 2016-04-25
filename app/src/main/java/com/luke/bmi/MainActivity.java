package com.luke.bmi;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private EditText edWeight;
    private EditText edHeight;
    private Button btn_help;

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_main);
        findViews();
        findViews2();
        btn_help.setOnClickListener(this);
    }

    private void findViews() {
        edWeight = (EditText) findViewById(R.id.ed_weight);
        edHeight = (EditText) findViewById(R.id.ed_height);

        Button btn_cal = (Button) findViewById(R.id.btn_cal);
        btn_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float getw = Float.parseFloat(edWeight.getText().toString());
                float geth = Float.parseFloat(edHeight.getText().toString());

                float bmi = getw / (geth * geth);

                Log.d("BMI:", String.valueOf(bmi));
                Toast.makeText(MainActivity.this, "BMI:" + bmi, Toast.LENGTH_LONG).show();
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle(getString(R.string.alertdialog_tite))
                        .setMessage("Your BMI is :" + bmi)
                        .setPositiveButton("OK", null)
                        .setNegativeButton("Cancel", null)
                        .setNeutralButton("中性按鈕", null)
                        .show();
            }
        });

    }

    private void findViews2() {
        edWeight = (EditText) findViewById(R.id.ed_weight);
        edHeight = (EditText) findViewById(R.id.ed_height);
        btn_help = (Button) findViewById(R.id.btn_help);
    }

    @Override
    public void onClick(View v) {
        new AlertDialog.Builder(MainActivity.this).setTitle("Help")
                .setMessage("Help Message")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.d("OK Click", "Click OK BTN");
                    }
                })
                .show();


    }
}
