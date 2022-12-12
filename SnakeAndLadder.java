package com.snakeandladder;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.lang.Math;
import java.util.ArrayList;
public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Game starts....");
        System.out.println("*************************");
        System.out.println("");
        double playerOnePosition=0.0;
        double playerTwoPosition=0.0;
        int diceTurn=1;
        int countOfPlayerOne=0,countOfPlayerTwo=0;

        while(playerOnePosition<100.0 && playerTwoPosition<100.0){

            if(diceTurn==1){
                countOfPlayerOne++;
                double dice=(Math.floor(Math.random()*10)%6)+1.0;
                double option=(Math.floor(Math.random()*10)%3);

                switch(Double.toString(option)){
                    case "0.0":
                        System.out.print(diceTurn);
                        diceTurn=2;
                        System.out.println("   No Play. Player1:"+playerOnePosition+" and Player2:"+playerTwoPosition);
                        break;
                    case "1.0":
                        System.out.print(diceTurn);
                        diceTurn=1;
                        if(playerOnePosition+dice<=100){
                            playerOnePosition=playerOnePosition+dice;
                            System.out.println("   Ladder. Player1:"+(playerOnePosition)+" and Player2:"+playerTwoPosition);
                        }
                        break;
                    default:
                        System.out.print(diceTurn);
                        diceTurn=2;
                        if (playerOnePosition-dice<0.0) {
                            playerOnePosition=0.0;
                        }
                        else{
                            playerOnePosition=playerOnePosition-dice;
                        }
                        System.out.println("   Snake. Player1:"+(playerOnePosition)+" and Player2:"+playerTwoPosition);
                        break;
                }
            }
            else{
                countOfPlayerTwo++;
                double dice=(Math.floor(Math.random()*10)%6)+1.0;
                double option=(Math.floor(Math.random()*10)%3);

                switch(Double.toString(option)){
                    case "0.0":
                        System.out.print(diceTurn);
                        diceTurn=1;
                        System.out.println("   No Play. Player1:"+playerOnePosition+" and Player2:"+playerTwoPosition);
                        break;
                    case "1.0":
                        System.out.print(diceTurn);
                        diceTurn=2;
                        if(playerTwoPosition+dice<=100){
                            playerTwoPosition=playerTwoPosition+dice;
                            System.out.println("   Ladder. Player1:"+playerOnePosition+" and Player2:"+(playerTwoPosition));
                        }
                        break;
                    default:
                        System.out.print(diceTurn);
                        diceTurn=1;
                        if (playerTwoPosition-dice<0.0) {
                            playerTwoPosition=0.0;
                        }
                        else{
                            playerTwoPosition=playerTwoPosition-dice;
                        }
                        System.out.println("   Snake. Player1:"+playerOnePosition+" and Player2:"+(playerTwoPosition));
                        break;
                }
            }
        }

        System.out.println("Dice was played "+countOfPlayerOne+" times for Player1 and "+countOfPlayerTwo+" times for Player2");
        System.out.println("Player one position is "+playerOnePosition);
        System.out.println("Player two position is "+playerTwoPosition);
        System.out.println("");

        if(playerOnePosition==100.0){
            System.out.println("Player 1 Won the game");
        }
        else{
            System.out.println("Player 2 Won the game");
        }
    }

}
