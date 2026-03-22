package khiem.it.dsvatlieu;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ArrayList<String> dsLoaiVatLieu;
        dsLoaiVatLieu = new ArrayList<String>();
        dsLoaiVatLieu.add("Xi Măng");
        dsLoaiVatLieu.add("Gạch");
        dsLoaiVatLieu.add("Đá ốp lát");
        dsLoaiVatLieu.add("Ông nhựa");
        dsLoaiVatLieu.add("Sơn chống thâm");

        ArrayAdapter<String> adapterVatLieu;
        adapterVatLieu = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,dsLoaiVatLieu);

        ListView dsTenVatLieu = findViewById(R.id.dsVatLieu);

        dsTenVatLieu.setAdapter(adapterVatLieu);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}