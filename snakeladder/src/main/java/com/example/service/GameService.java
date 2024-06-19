package com.example.service;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

import com.example.model.Board;
import com.example.model.Game;
import com.example.model.Player;

public class GameService{
    public static Game createGame(List<Player> players, int noOfDice, Board board){
        System.out.println("Game created");
        return new Game(players, noOfDice, board);
    }
    
    public static void playGame(Game game){
        int winnerPositon = 1;
        Board board = game.getBoard();
        System.out.println("Game Started");
        Queue<Player> playersQueue = new ArrayDeque<>();
        int noOfDice = game.getDices();
        for(Player player: game.getPlayers()){
            playersQueue.add(player);
        }
        while(playersQueue.size()>1){
            Player player = playersQueue.poll();
            System.out.println(player.getPlayerName()+ "'s turn");

            int diceValue = DiceService.rollDice(noOfDice);
            System.out.println(player.getPlayerName()+" rolled a dice 🎲.\nDice value is "+diceValue);

            int newPos = BoardService.getNewPosition(board, player.getPlayerPosition(), diceValue);
            System.out.println("New position of "+player.getPlayerName()+" is "+ newPos);
            
            player.setPlayerPosition(newPos);
            if(player.getPlayerPosition() == board.getBoardSize()){
                player.setWin(true);
                player.setWinPosition(winnerPositon++);
                game.addWinner(player);
                System.out.println("🎉🎉🎉🎉🎉🎉🎉🎉");
                System.out.println(player.getPlayerName()+" wins and secured "+player.getWinPosition()+" place");
                System.out.println("🎈🎈🎈🎈🎈🎈🎈🎈");
            }else{
                playersQueue.add(player);
            }
        }
        Player player = playersQueue.poll();
        player.setWinPosition(winnerPositon);
        System.out.println();
        System.out.println(player.getPlayerName()+" Lose the game with "+player.getWinPosition()+" place");
    }
}