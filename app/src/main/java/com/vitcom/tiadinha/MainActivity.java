package com.vitcom.tiadinha;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton = (ImageButton) findViewById(R.id.imbdinha);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setMessage("Parabens pra tia dinha mais especial do mundo" + "\n" + "Parabens pelos 57 anos bem vivido" );
                dlg.setNeutralButton("Click aqui para fechar essa mensagem especial",null);
                dlg.show();



            }
        });

    }
}
