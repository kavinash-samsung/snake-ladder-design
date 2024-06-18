package com.example.manager;

import java.util.Scanner;

import com.example.services.BoardService;
import com.example.services.LadderService;
import com.example.services.SnakeService;

public class GameManager {
    BoardService boardService;
    LadderService ladderService;
    SnakeService snakeService;
    List<Pla
    public void initializeGame(int capacity, int[][] ladders, int[][] snakes){
        boardService = new BoardService(capacity);
        ladderService = new LadderService();
        ladderService.initializeLadders(ladders);
        snakeService = new SnakeService();
        snakeService.initializeSnakes(snakes);
        System.out.println("Game initialized successfully");
    }
    public void proceedeGame(Scanner scanner){
        System.out.println("");
        scanner.nextInt();
    }
}
