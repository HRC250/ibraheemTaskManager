package gha.bahaa.ibraheemtaskmanager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class sign_in extends AppCompatActivity {

    TextInputEditText EtEmail;
    TextInputEditText Etpass;
    Button ButtonSignUp;
    Button ButtonSignIn;
    private View btnin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in2);

        EtEmail = findViewById(R.id.EtEmail);
        Etpass = findViewById((R.id.Etpass));
        ButtonSignUp = findViewById(R.id.ButtonSignUp);
        btnin = findViewById(R.id.btnin);

        ButtonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(sign_in.this, SignUp.class);
                startActivity(i);

            }
        });

        btnin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }



        private void checkAndSave() {
            String email = EtEmail.getText().toString();
            String pass = Etpass.getText().toString();
            boolean isOk = true;
            if (email.length() == 0) {
                EtEmail.setError("enter your email");
                isOk = false;
            }
            if (pass.length() == 0) {
                Etpass.setError("enter your password");
                isOk = false;
            }
            if (email.indexOf('@') <= 0) {
                EtEmail.setError("wrong email");
                isOk = false;
            }

            {
                Etpass.setError("password at least 7 character");
                isOk = false;
            }
            //******
            if (isOk) {
                FirebaseAuth auth = FirebaseAuth.getInstance();
                auth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(sign_in.this, "successful", Toast.LENGTH_SHORT).show();
                            Intent i = new Intent(sign_in.this, MainActivity.class);
                            startActivity(i);
                            finish();
                        } else {
                            Toast.makeText(sign_in.this, "not successful", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        }
}




