package com.wipro.java.collection.usecase;

import java.util.Scanner;

public class TicTacToe {
    private static final int SIZE = 3;
    private static char[][] board = new char[SIZE][SIZE];
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;

        do {
            initializeBoard();
            playGame(scanner);
            playAgain = askRestart(scanner);
        } while (playAgain);

        System.out.println("Thanks for playing! 👋");
        scanner.close();
    }

    // Initialize the board with empty spaces
    private static void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = ' ';
            }
        }
        currentPlayer = 'X'; // Reset to Player X
    }

    // Main game loop
    private static void playGame(Scanner scanner) {
        boolean gameRunning = true;

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", enter your move (row and column: 0, 1, or 2): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (isValidMove(row, col)) {
                board[row][col] = currentPlayer;

                if (isWinner()) {
                    printBoard();
                    System.out.println("🎉 Player " + currentPlayer + " wins! 🎉");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw! 🤝");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }
    }

    // Check if the selected move is valid
    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == ' ';
    }

    // Switch to the other player
    private static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    // Print the current board state
    private static void printBoard() {
        System.out.println("\n  0 1 2");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j]);
                if (j < SIZE - 1) System.out.print("|");
            }
            System.out.println();
            if (i < SIZE - 1) System.out.println("  -----");
        }
        System.out.println();
    }

    // Check if the board is full (Draw condition)
    private static boolean isBoardFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    // Check if the current player has won
    private static boolean isWinner() {
        return checkRows() || checkCols() || checkDiagonals();
    }

    private static boolean checkRows() {
        for (int i = 0; i < SIZE; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkCols() {
        for (int j = 0; j < SIZE; j++) {
            if (board[0][j] == currentPlayer && board[1][j] == currentPlayer && board[2][j] == currentPlayer) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkDiagonals() {
        return (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
               (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);
    }

    // Ask if the user wants to play again
    private static boolean askRestart(Scanner scanner) {
        System.out.print("Do you want to play again? (Y/N): ");
        char response = scanner.next().toUpperCase().charAt(0);
        return response == 'Y';
    }
}
