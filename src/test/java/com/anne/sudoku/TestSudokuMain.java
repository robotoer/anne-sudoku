package com.anne.sudoku;

import org.junit.Assert;
import org.junit.Test;

public final class TestSudokuMain {
  public static final SudokuBoard VALID_1 = new SudokuBoard(
      new Integer[][] {
          new Integer[] {4, 3, 5, 2, 6, 9, 7, 8, 1},
          new Integer[] {6, 8, 2, 5, 7, 1, 4, 9, 3},
          new Integer[] {1, 9, 7, 8, 3, 4, 5, 6, 2},
          new Integer[] {8, 2, 6, 1, 9, 5, 3, 4, 7},
          new Integer[] {3, 7, 4, 6, 8, 2, 9, 1, 5},
          new Integer[] {9, 5, 1, 7, 4, 3, 6, 2, 8},
          new Integer[] {5, 1, 9, 3, 2, 6, 8, 7, 4},
          new Integer[] {2, 4, 8, 9, 5, 7, 1, 3, 6},
          new Integer[] {7, 6, 3, 4, 1, 8, 2, 5, 9},
      }
  );

  public static final SudokuBoard VALID_2 = new SudokuBoard(
      new Integer[][] {
          new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9},
          new Integer[] {4, 5, 6, 7, 8, 9, 1, 2, 3},
          new Integer[] {7, 8, 9, 1, 2, 3, 4, 5, 6},
          new Integer[] {2, 3, 4, 5, 6, 7, 8, 9, 1},
          new Integer[] {5, 6, 7, 8, 9, 1, 2, 3, 4},
          new Integer[] {8, 9, 1, 2, 3, 4, 5, 6, 7},
          new Integer[] {3, 4, 5, 6, 7, 8, 9, 1, 2},
          new Integer[] {6, 7, 8, 9, 1, 2, 3, 4, 5},
          new Integer[] {9, 1, 2, 3, 4, 5, 6, 7, 8},
      }
  );

  public static final SudokuBoard INVALID_1 = new SudokuBoard(
      new Integer[][] {
          new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9},
          new Integer[] {2, 3, 4, 5, 6, 7, 8, 9, 1},
          new Integer[] {3, 4, 5, 6, 7, 8, 9, 1, 2},
          new Integer[] {4, 5, 6, 7, 8, 9, 1, 2, 3},
          new Integer[] {5, 6, 7, 8, 9, 1, 2, 3, 4},
          new Integer[] {6, 7, 8, 9, 1, 2, 3, 4, 5},
          new Integer[] {7, 8, 9, 1, 2, 3, 4, 5, 6},
          new Integer[] {8, 9, 1, 2, 3, 4, 5, 6, 7},
          new Integer[] {9, 1, 2, 3, 4, 5, 6, 7, 8},
      }
  );

  public static final SudokuBoard INVALID_2 = new SudokuBoard(
      new Integer[][] {
          new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9},
          new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9},
          new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9},
          new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9},
          new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9},
          new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9},
          new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9},
          new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9},
          new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9},
      }
  );

  public static final SudokuBoard INVALID_3 = new SudokuBoard(
      new Integer[][] {
          new Integer[] {1, 1, 1, 2, 2, 2, 3, 3, 3},
          new Integer[] {1, 1, 1, 2, 2, 2, 3, 3, 3},
          new Integer[] {1, 1, 1, 2, 2, 2, 3, 3, 3},
          new Integer[] {1, 1, 1, 2, 2, 2, 3, 3, 3},
          new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9},
          new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9},
          new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9},
          new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9},
          new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9},
      }
  );

  public static final SudokuBoard INVALID_4 = new SudokuBoard(
      new Integer[][] {
          new Integer[] {4, 3, 5, 2, 6, 9, 7, 80, 1},
          new Integer[] {6, 8, 2, 5, 7, 1, 4, 90, 3},
          new Integer[] {1, 9, 7, 8, 3, 4, 5, 6, 2},
          new Integer[] {8, 2, 6, 1, 9, 50, 3, 4, 7},
          new Integer[] {3, 7, 4, 6, 8, 2, 9, 1, 5},
          new Integer[] {9, 5, 1, 7, 4, 3, 6, 2, 8},
          new Integer[] {5, 1, 9, 3, 2, 6, 8, 7, 4},
          new Integer[] {2, 4, 8, 9, 5, 7, 1, 3, 6},
          new Integer[] {7, 6, 3, 4, 1, 8, 2, 5, 9},
      }
  );

  @Test
  public void testValidateSudokuBoard() throws Exception {
    Assert.assertTrue(
        String.format("%s is a valid board but was not recognized as one.", VALID_1),
        SudokuMain.validateSudokuBoard(VALID_1)
    );
    Assert.assertTrue(
        String.format("%s is a valid board but was not recognized as one.", VALID_2),
        SudokuMain.validateSudokuBoard(VALID_2)
    );

    Assert.assertTrue(
        String.format("%s is a valid board but was not recognized as one.", INVALID_1),
        SudokuMain.validateSudokuBoard(INVALID_1)
    );
    Assert.assertTrue(
        String.format("%s is a valid board but was not recognized as one.", INVALID_2),
        SudokuMain.validateSudokuBoard(INVALID_2)
    );
    Assert.assertTrue(
        String.format("%s is a valid board but was not recognized as one.", INVALID_3),
        SudokuMain.validateSudokuBoard(INVALID_3)
    );
    Assert.assertTrue(
        String.format("%s is a valid board but was not recognized as one.", INVALID_4),
        SudokuMain.validateSudokuBoard(INVALID_4)
    );
  }
}