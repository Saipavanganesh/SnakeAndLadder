package com.snakeandladder;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.lang.Math;
public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Game starts....Position:0");

        double playerOnePosition=0.0;

        while(playerOnePosition<=100.0){
            double dice=(Math.floor(Math.random()*10)%6)+1.0;
            double option=(Math.floor(Math.random()*10)%3);

            switch(Double.toString(option)){
                case "0.0":
                    System.out.println("No Play");
                    break;
                case "1.0":
                    System.out.println("Ladder");
                    playerOnePosition=playerOnePosition+dice;
                    break;
                default:
                    System.out.println("Snake");
                    if (playerOnePosition-dice<0.0) {
                        playerOnePosition=0.0;
                    }
                    else{
                        playerOnePosition=playerOnePosition-dice;
                    }
                    break;
            }
        }

        System.out.println("Player one position is "+playerOnePosition);
    }
}
