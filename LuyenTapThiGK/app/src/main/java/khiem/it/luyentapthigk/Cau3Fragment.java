package khiem.it.luyentapthigk;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Cau3Fragment extends Fragment {
    LandScapeAdapter adapter;
    ArrayList<LandScape> list;

    RecyclerView recyclerViewLandScape;

    public Cau3Fragment() {

    }


    // TODO: Rename and change types and number of parameters
    public static Cau3Fragment newInstance(String param1, String param2) {
        Cau3Fragment fragment = new Cau3Fragment();
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
        // Inflate the layout for this fragment
        View viewCau3 = inflater.inflate(R.layout.fragment_cau3, container, false);
        //4. tim dieu khien recy
        recyclerViewLandScape = viewCau3.findViewById(R.id.ryCau3);

        list = new ArrayList<LandScape>();
        list.add(new LandScape("Thap Paris", "thap1"));
        list.add(new LandScape("Thap Cao", "thap2"));
        list.add(new LandScape("Thap DuBai", "thap3"));
        list.add(new LandScape("Thap Nghien", "thap4"));

        //5. tao layout manager de cai dat bo cuc cho recy
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(viewCau3.getContext());
        recyclerViewLandScape.setLayoutManager(layoutLinear);

        //6. tao adapter gan vao du lieu
        adapter = new LandScapeAdapter(viewCau3.getContext(),list);
        //7. gan adapter vao recy
        recyclerViewLandScape.setAdapter(adapter);



        return viewCau3;
    }
}