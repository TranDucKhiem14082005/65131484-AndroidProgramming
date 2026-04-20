package thigk2.tranduckhiem;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class ChucNang2Fragment extends Fragment {
    ArrayList<String> dsTenBHCMVN;


    public ChucNang2Fragment() {
        // Required empty public constructor
    }



    public static ChucNang2Fragment newInstance(String param1, String param2) {
        ChucNang2Fragment fragment = new ChucNang2Fragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    AdapterView.OnItemClickListener BoLangNgheVaXl = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            String tenBH = dsTenBHCMVN.get(position);
            Toast.makeText(getContext(), "Bạn vừa chọn bài hát thứ " +
                    String.valueOf(position + 1) + " - Bài hát tó tên là: " + tenBH,Toast.LENGTH_LONG).show();


        }
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewCN2 = inflater.inflate(R.layout.fragment_chuc_nang2, container, false);
        dsTenBHCMVN = new ArrayList<>();
        dsTenBHCMVN.add("Đất nước trọn niềm vui");
        dsTenBHCMVN.add("Trần Đức Khiêm");
        dsTenBHCMVN.add("Bác đang cùng chúng cháu hành quân");
        dsTenBHCMVN.add("Cô gái mở đường");
        dsTenBHCMVN.add("Chào em cô gái Lam Hồng");
        dsTenBHCMVN.add("Tấm áo chiến sĩ mẹ vá năm xưa");
        dsTenBHCMVN.add("Hát mãi khúc quân hành");
        dsTenBHCMVN.add("Tiểu đoàn 307");
        dsTenBHCMVN.add("Năm anh em trên một chiếc xe tăng");
        dsTenBHCMVN.add("Tàu anh qua núi ");

        // 2. Ánh xạ ListView
        ListView lvTenTinhThanh = viewCN2.findViewById(R.id.LV_DSBH);

        // 3. Adapter
        ArrayAdapter<String> adapterTinhThanh = new ArrayAdapter<>(
                getContext(),
                android.R.layout.simple_list_item_1,
                dsTenBHCMVN
        );

        lvTenTinhThanh.setAdapter(adapterTinhThanh);

        // 4. Click item
        lvTenTinhThanh.setOnItemClickListener(BoLangNgheVaXl);
        return viewCN2;
    }
}