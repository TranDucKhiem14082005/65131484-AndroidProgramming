package khiem.it.vidu2;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    // Khai báo cái đối tượng gắn với điều khiển tương ứng ở đây
    EditText editTextso1;
    EditText editTextso2;
    EditText editTextsokq;

    Button nutCong,nutTru,nutChia,nutNhan;
    void TimDieuKhien(){
        editTextso1 = (EditText)findViewById(R.id.edt1);
        editTextso2 = (EditText)findViewById(R.id.edt2);
        editTextsokq = (EditText)findViewById(R.id.edtkq);
        nutCong = (Button) findViewById(R.id.btncong);
        nutTru = (Button) findViewById(R.id.btntru);
        nutNhan = (Button) findViewById(R.id.btnnhan);
        nutChia = (Button) findViewById(R.id.btnchia);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        // Gắn bộ lắng nghe sự kiện và cho code xử lý cho từng nút;
        View.OnClickListener boLangNgheCong = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Gọi hàm xử lý cộng
                xulycong();
            }
        };
        nutCong.setOnClickListener(boLangNgheCong);

        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 xulytru();
            }
        });

        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xulynhan();
            }
        });

        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xulychia();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    public void xulycong() {
        // Code xử lý ở đây.
        //Tìm và tham chiếu đến các điều khiển trên xml, và mapping sang file java

       String str1 = editTextso1.getText().toString();
       String str2 = editTextso2.getText().toString();

       float so1 = Float.parseFloat(str1);
       float so2 = Float.parseFloat(str2);

       float tong = so1 + so2;
       String strtong = String.valueOf(tong);
       editTextsokq.setText(strtong);
    }
    public void xulytru() {


        String str1 = editTextso1.getText().toString();
        String str2 = editTextso2.getText().toString();

        float so1 = Float.parseFloat(str1);
        float so2 = Float.parseFloat(str2);

        float tru = so1 - so2;
        String strtru = String.valueOf(tru);
        editTextsokq.setText(strtru);
    }
    public void xulynhan() {


        String str1 = editTextso1.getText().toString();
        String str2 = editTextso2.getText().toString();

        float so1 = Float.parseFloat(str1);
        float so2 = Float.parseFloat(str2);

        float nhan = so1 * so2;
        String strnhan = String.valueOf(nhan);
        editTextsokq.setText(strnhan);
    }
    public void xulychia() {


        String str1 = editTextso1.getText().toString();
        String str2 = editTextso2.getText().toString();

        float so1 = Float.parseFloat(str1);
        float so2 = Float.parseFloat(str2);

        float chia = so1 / so2;
        String strchia = String.valueOf(chia);
        editTextsokq.setText(strchia);
    }
}