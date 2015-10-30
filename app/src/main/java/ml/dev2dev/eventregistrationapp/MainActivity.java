package ml.dev2dev.eventregistrationapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
ImageView tweetimg;
    TextView textView7;
    TextView textView8;
    TextView textView12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView8 =(TextView) findViewById(R.id.textView8);
        textView7 = (TextView) findViewById(R.id.textView7);
        tweetimg = (ImageView) findViewById(R.id.tweetimg);
        textView12 = (TextView) findViewById(R.id.textView12);
        tweetimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(MainActivity.this, Twitter.class);
                startActivity(b);
                finish();
            }
        });

        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(MainActivity.this, actors.class);
                startActivity(m);
                finish();
            }
        });
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent c = new Intent(MainActivity.this,agenda.class);
                startActivity(c);
                finish();
            }
        });
        textView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(MainActivity.this, information.class);
                startActivity(n);
                finish();
            }
        });
    }

}
