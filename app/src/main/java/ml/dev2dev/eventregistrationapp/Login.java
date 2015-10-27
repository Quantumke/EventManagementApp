package ml.dev2dev.eventregistrationapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.nativecss.NativeCSS;

public class Login extends AppCompatActivity {
    Button facebook, gplus, twitter;
    TextView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        NativeCSS.styleWithCSS("initial.css", "ml.dev2dev.eventregistrationapp");
        setContentView(R.layout.activity_login);
        login = (TextView) findViewById(R.id.login);
        gplus = (Button) findViewById(R.id.gplus);
        twitter = (Button) findViewById(R.id.twitter);
        facebook = (Button) findViewById(R.id.facebook);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Login.this, MainActivity.class);
                startActivity(a);
                finish();

            }
        });


        gplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Login.this, MainActivity.class);
                startActivity(a);
                finish();

            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Login.this, MainActivity.class);
                startActivity(a);
                finish();

            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Login.this, MainActivity.class);
                startActivity(a);
                finish();

            }
        });



    }

}
