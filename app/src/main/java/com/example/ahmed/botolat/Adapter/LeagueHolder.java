package com.example.ahmed.botolat.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.ahmed.botolat.R;

public class LeagueHolder extends RecyclerView.ViewHolder {
    TextView txtPos,txtName,txtWin,txtLost,txtPoints,txtDeff,txtPlay;
    public LeagueHolder(View v) {
        super(v);
        txtDeff=v.findViewById(R.id.txt_deff);
        txtPoints=v.findViewById(R.id.txt_points);
        txtPos=v.findViewById(R.id.txt_pos);
        txtName=v.findViewById(R.id.txt_teamname);
        txtWin=v.findViewById(R.id.txt_win);
        txtLost=v.findViewById(R.id.txt_los);
        txtPlay=v.findViewById(R.id.txt_Play);
    }
}

