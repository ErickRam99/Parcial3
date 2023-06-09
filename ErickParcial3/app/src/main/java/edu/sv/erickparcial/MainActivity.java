package edu.sv.erickparcial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import edu.sv.erickparcial.clases.guardarfrag;



public class MainActivity extends AppCompatActivity {
    BottomNavigationView btnNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNav = findViewById(R.id.btnNav);

        btnNav.setOnNavigationItemSelectedListener((BottomNavigationView.OnNavigationItemSelectedListener) navaListener);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navaListener= new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment seleccionFrag= null;

            switch (item.getItemId()){
                case R.id.guardar:
                    seleccionFrag = new guardarfrag();
                    break;
                case R.id.editar:
                    seleccionFrag = new guardarfrag();
                    break;
                case R.id.eliminar:
                    seleccionFrag = new guardarfrag();
                    break;

            }

            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentCont, seleccionFrag).commit();
            return true;

        }



    };

    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuimaganes,menu);
        return true ;

    }

    public boolean onOptionsItemSelected(MenuItem items) {



        switch (items.getItemId()) {

            case R.id.opcion1:
                Toast.makeText(this, "Selecciono la opcion 1" + 1, Toast.LENGTH_SHORT).show();

                return true;
            case R.id.opcion2:
                Toast.makeText(this, "Selecciono la opcion 2" + 1, Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opcion3:
                Toast.makeText(this, "Selecciono la opcion 3" + 1, Toast.LENGTH_SHORT).show();
                return true;


        }

        return super.onOptionsItemSelected(items);
    }
}