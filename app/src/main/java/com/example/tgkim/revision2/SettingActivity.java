package com.example.tgkim.revision2;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.ArrayRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.HashMap;

public class SettingActivity extends AppCompatActivity {

    private static final String TAG = "SettingActivity";
    public static SettingActivity settingActivity = null;
    private ViewPager viewpager;

    private Button step1_nextBtn = null;
    private Button step2_nextBtn = null;
    private Button step2_previousBtn = null;
    private Button step3_previousBtn = null;
    private Button step3_compbtnBtn = null;

    private ScrollView step1_layout = null;
    private ScrollView step2_layout = null;
    private ScrollView step3_layout = null;

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1); // 타이틀 없음
        setContentView(R.layout.stepview);

        this.step1_layout = (ScrollView)View.inflate(this,R.layout.step1view, null);
        this.step2_layout = (ScrollView)View.inflate(this,R.layout.step2view, null);
        this.step3_layout = (ScrollView)View.inflate(this,R.layout.step3view, null);


        viewpager = findViewById(R.id.steppager);
        viewpager.setAdapter(new MyPageAdapter(getSupportFragmentManager()));
        //step1Init();
        step2Init();
        step3Init();
//        this.step1_nextBtn = (Button)this.step1_layout.findViewById(R.id.step1_nextbtn);
//        this.step2_previousBtn = (Button)this.step2_layout.findViewById(R.id.step2_prvebtn);
//        this.step2_nextBtn = (Button)this.step2_layout.findViewById(R.id.step2_nextbtn);
//        this.step3_previousBtn = (Button)this.step2_layout.findViewById(R.id.step3_prvebtn);
//        this.step3_compbtnBtn = (Button)this.step3_layout.findViewById(R.id.step3_compbtn);

    }

    public class MyPageAdapter extends FragmentPagerAdapter {

        ArrayList<Fragment> fragments = new ArrayList<>();

        public MyPageAdapter(FragmentManager fm) {
            super(fm);
            fragments.add(Step1Fragment.newInstance());
            fragments.add(Step2Fragment.newInstance());
            fragments.add(Step3Fragment.newInstance());
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }
    }

    private void MoveNextView(){
        this.viewpager.setCurrentItem(viewpager.getCurrentItem() + 1);
    }

    private void MoverPreviousView(){
        this.viewpager.setCurrentItem(viewpager.getCurrentItem() - 1);
    }

//    private void step1Init(){
//        //int i = 0;
//        this.regionArray = new String[getResources().getStringArray(R.array.enterprise).length];
//        regionArray = getResources().getStringArray(R.array.enterprise);
//
//        this.step1ReginSpinner = this.step1_layout.findViewById(R.id.step1_regionspinner);
//        ArrayAdapter<String> adapter1 = new ArrayAdapter<String >(this, R.layout.customerspinner, this.regionArray);
//        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // 스피너 스타일
//        this.step1ReginSpinner.setPrompt(getResources().getString(R.string.text_region)); // 스피너 제목
//        this.step1ReginSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int idx = position;
//                SettingActivity.this.step1RegionId = SettingActivity.this.regionIndex[idx];
//                SettingActivity.this.step1RegionNm = SettingActivity.this.regionArray[idx];
//
//                if (SettingActivity.this.step1Map.containsKey(SettingActivity.this.regionIndex[idx])){
//
////                    String[] param = (String)
//                }
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
//    }

    private void step2Init(){

    }

    private void step3Init(){

    }


}
