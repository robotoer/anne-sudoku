package com.anne.sudoku;

import java.util.HashSet;
import java.util.List;

public final class SudokuMain {
  public static void main(final String[] args) {
    System.out.println("Hello Anne!");
  }

  // Write a method that, given a fully filled out sudoku board will return true or false depending
  // on if it is a valid board given the rules of sudoku.

  // The rules of sudoku:
  // - All rows must contain the numbers 1-9 each appearing once and only once.
  // - All columns must contain the numbers 1-9 each appearing once and only once.
  // - Take the sudoku board (9x9 grid of single digit numbers larger than 0) and subdivide it intoand the;lskdjf;lkasjdf;lkjasd;lfkjas;ldkfja;lskdj;lkasdffjjkjkjkjkjkjkj2222222
  //   9 non-overlapping 3x3 squares each containing 9 single digit numbers larger than 0. Each of
  //   these subsquares must contain the numbers 1-9 each appearing once and only once.

  /**
   * Checks that a list of cells contains the numbers 1-9 each appearing once and only once.
   *
   * @param cells A list of cell values.
   * @return True if the provided list contains the numbers 1-9 each appearing once and only once.
   */
  public static boolean validateCells(final List<Integer> cells) {
    // Check to ensure that the number of provided cells is correct.
    if (cells.size() != 9) {
      return false;
    }

    // Check to see that no numbers are repeated.
    final HashSet<Integer> seenValues = new HashSet<>();
    for (final Integer cell : cells) {
      if (cell > 9 || cell < 1) {
        return false;
      }

      if (seenValues.contains(cell)) {
        return false;
      }

      seenValues.add(cell);
    }

    return true;
  }

  public static boolean validateSudokuBoard(final SudokuBoard board) {
    // Check rows.
    for (int i = 0; i < 9; i++) {
      if (!validateCells(board.getRow(i))) {
        return false;
      }
    }

    // Check columns.
    for (int i = 0; i < 9; i++) {
      if (!validateCells(board.getColumn(i))) {
        return false;
      }
    }

    // Check subsquares.
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (!validateCells(board.getSubSquare(i, j))) {
          return false;
        }
      }
    }

    // If we made it this far, the board is valid.
    return true;

//
//    //if cell x,y != array values return true?
//    //if cell x,y = any value w/n array return false?
//    for(public I = int 0; I <= array.length; I++){
//      if(BoardState != boardArray[I]){
//        I++
//      }
//      if(BoardState === array[I])
//    }
  }
}
