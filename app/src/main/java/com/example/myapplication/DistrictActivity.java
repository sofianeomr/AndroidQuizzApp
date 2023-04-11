package com.example.myapplication;
        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.GridView;
        import android.widget.Toast;

        import com.google.android.material.button.MaterialButton;

        import java.util.ArrayList;
        import java.util.List;

public class DistrictActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_district);

        List<District> image_details = getListData();
        final GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new CustomGridAdapter(this, image_details));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                District district = image_details.get(position);

                Intent intent = new Intent (DistrictActivity.this, thirdActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("district", district);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

    private  List<District> getListData() {
        List<District> list = new ArrayList<District>();
        District d1 = new District("District 1", R.drawable.img_district1);
        District d2 = new District("District 2", R.drawable.img_district2);
        District d3 = new District("District 3", R.drawable.img_district3);
        District d4 = new District("District 4", R.drawable.img_district4);
        District d5 = new District("District 5", R.drawable.img_district5);
        District d6 = new District("District 6", R.drawable.img_district6);
        District d7 = new District("District 7", R.drawable.img_district7);
        District d8 = new District("District 8", R.drawable.img_district8);


        list.add(d1);
        list.add(d2);
        list.add(d3);
        list.add(d4);
        list.add(d5);
        list.add(d6);
        list.add(d7);
        list.add(d8);

        return list;
    }

}