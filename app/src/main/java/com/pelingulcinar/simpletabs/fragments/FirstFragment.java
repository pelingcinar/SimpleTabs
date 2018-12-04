package com.pelingulcinar.simpletabs.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.pelingulcinar.simpletabs.R;

import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {

    private static final String[] COUNTRIES = new String[] {
            "Türkiye", "Almanya", "Fransa", "Ukrayna", "İtalya"
    };

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_first, container, false);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_dropdown_item, COUNTRIES);
        AutoCompleteTextView textView = (AutoCompleteTextView)
                view.findViewById(R.id.txt);
        textView.setAdapter(adapter);

        return view;


    }
}