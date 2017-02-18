package com.example.student.db021801;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

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
        return 0;
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
        return null;
    }
}
