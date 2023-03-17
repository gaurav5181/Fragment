package com.example.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.List;

public class Frgtwo extends Fragment {

    ListView listView;
    String[] ar={"A","B","C","D","E","F","G","H","I","J","K","L"};
    ArrayAdapter arrayAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view=inflater.inflate(R.layout.frgtwo,container,false);
        listView=view.findViewById(R.id.list2);
        arrayAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1,ar);
        listView.setAdapter(arrayAdapter);

        return view;
    }
}
