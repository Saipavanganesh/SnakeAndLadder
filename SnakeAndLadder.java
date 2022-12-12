package com.snakeandladder;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.lang.Math;
import java.util.ArrayList;
public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Game starts....Position:0");

        double playerOnePosition=0.0;
        int count=0;

        while(playerOnePosition<100.0){
            count++;
            double dice=(Math.floor(Math.random()*10)%6)+1.0;
            double option=(Math.floor(Math.random()*10)%3);

            switch(Double.toString(option)){
                case "0.0":
                    System.out.println("No Play. Current position is:"+playerOnePosition);
                    break;
                case "1.0":
                    System.out.println("Ladder. Curent position is:"+(playerOnePosition+dice));
                    if(playerOnePosition+dice<=100){
                        playerOnePosition=playerOnePosition+dice;
                    }
                    break;
                default:
                    System.out.println("Snake. Current position is:"+(playerOnePosition-dice));
                    if (playerOnePosition-dice<0.0) {
                        playerOnePosition=0.0;
                    }
                    else{
                        playerOnePosition=playerOnePosition-dice;
                    }
                    break;
            }
        }

        System.out.println("Dice was played "+count+" times");
        System.out.println("Player one position is "+playerOnePosition);
    }
}
