package com.example.chh2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   private String newWOrd = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtResult = findViewById(R.id.txtResult);
        EditText edtName = findViewById(R.id.edtText);
        Button btnResult = findViewById(R.id.BtnRearrange);





        //  char[] name = new char[tom.length];
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String word = edtName.getText().toString();

                char[] reve = word.toCharArray();

newWOrd = "";
                for (int i = reve.length-1; i >=0; i--) {
                    newWOrd = newWOrd +   reve[i]  +  " ";
                }



                txtResult.setText(newWOrd  );

            }
        });
    }





}