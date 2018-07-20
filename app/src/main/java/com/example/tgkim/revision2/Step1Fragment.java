package com.example.tgkim.revision2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Step1Fragment extends Fragment {

    Button next;

    public static Step1Fragment newInstance() {

        Bundle args = new Bundle();

        Step1Fragment fragment = new Step1Fragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        next = getActivity().findViewById(R.id.step1_nextbtn);
//        next.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
        return inflater.inflate(R.layout.step1view, container, false);
    }


}
