package com.example.iq.playstoreapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.iq.playstoreapp.adapters.WordAdapter;
import com.example.iq.playstoreapp.variables.CustomClass;

import java.util.ArrayList;

/**
 * Created by iQ on 2/24/2017.
 */

public class game extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<CustomClass> blockArrayList6 = new ArrayList<CustomClass>();
        blockArrayList6.add(new CustomClass("Shake Me",4.6,R.drawable.shake_me));
        blockArrayList6.add(new CustomClass("Just Facts",4.3,R.drawable.just_fact));
        blockArrayList6.add(new CustomClass("Life Hacks",4.3,R.drawable.life_hack));
        blockArrayList6.add(new CustomClass("VeeR VR",4.3,R.drawable.veer_vr));
        blockArrayList6.add(new CustomClass("Fake GPS",3.9,R.drawable.fake_gps));
        blockArrayList6.add(new CustomClass("Cool Black",4.5,R.drawable.cool_black));

        WordAdapter adapter = new WordAdapter(getActivity(),blockArrayList6);

        ListView listView = (ListView)rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
