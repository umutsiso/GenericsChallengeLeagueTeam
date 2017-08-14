package com.Siso;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    private String leagueName;
    private ArrayList<T> teamList = new ArrayList<>();

    public String getLeagueName() {
        return leagueName;
    }

    public boolean addTeam(T team){
        if (teamList.contains(team)){
            System.out.println("Team " + team.getName() + " already exists !");
            return false;
        } else {
            System.out.println(team.getName() + " hsa been added to " + this.getLeagueName());
            teamList.add(team);
            return true;
        }
    }


    public void sortLeague(){
        for (int x = 0; x< teamList.size(); x++){
            for (int i = 0; i < teamList.size() - 1; i++){
                if (teamList.get(i+1).ranking > teamList.get(i).ranking){
                    T temp = teamList.get(i);
                    teamList.set(i, teamList.get(i+1));
                    teamList.set(i+1, temp);
                }

            }
        }

    }

    public void showTable(){
        Collections.sort(teamList);
        for (T t : teamList){
            System.out.println(t.getName() + ": " + t.ranking);
        }
    }


    public void printTeams(){
        for (int i = 0; i<teamList.size(); i++){
            System.out.println(teamList.get(i).getName() + "= " + teamList.get(i).ranking);
        }

    }

    public void match(T ourTeam, T opponentTeam, int ourScore, int theirScore){
        if (ourScore > theirScore){
            ourTeam.won ++;
            opponentTeam.lost ++;
            ourTeam.ranking += 2;
        } else if (ourScore < theirScore) {
            ourTeam.lost ++;
            opponentTeam.won ++;
            opponentTeam.ranking =+ 2;
        } else {
            ourTeam.tied ++;
            opponentTeam.tied ++;
            ourTeam.ranking ++;
            opponentTeam.ranking ++;
        }
        sortLeague();
    }


    

}
