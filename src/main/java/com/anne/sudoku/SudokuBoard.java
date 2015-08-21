package com.anne.sudoku;

import java.util.List;

import com.google.common.collect.Lists;

// The state that represents a Sudoku board.
public final class SudokuBoard {
  private final Integer[][] mBoardState;

  public SudokuBoard(final Integer[][] boardState) {
    mBoardState = boardState;
  }

  public int getCell(final int x, final int y) {
    // Find the cell defined by row x and column y.
    return mBoardState[x][y];
  }

  public List<Integer> getRow(final int y) {
    final List<Integer> row = Lists.newArrayList();
    for (int x = 0; x < 9; x++) {
      row.add(mBoardState[x][y]);
    }
    return row;
  }

  public List<Integer> getColumn(final int x) {
    return Lists.newArrayList(mBoardState[x]);
  }

  public List<Integer> getSubSquare(final int x, final int y) {
    final List<Integer> subSquareCells = Lists.newArrayList();

    for(int i = 0; i < 3; i++){
      for (int j = 0; j < 3; j++) {

      }
    }

    return subSquareCells;
  }
}
