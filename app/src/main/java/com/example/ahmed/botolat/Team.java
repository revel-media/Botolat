package com.example.ahmed.botolat;

public class Team {
    private String teamName;
    private int position;
    private int plyNumber;
    private int wins;
    private int loses;
    private int pts;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPlyNumber() {
        return plyNumber;
    }

    public void setPlyNumber(int plyNumber) {
        this.plyNumber = plyNumber;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public int getPts() {
        return pts;
    }

    public void setPts(int pts) {
        this.pts = pts;
    }
}
