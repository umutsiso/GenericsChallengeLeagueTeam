// @author Jake Umut Siso

package com.Siso;

public class Main {

    public static void main(String[] args) {

        FootballTeam footballTeam1 = new FootballTeam("footballTeam 1");
        FootballTeam footballTeam2 = new FootballTeam("footballTeam 2");
        FootballTeam footballTeam3 = new FootballTeam("footballTeam 3");
        FootballTeam footballTeam4 = new FootballTeam("footballTeam 4");
        FootballTeam footballTeam5 = new FootballTeam("footballTeam 5");
        FootballTeam footballTeam6 = new FootballTeam("footballTeam 6");

        BasketballTeam basketballTeam1 = new BasketballTeam("basketballTeam");

        League<FootballTeam> myLeague = new League<>();


        myLeague.addTeam(footballTeam2);
        myLeague.addTeam(footballTeam4);
        myLeague.addTeam(footballTeam3);
        myLeague.addTeam(footballTeam5);
        myLeague.addTeam(footballTeam1);

        myLeague.match(footballTeam1, footballTeam2, 3, 2);
        myLeague.match(footballTeam1, footballTeam2, 2, 2);
        myLeague.match(footballTeam3, footballTeam4, 3, 2);
        myLeague.printTeams();

        System.out.println(" ============================");

        myLeague.addTeam(footballTeam6);
        myLeague.printTeams();

        System.out.println(" ============================");

        myLeague.showTable();

        System.out.println(" ============================");

        myLeague.printTeams();

    }
}
