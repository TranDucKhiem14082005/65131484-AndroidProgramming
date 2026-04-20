package khiem.it.luyentapthigk;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class Cau4Fragment extends Fragment {

    ArrayList<String> dsTenTinhThanhVN;

    public Cau4Fragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static Cau4Fragment newInstance(String param1, String param2) {
        Cau4Fragment fragment = new Cau4Fragment();
        Bundle args = new Bundle();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    AdapterView.OnItemClickListener BoLangNgheVaXl = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            // Code xử lý ở đây
            // position là vị trí phần tử đươc click
            // Ví dụ xử lý  ở đây, Hiêện lên một thông báo nhanh về vị trí của phần tử vừa chọn

            // vd khác, thay vì hiên thị vị trí thì mình sẽ hiển thị giá trị của nó
            // lấy giá trị của phần tử thứ position
            String tenTinh = dsTenTinhThanhVN.get(position);
            Toast.makeText(getContext(), "Bạn vừa chọn phần tử thứ " +
                    String.valueOf(position + 1) + " - Có tên là: " + tenTinh,Toast.LENGTH_LONG).show();


        }
    };
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cau4, container, false);
        dsTenTinhThanhVN = new ArrayList<>();
        dsTenTinhThanhVN.add("Thành Phố Hồ Chí Minh");
        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("Phú Yên");
        dsTenTinhThanhVN.add("Nha Trang");
        dsTenTinhThanhVN.add("Quy Nhơn");

        // 2. Ánh xạ ListView
        ListView lvTenTinhThanh = view.findViewById(R.id.LV_DSTT);

        // 3. Adapter
        ArrayAdapter<String> adapterTinhThanh = new ArrayAdapter<>(
                getContext(),
                android.R.layout.simple_list_item_1,
                dsTenTinhThanhVN
        );

        lvTenTinhThanh.setAdapter(adapterTinhThanh);

        // 4. Click item
        lvTenTinhThanh.setOnItemClickListener(BoLangNgheVaXl);
        return view;
    }
}