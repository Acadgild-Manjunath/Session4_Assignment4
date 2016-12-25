package com.acadgild.com.session4_assignment4;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Valyoo on 12/24/2016.
 */
public  class CustomAdapter extends BaseAdapter {

    MainActivity act = new MainActivity();
    Context context;
    ArrayList<CustomHandler> arrayList;
    LayoutInflater layoutInflater;
    public CustomAdapter(Context context1, ArrayList<CustomHandler> arrayList1){
        this.context = context1;
        this.arrayList = arrayList1;
        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int pos) {
        return arrayList.get(pos);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int pos, View view, ViewGroup viewGroup) {
        final ViewHolder holder;
      //  ImageView img2 = (ImageView)view.findViewById(R.id.imgView1);
        if (view == null)
        {
            view = layoutInflater.inflate(R.layout.custom_row, viewGroup, false);
            holder = new ViewHolder();
            holder.imgView = (ImageView) view.findViewById(R.id.imgView1);
            holder.txtTitle1 = (TextView) view.findViewById(R.id.txtTitle);
            holder.txtTitle1.setTextColor(Color.WHITE);

          //  img2.setLayoutParams(new GridView.LayoutParams(300, 300));
          //  img2.setScaleType(ImageView.ScaleType.CENTER);
          //  img2.setPadding(10,10,10,10);

            view.setTag(holder);

        }
        else
        {
            holder = (ViewHolder)view.getTag();
        }
        holder.txtTitle1.setText(arrayList.get(pos).getTitle());
        holder.imgView.setImageResource(arrayList.get(pos).getImageId());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"You clicked "+holder.txtTitle1.getText(),Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }



    public class ViewHolder{
        ImageView imgView;
        TextView txtTitle1;
    }
}
