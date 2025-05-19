package com.xworkz.ipl.runner ;

import com.xworkz.ipl.things.IplDetails;

import java.util.Scanner;

public class IplDetailsRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the details");
        System.out.println("enter the team name");
         String teamName = scanner.next();
        System.out.println("enter the captain name");
        String captainName = scanner.next();
        System.out.println(" enter the number of players");
        int numberOfPlayers = scanner.nextInt();
        System.out.println("enter the number of matches");
        int numberOfMatches = scanner.nextInt();
        IplDetails iplDetails = new IplDetails();
        iplDetails.captainName = captainName;
        iplDetails.numberOfPlayer = numberOfPlayers;
        iplDetails.numberOfMatches = numberOfMatches;
        System.out.println("Team details are!!!");
        System.out.println("team name is:"+iplDetails.teamName);
    }
}
