package gha.bahaa.ibraheemtaskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class sign_in extends AppCompatActivity {

    TextInputEditText EtEmail;
    TextInputEditText Etpass;
    Button ButtonSignUp;
    Button ButtonSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in2);

        EtEmail=findViewById(R.id.EtEmail);
        Etpass=findViewById((R.id.Etpass));
        ButtonSignUp=findViewById(R.id.ButtonSignUp);
        ButtonSignIn=findViewById(R.id.ButtonSignIn);

        ButtonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}