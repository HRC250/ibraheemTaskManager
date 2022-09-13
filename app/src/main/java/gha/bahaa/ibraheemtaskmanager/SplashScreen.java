package gha.bahaa.ibraheemtaskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        //start next activity screen automatically after period of time
        Handler h= new Handler();
        Runnable r=new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(SplashScreen.this,sign_in.class);
                startActivity(i);
                finish();
            }
        };
        h.postDelayed(r,3000);



    }
}