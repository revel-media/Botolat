package com.example.ahmed.botolat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AndroidException;

import com.example.ahmed.botolat.Adapter.LeagueAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LeagueAdapter leagueAdapter;
    List<Team> teamList= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        leagueAdapter=new LeagueAdapter(teamList);
        intializeData();
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(leagueAdapter);

    }

    private void intializeData() {
        Team team=new Team();
        team.setLoses(5);
        team.setPlyNumber(10);
        team.setPts(15);
        team.setWins(5);
        team.setPosition(4);
        teamList.add(team);
        }
}
