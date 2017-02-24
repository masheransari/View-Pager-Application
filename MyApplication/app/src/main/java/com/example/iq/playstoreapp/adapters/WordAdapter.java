package com.example.iq.playstoreapp.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.iq.playstoreapp.variables.CustomClass;
import com.example.iq.playstoreapp.R;

import java.util.ArrayList;

/**
 * Created by iQ on 2/24/2017.
 */

public class WordAdapter extends ArrayAdapter<CustomClass>{
    TextView name, starts;
    ImageView imageView;

    public WordAdapter(Activity activity, ArrayList<CustomClass> arrayList)
    {
        super(activity,0,arrayList);
    }
    @Override
    public View getView(int position, View convertView,ViewGroup container)
    {
        View rootView = convertView;

        if(rootView == null){
            rootView =LayoutInflater.from(getContext()).inflate(R.layout.list_item,container,false);
        }
        CustomClass customClass = getItem(position);
        name = (TextView)rootView.findViewById(R.id.lbl_app_name);
        name.setText(customClass.getApp_name());
//        ((TextView)rootView.findViewById(R.id.lbl_app_name)).setText(customClass.getApp_name());
        starts = (TextView)rootView.findViewById(R.id.lbl_rating);
        starts.setText(String.valueOf(customClass.getRating()));

        imageView =(ImageView)rootView.findViewById(R.id.image_app);
        imageView.setImageResource(customClass.getApp_image_id());

//        ((TextView)rootView.findViewById(R.id.lbl_rating)).setText(String.valueOf(customClass.getRating()));
//        ((ImageView)rootView.findViewById(R.id.image_app)).setImageResource(customClass.getApp_image_id());

        return rootView;
    }
}
