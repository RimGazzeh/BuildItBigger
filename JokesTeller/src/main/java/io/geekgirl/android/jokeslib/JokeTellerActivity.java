package io.geekgirl.android.jokeslib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeTellerActivity extends AppCompatActivity {

    TextView mJokesTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joketeller);
        String jokeExtra = getIntent().getStringExtra(Constants.JOKE_INTENT);
        mJokesTextView = findViewById(R.id.tv_joke);
        mJokesTextView.setText(jokeExtra);
    }

}
