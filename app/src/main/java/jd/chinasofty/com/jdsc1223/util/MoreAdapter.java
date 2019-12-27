package jd.chinasofty.com.jdsc1223.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;

import jd.chinasofty.com.jdsc1223.R;
import jd.chinasofty.com.jdsc1223.vo.ImageDes;

public class MoreAdapter extends BaseAdapter {

    private LinkedList<ImageDes> mList;
    private Context mContext;

    public MoreAdapter(LinkedList<ImageDes> mList, Context mContext) {
        this.mList = mList;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //加载一个适配器界面
        convertView = LayoutInflater.from(mContext).inflate(R.layout.morelist,parent,false);
        ImageView img = convertView.findViewById(R.id.more_list_iv);
        TextView titles = convertView.findViewById(R.id.tv_1);
        TextView names = convertView.findViewById(R.id.tv_2);
        img.setImageResource(mList.get(position).getImageId());
        titles.setText(mList.get(position).getTitle());
        names.setText(mList.get(position).getName());
        return convertView;
    }
}
