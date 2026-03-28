package khiem.it.appmenu;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MonAnAdapter extends BaseAdapter {

    //
    private ArrayList<MonAn> DSMonAn;
    private LayoutInflater layoutInflater;
    private  Context context; // Con text nay la con text cua lop

    // Xây dựng hàm tạo wor đây.


    public MonAnAdapter( Context _context,ArrayList<MonAn> DSMonAn) {
        this.DSMonAn = DSMonAn;
        this.context = _context; //Context này là context đầu vào
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return DSMonAn.size();
    }

    @Override
    public Object getItem(int position) {
        return DSMonAn.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // View cuả item hiêjn hành
        View viewHienHanh = convertView;
        if(viewHienHanh == null){
         viewHienHanh =   layoutInflater.inflate(R.layout.item_monan,null);
        }// Laays duwx lieeuj

            MonAn monAnHienTai = DSMonAn.get(position);
            // gan len cai dieu khien
        /// tim dieu khien
        TextView textView_TenMon = (TextView) viewHienHanh.findViewById(R.id.tenMonAn);
        TextView textView_DonGia = (TextView) viewHienHanh.findViewById(R.id.giaMonAn);
        TextView textView_NoiDung = (TextView) viewHienHanh.findViewById(R.id.noiDungMonAn);
        ImageView imageView_Anh = (ImageView) viewHienHanh.findViewById(R.id.imgAnhDaiDien);

        // set len
        textView_TenMon.setText(monAnHienTai.getMoTaMonAn());
        textView_DonGia.setText(String.valueOf(monAnHienTai.getDonGia()));
        textView_NoiDung.setText(monAnHienTai.getMoTaMonAn());
        imageView_Anh.setImageResource(monAnHienTai.getIdAnhMinhHoa());

        return viewHienHanh;




    }
}