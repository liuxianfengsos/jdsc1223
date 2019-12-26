package jd.chinasofty.com.jdsc1223.util;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.youth.banner.loader.ImageLoader;
//图片加载器
public class MyImageLoader extends ImageLoader{
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        Glide.with(context.getApplicationContext()).load(path).into(imageView);
    }
}
