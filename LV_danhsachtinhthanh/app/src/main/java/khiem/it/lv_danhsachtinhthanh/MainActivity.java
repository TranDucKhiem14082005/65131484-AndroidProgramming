package khiem.it.lv_danhsachtinhthanh;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsTenTinhThanhVN; //Khai báo

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
        //Gắn bộ gắng nghe vào
        lvTenTinhThanh.setOnItemClickListener(BoLangNgheVaXl);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // Tạo bộ lắng nghe và xử lý sự kiện onclickItem, đặt vào một biến
    // vd: BoLangNgheVaXl
    AdapterView.OnItemClickListener BoLangNgheVaXl = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            // Code xử lý ở đây
            // position là vị trí phần tử đươc click
            // Ví dụ xử lý  ở đây, Hiêện lên một thông báo nhanh về vị trí của phần tử vừa chọn

            // vd khác, thay vì hiên thị vị trí thì mình sẽ hiển thị giá trị của nó
            // lấy giá trị của phần tử thứ position
            String tenTinh = dsTenTinhThanhVN.get(position);
            Toast.makeText(MainActivity.this, "Bạn vừa chọn phần tử thứ " + String.valueOf(position + 1) + " - Có tên là: " + tenTinh,Toast.LENGTH_LONG).show();


        }
    };

}