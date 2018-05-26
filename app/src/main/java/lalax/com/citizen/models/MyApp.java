package lalax.com.citizen.models;

import android.app.Application;

public class MyApp extends Application {

    private String myScore = "Current score";

    public String getScore(){
        return myScore;
    }

    //public void setScore(String s){myScore = s;}

}
