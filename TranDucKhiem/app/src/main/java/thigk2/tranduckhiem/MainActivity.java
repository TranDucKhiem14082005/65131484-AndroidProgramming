package thigk2.tranduckhiem;

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
                if (itemID == R.id.nav_chunang1) {
                    selectedFragment = new ChucNang1Fragment();
                }
                if (itemID == R.id.nav_chunang2) {
                    selectedFragment = new ChucNang2Fragment();
                }
                if (itemID == R.id.nav_chunang3) {
                    selectedFragment = new ChucNang3Fragment();
                }
                if (itemID == R.id.nav_chunang4) {
                    selectedFragment = new ChucNang4Fragment();
                }


                if (selectedFragment != null) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentspace, selectedFragment).commit();
                }


                return true;
            }


        });
    }
}