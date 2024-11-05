package com.example.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class HomeFragment extends Fragment implements View.OnClickListener {

    View view;
    Button btn_submit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);
        btn_submit = view.findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        if (v == btn_submit) {
            EditText ed_name = view.findViewById(R.id.ed_name);
            Bundle result = new Bundle();
            result.putString("name", ed_name.getText().toString());
            getParentFragmentManager().setFragmentResult("requestKey", result);
            ed_name.setText("");
        }
//
//        EditText ed_name = view.findViewById(R.id.ed_name);
//        Bundle result = new Bundle();
//        result.putString("name", ed_name.getText().toString());
//        getParentFragmentManager().setFragmentResult("requestKey", result);
//        ed_name.setText("");
    }
}