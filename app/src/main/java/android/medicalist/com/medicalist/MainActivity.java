package android.medicalist.com.medicalist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        Button btn = findViewById(R.id.button_agregar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTextView(v);
            }
        });
    }

    private void addTextView(View v){
        ArrayList<String> lista = new ArrayList<>();
        lista.add("test 1");
        lista.add("test 2");
        lista.add("test 3");
        lista.add("test 4");

        LinearLayout linearLayout = findViewById(R.id.layout_contenido);

        for (String cadena: lista){
            TextView textView = new TextView(this);
            textView.setText(cadena);
            linearLayout.addView(textView);
        }
    }
}
