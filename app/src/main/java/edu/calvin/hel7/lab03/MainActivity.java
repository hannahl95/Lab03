package edu.calvin.hel7.lab03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView invalidTextView;
    private ImageView androidImageView;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        invalidTextView = (TextView) findViewById(R.id.invalidTextView);
        invalidTextView.setVisibility(View.INVISIBLE);
        androidImageView = (ImageView) findViewById(R.id.androidImageView);
        androidImageView.setVisibility(View.INVISIBLE);
        passwordEditText = (EditText) findViewById(R.id.passwordEditText);
        passwordEditText.setOnEditorActionListener(new TextView.OnEditorActionListener(){

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event){
               String password = passwordEditText.getText().toString();
               if (password.equals("password")){
                   invalidTextView.setVisibility(View.INVISIBLE);
                   androidImageView.setVisibility(View.VISIBLE);
               } else {
                   invalidTextView.setVisibility(View.VISIBLE);
                   androidImageView.setVisibility(View.INVISIBLE);
               }
               return false;
           }
        });
    }
}
