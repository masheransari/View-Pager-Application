package com.example.iq.playstoreapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.iq.playstoreapp.adapters.WordAdapter;
import com.example.iq.playstoreapp.variables.CustomClass;

import java.util.ArrayList;

/**
 * Created by iQ on 2/24/2017.
 */

public class family extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<CustomClass> blockArrayList5 = new ArrayList<CustomClass>();
        blockArrayList5.add(new CustomClass("Contacts", 4.6, R.drawable.contacts));
        blockArrayList5.add(new CustomClass("Piano Keybords", 4.4, R.drawable.piano));
        blockArrayList5.add(new CustomClass("7 Minutes", 4.5, R.drawable.seven_minure));
        blockArrayList5.add(new CustomClass("Fotor Photo", 4.5, R.drawable.fotor_photo));
        blockArrayList5.add(new CustomClass("OneNote", 4.1, R.drawable.one_note));
        blockArrayList5.add(new CustomClass("Go Arts", 4.5, R.drawable.go_art));

        WordAdapter adapter = new WordAdapter(getActivity(), blockArrayList5);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), ""+blockArrayList5.get(position).getApp_name().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }
}

