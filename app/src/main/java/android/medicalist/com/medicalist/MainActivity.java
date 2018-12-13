package android.medicalist.com.medicalist;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getSupportActionBar().hide();


        BottomNavigationView navigationView = findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.navigation_home:
                        onChangeFragment(new HomeFragment());
                        return true;
                    case R.id.navigation_citas:
                        onChangeFragment(new CitasFragment());
                        return true;
                    case R.id.navigation_medicamentos:
                        onChangeFragment(new MedicamentosFragment());
                        return true;
                    case R.id.navigation_calendario:
                        onChangeFragment(new CalendarFragment());
                        return true;
                }
                return false;
            }
        });

        this.onChangeFragment(new HomeFragment());

    }

    private void onChangeFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        FrameLayout frameLayout = findViewById(R.id.fragment_layout);
        ft.replace(frameLayout.getId(), fragment, fragment.toString());
        //ft.addToBackStack(fragment.toString());
        ft.commit();
    }

    /*private void addTextView(View v){
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
    }*/
}
