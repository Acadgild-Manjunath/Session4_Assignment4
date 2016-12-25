package com.acadgild.com.session4_assignment4;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Integer[] images = new Integer[]{R.drawable.cupcake, R.drawable.donut, R.drawable.eclair, R.drawable.froyo,
            R.drawable.gingerbread, R.drawable.honeycomb, R.drawable.icecream_sandwich, R.drawable.jellybean,
            R.drawable.kitkat, R.drawable.lollipop, R.drawable.marshmallow, R.drawable.nougat};

    String[] titles = new String[]{"Cupcake v(1.5)", "Donut v(1.6)", "Eclair v(2.0)", "Froyo v(2.2)" , "Gingerbread v(2.3)",
                                   "Honeycomb v(3.0)", "Icecream-sandwich v(4.0)", "Jellybean v(4.1)", "Kitkat v(4.4)",
                                   "Lollipop v(5.0)", "Marshmallow v(6.0)", "Nougat v(7.0)"};
    ArrayList<CustomHandler> arrList = new ArrayList<>();
    GridView grid1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // ImageView img2 = (ImageView)findViewById(R.id.imgView1);
       // img2.setLayoutParams(new GridView.LayoutParams(300, 300));
       // img2.setScaleType(ImageView.ScaleType.CENTER);
       // img2.setPadding(10,10,10,10);


        grid1 = (GridView)findViewById(R.id.gridView1);

        for(int i=0;i<images.length;i++)
        {
            CustomHandler handler = new CustomHandler();
            handler.setImageId(images[i]);
            handler.setTitle(titles[i]);
            arrList.add(handler);
        }

        CustomAdapter custAdp = new CustomAdapter(this, arrList);
        grid1.setAdapter(custAdp);
       // grid1.setOnItemClickListener(this);
    }
}
