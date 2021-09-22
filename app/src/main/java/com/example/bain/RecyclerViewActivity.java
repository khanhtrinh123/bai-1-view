package com.example.bain;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView rvList;
    private List<Game> gameList;
    private RecycleView recycleView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        rvList = findViewById(R.id.rvList);
        gameList = new ArrayList<Game>();
        gameList.add(new Game("FiFA","Thể thao"));
        gameList.add(new Game("Liên Minh Huyền Thoại","Chiến thuật"));
        gameList.add(new Game("Bắn Cá","giải trí"));
        gameList.add(new Game("Liên Quân mobile","Chiến thuật"));
        gameList.add(new Game("DOTA2","Chiến thuật"));
        gameList.add(new Game("Pubg mobile","Hành động"));
        gameList.add(new Game("Play Together","Không biết"));
        gameList.add(new Game("Star CraftII","Chiến Thuật"));
        gameList.add(new Game("Free Fire","Hành động"));
        gameList.add(new Game("Tốc Chiến","Chiến Thuật"));
        gameList.add(new Game("Tốc Chiến","Chiến Thuật"));
        gameList.add(new Game("Tốc Chiến","Chiến Thuật"));
        gameList.add(new Game("Tốc Chiến","Chiến Thuật"));
        gameList.add(new Game("Tốc Chiến","Chiến Thuật"));
        gameList.add(new Game("Tốc Chiến","Chiến Thuật"));
        rvList.setHasFixedSize(true);
        recycleView = new RecycleView(gameList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(RecyclerViewActivity.this);
        rvList.setLayoutManager(linearLayoutManager);
        rvList.setAdapter(recycleView);
    }
}
