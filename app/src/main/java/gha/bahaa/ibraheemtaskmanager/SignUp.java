package gha.bahaa.ibraheemtaskmanager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUp extends AppCompatActivity {

    TextInputEditText etEmail2;
    TextInputEditText etPassword2;
    TextInputEditText etConfirm;
    Button ButtonSave;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        etEmail2 = findViewById(R.id.etEmail2);
        etPassword2 = findViewById(R.id.etPassword2);
        etConfirm = findViewById(R.id.etConfirm);
        ButtonSave = findViewById(R.id.ButtonSave);
        ButtonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAndSave();
            }


        });

    }





    //تستعمل للدخول والتسجيل و الخروج ,sign in up and out
    private void checkAndSave() {
        String email=etEmail2.getText().toString();
        String pass=etPassword2.getText().toString();
        String passConf=etConfirm.getText().toString();

        boolean isok=true;
        if (email.length()*pass.length()*passConf.length()==0)
        {
            etEmail2.setError("one of the files is empty");
            isok=false;
        }
        if (pass.equals(passConf)==false)
        {
            etConfirm.setError("is not equal to password");
            isok=false;
        }
        if (isok)
        {
            FirebaseAuth auth=FirebaseAuth.getInstance();
            auth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                /**
                 * معالجة حدث عندما تكون المهمة ومعلومات عن الحدث
                 */
                public void onComplete(@NonNull Task<AuthResult> task) {
                    //فحص اذا بناء حساب ناجح
                    if (task.isSuccessful())
                    {
                        Toast.makeText(SignUp.this, "", Toast.LENGTH_SHORT).show();
                        //اغلاق الشاشة الحالية
                        finish();
                    }
                    else
                        Toast.makeText(SignUp.this, "cereation faild"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }
            });

        }
    }
}







