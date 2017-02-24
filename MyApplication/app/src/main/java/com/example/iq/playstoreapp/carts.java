package com.example.iq.playstoreapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
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

public class carts extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<CustomClass> blockArrayList1 = new ArrayList<CustomClass>();
        blockArrayList1.add(new CustomClass("I Hack You",4.0,R.drawable.ihack));
        blockArrayList1.add(new CustomClass("SpyBoy",4.4,R.drawable.spyboy));
        blockArrayList1.add(new CustomClass("eBooks For Free",4.3,R.drawable.e_book));
        blockArrayList1.add(new CustomClass("NTS Sample",4.2,R.drawable.nts_sample));
        blockArrayList1.add(new CustomClass("Mental Math",4.6,R.drawable.mental_math));
        blockArrayList1.add(new CustomClass("Kali Linux",4.3,R.drawable.kali_linux));

        WordAdapter adapter = new WordAdapter(getActivity(),blockArrayList1);

        ListView listView = (ListView)rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(getContext(), ""+blockArrayList1.get(position).getApp_name().toString(), Toast.LENGTH_SHORT).show();
        }
    });
        return rootView;
    }

}

