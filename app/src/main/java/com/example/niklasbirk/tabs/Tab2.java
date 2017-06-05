package com.example.niklasbirk.tabs;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by niklasbirk on 04.06.17.
 */

public class Tab2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab2, container, false);
        String[] alletricks = {"3 Ball Cascade", "3 Ball Mills Mess","3 Ball Ping Pong",
                "3 Ball Behind the Back", "3 Ball Fountain", "4 Ball Fountain",
                "4 Ball Mills Mess", "4 Ball Behind the Back", "4 Ball in One Hand",
                "4 Ball Shower", "5 Ball Cascade", "5 Ball Shower", "5 Ball Behind the Back",
                "26 Ball Mills Mess", "Crazy!"};

        ListView listView = (ListView) view.findViewById(R.id.tricklist);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                alletricks
        );
        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position ==0){
                    Intent intent = new Intent(getActivity(), Trickvorschau.class);
                    startActivity(intent);

                } else Toast.makeText(getActivity(), "Hier gibts nichts!", Toast.LENGTH_SHORT).show();


            }
        });

        return view;
    }
}
