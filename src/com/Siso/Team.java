package com.Siso;



public abstract class Team implements Comparable<Team> {

    private String teamName;
    protected int won = 0;
    protected int lost = 0;
    protected int tied = 0;
    protected int ranking = 0;

    @Override
    public int compareTo(Team team) {
        if (this.ranking > team.ranking){
            return 1;
        } else if (this.ranking < team.ranking){
            return -1;
        } else {
            return 0;
        }
    }



    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getName(){
        return this.teamName;
    }




}



