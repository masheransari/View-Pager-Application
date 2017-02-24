package com.example.iq.playstoreapp.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.iq.playstoreapp.R;
import com.example.iq.playstoreapp.carts;
import com.example.iq.playstoreapp.category;
import com.example.iq.playstoreapp.early;
import com.example.iq.playstoreapp.editor;
import com.example.iq.playstoreapp.family;
import com.example.iq.playstoreapp.game;

/**
 * Created by iQ on 2/24/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new carts();
        } else if (position == 1) {
            return new game();
        } else if (position == 2) {
            return new category();
        } else if(position == 3){
            return new early();
        } else if(position == 4) {
            return new family();
        } else{
            return new editor();
        }
    }
    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.cart);
        } else if (position == 1) {
            return mContext.getString(R.string.game);
        } else if (position == 2) {
            return mContext.getString(R.string.category);
        } else if(position == 3){
            return mContext.getString(R.string.early);
        } else if(position == 4){
            return mContext.getString(R.string.family);
        } else{
            return mContext.getString(R.string.editor);
        }
    }
}

