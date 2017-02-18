package com.example.student.db021801;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.Volley;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by student on 2017/2/18.
 */

public class MyAdapter extends BaseAdapter {

    ArrayList<Zoo> data;
    Context context;
    public MyAdapter(Context c, ArrayList<Zoo> d)
    {
        this.data = d;
        this.context = c;
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        final ViewHolder holder;
        if (convertView == null)
        {
            convertView = inflater.inflate(R.layout.myitem, null);
            holder = new ViewHolder();
            holder.tv = (TextView) convertView.findViewById(R.id.textView2);
            holder.img = (ImageView) convertView.findViewById(R.id.imageView);
            convertView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.img.setImageResource(R.mipmap.ic_launcher);
        Picasso.with(context).load(data.get(position).img_url).into(holder.img);
        holder.tv.setText(data.get(position).E_Name);
        return convertView;
    }
    static class ViewHolder
    {
        TextView tv;
        ImageView img;
    }
}
