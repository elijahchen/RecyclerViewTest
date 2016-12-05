package com.elijahdesign.myrecyclerview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycleThisView;
    ArrayList<Square> theseSquares = new ArrayList<>();
    RecycleViewManger adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycleThisView = (RecyclerView) findViewById(R.id.thisRecyclerView);

        shapeMaker();

        adapter = new RecycleViewManger(theseSquares);

        recycleThisView.setAdapter(adapter);

        recycleThisView.setLayoutManager(new GridLayoutManager(this,3, GridLayoutManager.VERTICAL, false));
    }

    public void shapeMaker (){

        for(int i = 0; i < 10; i++){
            theseSquares.add(new Square(getResources().getDrawable(R.drawable.red_square), "Red"));
            theseSquares.add(new Square(getResources().getDrawable(R.drawable.blue_square), "Blue"));
            theseSquares.add(new Square(getResources().getDrawable(R.drawable.yellow_square), "Yellow"));
        }
    }



}
