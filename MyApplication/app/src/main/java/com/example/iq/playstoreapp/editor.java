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

public class editor extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<CustomClass> blockArrayList4 = new ArrayList<CustomClass>();
        blockArrayList4.add(new CustomClass("Flight Pilot",4.6,R.drawable.flight_pilot));
        blockArrayList4.add(new CustomClass("Modern Strike",4.3,R.drawable.modern_strike));
        blockArrayList4.add(new CustomClass("Deer Hunter",4.4,R.drawable.deer_hunter));
        blockArrayList4.add(new CustomClass("Stairway",4.0,R.drawable.stait_way));
        blockArrayList4.add(new CustomClass("Dancing Line",4.7,R.drawable.dancing_line));
        blockArrayList4.add(new CustomClass("Tap Tap Builder",4.7,R.drawable.tap_tap_builder));
//

        WordAdapter adapter = new WordAdapter(getActivity(),blockArrayList4);

        ListView listView = (ListView)rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
