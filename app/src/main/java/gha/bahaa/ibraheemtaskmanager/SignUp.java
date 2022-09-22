package gha.bahaa.ibraheemtaskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class SignUp extends AppCompatActivity {

    TextInputEditText etEmail2;
    TextInputEditText etPassword2;
    TextInputEditText etConfirm;
    Button ButtonSave;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        etEmail2=findViewById(R.id.etEmail2);
        etPassword2=findViewById(R.id.etPassword2);
        etConfirm=findViewById(R.id.etConfirm);
        ButtonSave=findViewById(R.id.ButtonSave);``




    }
}