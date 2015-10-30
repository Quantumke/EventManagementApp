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
    TextView speaker;
    TextView agenda;
    TextView information;
    TextView twitter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        speaker =(TextView) findViewById(R.id.speaker);
        agenda = (TextView) findViewById(R.id.agenda);
        information = (TextView) findViewById(R.id.info);
        twitter = (TextView) findViewById(R.id.twitter);

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(MainActivity.this, Twitter.class);
                startActivity(b);
                finish();
            }
        });

        speaker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(MainActivity.this, actors.class);
                startActivity(m);
                finish();
            }
        });
        agenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent c = new Intent(MainActivity.this,agenda.class);
                startActivity(c);
                finish();
            }
        });
        information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(MainActivity.this, information.class);
                startActivity(n);
                finish();
            }
        });
    }

}
