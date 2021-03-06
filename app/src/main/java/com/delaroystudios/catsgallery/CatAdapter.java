package com.delaroystudios.catsgallery;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by delaroy on 5/3/17.
 */
public class CatAdapter extends RecyclerView.Adapter<CatViewHolder> {

    private static final int[]CAT_IMAGE_IDS = new int[]{
            R.drawable.cat_1,
            R.drawable.cat_2,
            R.drawable.cat_3,
            R.drawable.cat_4,
            R.drawable.cat_5,
            R.drawable.cat_6,
            R.drawable.cat_7,
            R.drawable.cat_8,
            R.drawable.cat_9,
            R.drawable.cat_10,
            R.drawable.cat_11,
            R.drawable.cat_12,
            R.drawable.cat_13,
            R.drawable.cat_14,
            R.drawable.cat_15,
            R.drawable.cat_16,
            R.drawable.cat_17,
            R.drawable.cat_18,
            R.drawable.cat_19
    };

    private Context mContext;

    CatAdapter(Context context){
        mContext = context;
    }

    @Override
    public CatViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.viewholder_cat, parent, false);
        return  new CatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CatViewHolder holder, int position){
        int pos = position % CAT_IMAGE_IDS.length;
        Drawable drawable = ResourcesCompat.getDrawable(mContext.getResources(),
                CAT_IMAGE_IDS[pos], null);
        holder.bindTo(drawable);
    }

    @Override
    public int getItemCount(){
        return CAT_IMAGE_IDS.length * 4;
    }
}
