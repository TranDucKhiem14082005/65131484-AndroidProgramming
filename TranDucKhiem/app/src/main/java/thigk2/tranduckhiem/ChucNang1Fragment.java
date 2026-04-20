package thigk2.tranduckhiem;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class ChucNang1Fragment extends Fragment {

    EditText editText_TienVIet;
    EditText editText_TienDola;
    Button btnChuyen;

    public ChucNang1Fragment() {
        // Required empty public constructor
    }


    public static ChucNang1Fragment newInstance(String param1, String param2) {
        ChucNang1Fragment fragment = new ChucNang1Fragment();
        Bundle args = new Bundle();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View  viewCN1 = inflater.inflate(R.layout.fragment_chuc_nang1, container, false);

        editText_TienVIet = viewCN1.findViewById(R.id.editTextTienViet);
        editText_TienDola = viewCN1.findViewById(R.id.editTextTienDola);
        btnChuyen = viewCN1.findViewById(R.id.btndoi);
        btnChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dlTienViet = editText_TienVIet.getText().toString();
                String dlTienDola = editText_TienDola.getText().toString();
                if (!dlTienViet.isEmpty()) {
                    double tienviet = Double.parseDouble(dlTienViet);
                    double tiendola = tienviet / 26000;
                    editText_TienDola.setText(String.valueOf(tiendola));
                    Toast.makeText(viewCN1.getContext(),"TienViet->Dola",Toast.LENGTH_SHORT).show();
                }
                else if (!dlTienDola.isEmpty()){
                    double tiendola = Double.parseDouble(dlTienDola);
                    double tienviet = tiendola * 1000;
                    editText_TienVIet.setText(String.valueOf(tienviet));
                    Toast.makeText(viewCN1.getContext(),"Dola->TienViet",Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(viewCN1.getContext(),"Hay nhap du lieu",Toast.LENGTH_SHORT).show();
                }
            }
        });
        return viewCN1;

    }
}