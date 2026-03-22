package khiem.it.danhsachtinhthanh;

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

        // Hiển thị dữ liệu lên list view
        //B1: + Cần phải có dữ liệu: ??Dữ liệu  đâu ở có
        // Cần biến phù hợp để chứa dữ liêệu
        ArrayList<String> dsTenTinhThanhVN; // Khai báo
        dsTenTinhThanhVN = new ArrayList<String>(); //Tạo thể hiện cụ thể / xin mới
        //THêm dữ liệu
        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("Hồ Chí Minh");
        dsTenTinhThanhVN.add("Khánh Hòa");
        dsTenTinhThanhVN.add("Phú Yên");
        //B2: Tạo adapter
        ArrayAdapter<String> adapterTinhThanh;
        adapterTinhThanh = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsTenTinhThanhVN);

        //B3: gắn vaofo điều khiển hiển thị ListView
        //3.1 Timf
        ListView lvTenTinhThanh = findViewById(R.id.lvDSTinhThanh);
        ///3.2 Gắn vào
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
        //3.3 Lắng nghe vào xử lý sự kiện ngươi dùng / user tương tác


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}