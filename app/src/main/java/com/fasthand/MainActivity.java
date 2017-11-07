package com.fasthand;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv_main;
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_main = (RecyclerView) findViewById(R.id.rv_main);
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 30 ; i++) {
            User user = new User();
            user.setHead(R.drawable.timg);
            user.setPhoto(R.drawable.timg);
            list.add(user);
        }
        adapter = new MyAdapter(list);
        rv_main.setLayoutManager(new StaggeredGridLayoutManager(2,  StaggeredGridLayoutManager.VERTICAL));
        rv_main.setItemAnimator(new DefaultItemAnimator());
        rv_main.setAdapter(adapter);
    }
}
