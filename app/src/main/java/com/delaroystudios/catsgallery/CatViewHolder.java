package com.delaroystudios.catsgallery;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.flexbox.FlexboxLayoutManager;

/**
 * Created by delaroy on 5/3/17.
 */
public class CatViewHolder extends RecyclerView.ViewHolder {

    private ImageView mImageView;

    CatViewHolder(View itemView){
        super(itemView);
        mImageView = (ImageView) itemView.findViewById(R.id.imageview);
    }

    void bindTo(Drawable drawable){
        mImageView.setImageDrawable(drawable);
        ViewGroup.LayoutParams lp = mImageView.getLayoutParams();
        if (lp instanceof FlexboxLayoutManager.LayoutParams){
            FlexboxLayoutManager.LayoutParams flexboxLp = (FlexboxLayoutManager.LayoutParams) lp;
            flexboxLp.setFlexGrow(1.0f);
        }
    }
}
