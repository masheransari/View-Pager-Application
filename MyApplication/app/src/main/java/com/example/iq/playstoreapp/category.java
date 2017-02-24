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

public class category extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<CustomClass> blockArrayList2 = new ArrayList<CustomClass>();
        blockArrayList2.add(new CustomClass("Kali Linux",4.3,R.drawable.kali_linux));
        blockArrayList2.add(new CustomClass("Java Programming",4.4,R.drawable.java_program));
        blockArrayList2.add(new CustomClass("Web Design",4.2,R.drawable.web_design));
        blockArrayList2.add(new CustomClass("Aptitude Test",4.4,R.drawable.appditude_test));
        blockArrayList2.add(new CustomClass("W3Schools",3.8,R.drawable.w3school));

        WordAdapter adapter = new WordAdapter(getActivity(),blockArrayList2);

        ListView listView = (ListView)rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), ""+blockArrayList2.get(position).getApp_name().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }


}
