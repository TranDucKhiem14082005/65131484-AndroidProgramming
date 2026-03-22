package com.example.tinhtong;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        // gắn layou với file này
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //Đây là bộ lắng nghe và xử lý sự kiến click lên button Tính tổng,
    public void XuLyCong(View view) {
        //Tìm và tham chiếu đên các điều khiển trên XML, mapping sang file java file
        EditText editTextSoA =  findViewById(R.id.edtA);
        EditText editTextSoB =  findViewById(R.id.edtB);
        EditText editTextSoKQ =  findViewById(R.id.edtKQ);
        // Lấy dữ liệu về ở điều khiển a
        String strA =  editTextSoA.getText().toString();
        // Lấy dữ liệu về ở điều khiển b
        String strB =  editTextSoB.getText().toString();

        // Chuyển dữ liệu sang dạng số
        int soA = Integer.parseInt(strA);
        int soB = Integer.parseInt(strB);
        //Tính tổng theo yêu cầu
        int Tong = soA + soB;
        String strTong = String.valueOf(Tong); // Chuyển sang daạng chuỗi
        //Hiển ra màn hình

        editTextSoKQ.setText(strTong);
    }
}