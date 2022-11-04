package com.example.scrollingtextwithbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.window.SplashScreen;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button mButton_op;
    private EditText mEditText_opinion;
    private TextView mText;
    private TextView mReview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton_op = findViewById(R.id.button_opinion);
        mEditText_opinion = findViewById(R.id.opinion);
        mText = findViewById(R.id.article);
        mReview = findViewById(R.id.Texto_opinion);


        mButton_op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Esto en el caso de que el edit text este desactivado
                if (mEditText_opinion.getVisibility() == View.GONE){
                    //Para ocultar el texto
                    mText.setVisibility(View.GONE);
                    //Hacer visible el edit Text
                    mEditText_opinion.setVisibility(View.VISIBLE);
                    //Para cambiar de texto el boton ya creado
                    mButton_op.setText("Enviar");

                }else{
                    mText.setVisibility(View.VISIBLE);
                    mEditText_opinion.setVisibility(View.GONE);
                    mButton_op.setText("Escribe tu opinion");

                    //Para coger el valor de dentro mReview
                    String mOpinion = mEditText_opinion.getText().toString();
                    mReview.setText(mReview.getText().toString()+"\n"+ mOpinion);
                    mEditText_opinion.setText("");

                }

            }
        });
    }

}