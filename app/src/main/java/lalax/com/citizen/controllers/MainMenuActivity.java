package lalax.com.citizen.controllers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import lalax.com.citizen.R;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        //Created the button which will open QuestionnaireActivity
        ImageButton questionnaireBtn = (ImageButton) findViewById(R.id.questionnaire_btn);

        //Created the button which will open ProgressActivity.
        ImageButton progressBtn = (ImageButton) findViewById(R.id.progress_btn);

        //Created the button which will open DifficultyActivity.
        ImageButton difficultyBtn = (ImageButton) findViewById(R.id.difficulty_btn);


        //Method launched when questionnaireBtn is clicked
        questionnaireBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(), QuestionnaireActivity.class);
                startActivity(startIntent);
            }
        });

        //Method launched when questionnaireBtn is clicked
        progressBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(), ProgressActivity.class);
                startActivity(startIntent);
            }
        });

        //Method launched when difficultyBtn is clicked
        difficultyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(), DifficultyActivity.class);
                startActivity(startIntent);
            }
        });
    }

}
