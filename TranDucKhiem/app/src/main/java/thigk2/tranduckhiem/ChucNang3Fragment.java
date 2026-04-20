package thigk2.tranduckhiem;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class ChucNang3Fragment extends Fragment {
    LandScapeAdapter adapter;
    ArrayList<LandScape> list;

    RecyclerView recyclerViewLandScape;

    public ChucNang3Fragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static ChucNang3Fragment newInstance(String param1, String param2) {
        ChucNang3Fragment fragment = new ChucNang3Fragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewCN3 = inflater.inflate(R.layout.fragment_chuc_nang3, container, false);
        //4. tim dieu khien recy
        recyclerViewLandScape = viewCN3.findViewById(R.id.recycCN3);

        list = new ArrayList<LandScape>();
        list.add(new LandScape("Hồ Chí Minh", "img","Quê ở làng Sen (Kim Liên), xã Kim Liên, huyện Nam Đàn, tỉnh Nghệ An."));
        list.add(new LandScape("Nguyễn Trãi", "img_1","Quê gốc ở làng Chi Ngại, huyện Phượng Sơn, lộ Lạng Giang (nay thuộc Chí Linh, Hải Dương), sinh ra tại Thăng Long."));
        list.add(new LandScape("Nguyễn Du", "img_2","Quê ở làng Tiên Điền, huyện Nghi Xuân, tỉnh Hà Tĩnh."));
        list.add(new LandScape("Chu Văn An", "img_3","Quê ở thôn Quang Liệt, xã Quang Liệt, huyện Thanh Đàm (nay là xã Thanh Liệt, huyện Thanh Trì, Hà Nội)."));
        list.add(new LandScape("Nguyễn Đình Chiểu", "img_4,", "Quê gốc ở làng Phong Điền, huyện Phong Điền, tỉnh Thừa Thiên Huế (sinh ra tại Gia Định - nay là TP. Hồ Chí Minh)"));

        //5. tao layout manager de cai dat bo cuc cho recy
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(viewCN3.getContext());
        recyclerViewLandScape.setLayoutManager(layoutLinear);

        //6. tao adapter gan vao du lieu
        adapter = new LandScapeAdapter(viewCN3.getContext(),list);
        //7. gan adapter vao recy
        recyclerViewLandScape.setAdapter(adapter);



        return viewCN3;
    }
}