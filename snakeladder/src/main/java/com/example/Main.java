package com.example;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import com.example.model.Board;
import com.example.model.Game;
import com.example.model.Player;
import com.example.service.BoardService;
import com.example.service.GameService;

public class Main {
    public static HashMap<Integer, Integer> createStructures(int[][] array){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int[] arr: array){
            map.put(arr[0], arr[1]);
        }
        return map;
    }
    public static void main(String[] args) {
        int[][] snakes_array = {{62, 5}, {33, 6}, {49, 9}, {88, 16}, {41, 20}, {56, 53}, {98, 64}, {93, 73}, {95, 75}};
        int[][] ladders_array = {{2, 37}, {27, 46}, {10, 32}, {51, 68}, {61, 79}, {65, 84}, {71, 91}, {81, 100}};
        
        int boardSize = 100;
        HashMap<Integer, Integer> snakes = createStructures(snakes_array);
        HashMap<Integer, Integer> ladders = createStructures(ladders_array);

        Board board = BoardService.createBoard(boardSize, snakes, ladders);

        Player p1 = new Player("Avinash", 0);
        Player p2 = new Player("Ankur", 1);
        Player p3 = new Player("Nitish", 2);
        List<Player> players = new ArrayList<>();
        int noOfDice = 1;

        players.add(p1);
        players.add(p2);
        players.add(p3);

        Game game = GameService.createGame(players, noOfDice, board);
        GameService.playGame(game);
    }
}