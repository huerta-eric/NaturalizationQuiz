package lalax.com.citizen.controllers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import lalax.com.citizen.R;

public class ProgressActivity extends AppCompatActivity {

    private TextView progressScoreTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        // Created the text box where the score will be displayed
        progressScoreTextView = (TextView) findViewById(R.id.progress_score_text_view);




        //MyApp appState = ((MyApp)getApplicationContext());
        //String state = appState.getScore();
        progressScoreTextView.setText(" boo");


    }
}
