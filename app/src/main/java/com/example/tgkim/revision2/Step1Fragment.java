package com.example.tgkim.revision2;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.Spinner;

import java.util.HashMap;

public class Step1Fragment extends Fragment implements View.OnClickListener{

    private String[] regionArray = null;
    private String[] regionIndex = null;

    private CheckBox step1AllChk = null;
    private ImageButton step1CloseBtn = null;
    private Dialog step1Dialog = null;
    private String step1EnterpriseId = "EA0001";
    private String step1EnterpriseNm = "조이앤드라이브";
    private String step1EnterpriseTel = "1600-4321";
    private Button step1InfoBtn = null;
    private CheckBox step1InfoChk = null;
    private ScrollView step1Layout = null;
    private Button step1LocationBtn = null;
    private CheckBox step1LocationChk = null;
    private HashMap<String, String> step1Map = new HashMap();
    private Button step1NextBtn = null;
    private Spinner step1ReginSpinner = null;
    private String step1RegionId = null;
    private String step1RegionNm = null;
    private CheckBox step1ServiceChk = null;
    private Button step1SeviceBtn = null;
    private String step1Tel = "";
    private EditText step1TelEdit = null;
    private Button step1TrialogueBtn = null;
    private CheckBox step1TrialogueChk = null;
    private View view = null;

    public static Step1Fragment newInstance() {

        Bundle args = new Bundle();

        Step1Fragment fragment = new Step1Fragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.step1view, container, false);
        step1Init();
        return view;
    }

    private void step1Init(){
        //int i = 0;

        regionArray = new String[getResources().getStringArray(R.array.enterprise).length];
        regionArray = getResources().getStringArray(R.array.enterprise);

        this.step1ReginSpinner = view.findViewById(R.id.step1_regionspinner);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String >(getContext(), R.layout.customerspinner, this.regionArray);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // 스피너 스타일
        this.step1ReginSpinner.setPrompt(getResources().getString(R.string.text_region)); // 스피너 제목
        this.step1ReginSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int idx = position;
//                SettingActivity.this.step1RegionId = SettingActivity.this.regionIndex[idx];
//                SettingActivity.this.step1RegionNm = SettingActivity.this.regionArray[idx];
//
//                if (SettingActivity.this.step1Map.containsKey(SettingActivity.this.regionIndex[idx])){
//
////                    String[] param = (String)
//                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        this.step1ReginSpinner.setAdapter(adapter1);

    }

    @Override
    public void onClick(View v) {
        
    }
}
