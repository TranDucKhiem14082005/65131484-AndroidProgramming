package khiem.it.luyentap;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Cau1Fragment extends Fragment {

    EditText editText_M;
    EditText editText_KM;
    Button btnChuyen;


    public Cau1Fragment() {


    }


    public static Cau1Fragment newInstance(String param1, String param2) {
        Cau1Fragment fragment = new Cau1Fragment();
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

        View viewCau1 = inflater.inflate(R.layout.fragment_cau1, container, false);
        // Tim điều khiểm
        editText_M = viewCau1.findViewById(R.id.edTexso1);
        editText_KM = viewCau1.findViewById(R.id.edTextso2);
        btnChuyen = viewCau1.findViewById(R.id.btndoi);

        btnChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String DLMet = editText_M.getText().toString();
                String DLKM = editText_KM.getText().toString();
                if (!DLMet.isEmpty()) {

                    Toast.makeText(viewCau1.getContext(),"m->km",Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(viewCau1.getContext(),"km->m",Toast.LENGTH_SHORT).show();
                }
            }
        });

        return viewCau1;
    }
}