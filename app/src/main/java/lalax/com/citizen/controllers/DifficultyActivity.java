package lalax.com.citizen.controllers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import lalax.com.citizen.R;

public class DifficultyActivity extends AppCompatActivity {

    private TextView difficultyScoreTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);

        // Created the text box where the score will be displayed
        difficultyScoreTextView = (TextView) findViewById(R.id.difficulty_score_text_view);


        // set text
       // difficultyScoreTextView.setText("");

    }
}
