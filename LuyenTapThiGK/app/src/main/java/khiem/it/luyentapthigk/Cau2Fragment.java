package khiem.it.luyentapthigk;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Cau2Fragment extends Fragment {
    EditText editText_MET;
    EditText editText_KM;
    Button btnChuyen;


    public Cau2Fragment() {

    }


    public static Cau2Fragment newInstance(String param1, String param2) {
        Cau2Fragment fragment = new Cau2Fragment();
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
        View  viewCau2 = inflater.inflate(R.layout.fragment_cau2, container, false);

        editText_MET = viewCau2.findViewById(R.id.editTextMet);
        editText_KM = viewCau2.findViewById(R.id.editTextKm);
        btnChuyen = viewCau2.findViewById(R.id.btndoi);
        btnChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String duLieuMet = editText_MET.getText().toString();
                String duLieuKm = editText_KM.getText().toString();
                if (!duLieuMet.isEmpty()) {
                    double met = Double.parseDouble(duLieuMet);
                    double km = met / 1000;
                    editText_KM.setText(String.valueOf(km));
                    Toast.makeText(viewCau2.getContext(),"m->km",Toast.LENGTH_SHORT).show();
                }
                else if (!duLieuKm.isEmpty()){
                    double km = Double.parseDouble(duLieuKm);
                    double met = km * 1000;
                    editText_MET.setText(String.valueOf(met));
                    Toast.makeText(viewCau2.getContext(),"km->m",Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(viewCau2.getContext(),"Hay nhap du lieu",Toast.LENGTH_SHORT).show();
                }
            }
        });
        return viewCau2;
    }
}