package jd.chinasofty.com.jdsc1223;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import jd.chinasofty.com.jdsc1223.util.MoreAdapter;
import jd.chinasofty.com.jdsc1223.vo.ImageDes;

public class MoreFragment extends Fragment {

    private LinkedList<ImageDes> mList = new LinkedList<>();
    private ListView listView;
    private Context mContext;
    private MoreAdapter adapter = null;

    public static MoreFragment newInstance(){
        MoreFragment fragment = new MoreFragment();
        return fragment;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //FOR fragment
        View rootView = inflater.inflate(R.layout.fragment_more,container,false);

        mContext = rootView.getContext();
        listView = rootView.findViewById(R.id.more_list);

        ImageDes image1 = new ImageDes(R.drawable.catergory_appliance,"家电","家电/生活电器");
        ImageDes image2 = new ImageDes(R.drawable.catergory_book,"图书","图书/电子书");
        ImageDes image3 = new ImageDes(R.drawable.catergory_cloth,"衣服","上衣/裤子");
        ImageDes image4 = new ImageDes(R.drawable.catergory_deskbook,"笔记本","hp/thinkpad/lenovo");
        ImageDes image5 = new ImageDes(R.drawable.catergory_digtcamer,"数码","sony/相机");
        ImageDes image6 = new ImageDes(R.drawable.catergory_furnitrue,"家具","桌子/椅子");
        ImageDes image7 = new ImageDes(R.drawable.catergory_mobile,"手机","小米/华为");
        ImageDes image8 = new ImageDes(R.drawable.catergory_skincare,"护肤","大宝/迪奥");
       // "家电","图书","衣服","笔记本","数码","家具","手机","护肤"};
      // "家电/生活电器","图书/电子书","上衣/裤子","hp/thinkpad/lenovo","sony/相机","桌子/椅子","小米/华为","大宝/迪奥"};

        //Log.v("1111111111111111111",image1.toString());
        mList.add(image1);
        mList.add(image2);
        mList.add(image3);
        mList.add(image4);
        mList.add(image5);
        mList.add(image6);
        mList.add(image7);
        mList.add(image8);

        adapter = new MoreAdapter((LinkedList<ImageDes>)mList,mContext);
        listView.setAdapter(adapter);
        return rootView;
    }
}
