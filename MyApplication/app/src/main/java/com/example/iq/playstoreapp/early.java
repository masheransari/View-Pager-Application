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

public class early extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<CustomClass> blockArrayList3 = new ArrayList<CustomClass>();
        blockArrayList3.add(new CustomClass("Oxford English", 4.3, R.drawable.oxford_english));
        blockArrayList3.add(new CustomClass("Hacking", 4.3, R.drawable.hacking));
        blockArrayList3.add(new CustomClass("Pro Hacking", 4.3, R.drawable.pro_hacking));
        blockArrayList3.add(new CustomClass("Geek App", 4.7, R.drawable.greek_app));
        blockArrayList3.add(new CustomClass("eBook For Free", 4.3, R.drawable.e_book));
        blockArrayList3.add(new CustomClass("NTS Sample", 4.2, R.drawable.nts_sample));
        WordAdapter adapter = new WordAdapter(getActivity(), blockArrayList3);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
