package android.medicalist.com.medicalist;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private AutoCompleteTextView mEmailView;
    private EditText mPasswordView;
    private View mLoginForm;
    private static final String LOGIN_KEY = "KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        // Comentario sasd

        /*SharedPreferences pref = getPreferences(Context.MODE_PRIVATE);
        if(pref.getBoolean(LOGIN_KEY, false)){
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }
        else{
            pref.edit().putBoolean(LOGIN_KEY, true).apply();
        }*/

        Button mLoginButton = findViewById(R.id.button_ingresar);
        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
/*
        this.mEmailView = findViewById(R.id.correo);
        this.mPasswordView = findViewById(R.id.contraseña);



        this.mLoginForm = findViewById(R.id.login_form);*/

    }

    private void login(){
        /*mEmailView.setError(null);
        mPasswordView.setError(null);
        mEmailView.setError("Completalo prro");*/
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        LoginActivity.this.startActivity(intent);
        finish();
    }
}
