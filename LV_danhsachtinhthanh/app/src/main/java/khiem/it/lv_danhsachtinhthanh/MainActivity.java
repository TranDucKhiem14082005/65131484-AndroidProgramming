package khiem.it.lv_danhsachtinhthanh;

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

        // Hiển thị dữ liệu lên listview
        //B1: Cần có dữ liệu
        // Dữ liệu từ đâu có: từ database
        // ở bài này chúng ta sẽ hard-code dữ liệu trực tiếp
        //Cần biến phù hợp để chứa dữ liệu
        ArrayList<String> dsTenTinhThanhVN; //Khai báo
        dsTenTinhThanhVN = new ArrayList<String>(); // xin mới
        //Thêm dữ liệu ở đây (đúng ra, tả phải đọc dữ liệu từ một source nào đó để lấy dữ liệu)
        dsTenTinhThanhVN.add("Thành Phồ Hồ Chí Minh");
        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("Phú Yên");
        dsTenTinhThanhVN.add("Nha Trang");
        dsTenTinhThanhVN.add("Quy Nhơn");

        //B2: Tạo adapter
        ArrayAdapter<String> adapterTinhThanh = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsTenTinhThanhVN);

        //B3: Gắn vào điều khển hiển thị ListView
        //3.1: Tìm điều khiêển listview đó
        ListView lvTenTinhThanh = findViewById(R.id.LV_DSTT);
        //3.2: Gắn vào
        lvTenTinhThanh.setAdapter(adapterTinhThanh);

        //3.3: Lắng nghe vào xử lý sự kiện mà người dùng tương tác

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}