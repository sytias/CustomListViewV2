package com.chenyingchu.customlistviewv2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by chenyingchu on 15/8/27.
 */
public class CustomListViewAdapter extends BaseAdapter {

    private ArrayList<HashMap<String, String>> books;
    private LayoutInflater inflater = null;
    private Context mContext;

    public CustomListViewAdapter(Context context, ArrayList<HashMap<String, String>> data) {
        books = data;
        mContext = context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return books.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return (long)position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (convertView == null) {
            view = inflater.inflate(R.layout.list_row, null);

            TextView title = (TextView) view.findViewById(R.id.title);
            TextView author = (TextView) view.findViewById(R.id.author);
            TextView pages = (TextView) view.findViewById(R.id.pages);
            ImageView image = (ImageView) view.findViewById(R.id.list_image);

            HashMap<String, String> mbook = new HashMap<>();

            mbook = books.get(position);

            title.setText(mbook.get("title"));
            author.setText(mbook.get("author"));
            pages.setText(mbook.get("pages"));
            image.setImageDrawable(mContext.getResources().getDrawable(R.drawable.blue_swirl));


        }
        return view;
    }
}
