package com.ptp.phamtanphat.fragmenttinhtoan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Tinhtoan {

    int Number = 20;
    TextView txtMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMain = findViewById(R.id.textviewKetqua);
        rxjava, rxandroid , dagger , singleton , retrofit , webservice

    }

    @Override
    public void ReciveData(int number) {
        Number += number;
        txtMain.setText(" = " + Number);
    }
}
