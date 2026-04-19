package khiem.it.luyentapthigk;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottomNavigationView);
        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment selectedFragment = null;
                int itemID = menuItem.getItemId();
                if (itemID == R.id.nav_home) {
                    selectedFragment = new HomeFragment();
                }
                if(itemID == R.id.nav_cau1) {
                    selectedFragment = new Cau1Fragment();
                }
                if(itemID == R.id.nav_cau2) {
                    selectedFragment = new Cau2Fragment();
                }
                if(itemID == R.id.nav_cau3) {
                    selectedFragment = new Cau3Fragment();
                }
                if(itemID == R.id.nav_cau4) {
                    selectedFragment = new Cau4Fragment();
                }

                if(selectedFragment != null) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentspace, selectedFragment).commit();
                }


                return true;
            }
        });


    }
}