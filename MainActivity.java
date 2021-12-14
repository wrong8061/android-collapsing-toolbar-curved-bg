package com.example.mvogue;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvProgrammingList;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        rvProgrammingList=findViewById(R.id.rvProgrammingList);
        rvProgrammingList.setLayoutManager(new LinearLayoutManager(this));
        ProgrammingAdapter myAdapter=new ProgrammingAdapter(new String[]{"Java","Python","Html","Ruby","Bootsrap",
                "Scala","Jquery","Css","Javascript","Java","Python","Html","Ruby","Bootsrap","Scala","Jquery","Css","Javascript"});
        rvProgrammingList.setAdapter(myAdapter);



    }
}