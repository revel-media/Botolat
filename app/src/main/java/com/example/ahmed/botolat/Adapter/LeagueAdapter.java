package com.example.ahmed.botolat.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ahmed.botolat.R;
import com.example.ahmed.botolat.Team;

import java.util.ArrayList;
import java.util.List;

public class LeagueAdapter extends RecyclerView.Adapter<LeagueHolder> {
    List<Team> teams= new ArrayList<>();

    public LeagueAdapter(List <Team>teams){
        this.teams=teams;
    }

    @NonNull
    @Override
    public LeagueHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.teams_item_row,parent,false);

        return new LeagueHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LeagueHolder holder, int position) {
        Team team=new Team();
        team=teams.get(position);
        holder.txtPos.setText(team.getPosition());
        holder.txtName.setText(team.getTeamName());
        holder.txtWin.setText(team.getWins());
        holder.txtLost.setText(team.getLoses());
        holder.txtPoints.setText(team.getPts());
        holder.txtPlay.setText(team.getPlyNumber());
        holder.txtDeff.setText(String.valueOf(10));


    }

    @Override
    public int getItemCount() {
        return teams.size();
    }
}
