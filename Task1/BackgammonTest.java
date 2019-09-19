//This class is for testing the method'move' of class'BackgammonBoard'.

public class BackgammonTest
{
  public static void main(String[] args)
  {
    if (Test1() == "BUG" || Test2() == "BUG" || Test3() == "BUG" || Test4() == "BUG" || Test5() == "BUG" || Test6() == "BUG")
    {
      System.out.println("BUG");
    }
    else
    {
      System.out.println("CORRECT");
    }
  }

  //Considering Move method has no return value, we can test it through check the return values of other methods (e.g. getPointCount).
  //With the game instruction, we can test the rules that Move method should follow.

  private static String Test1()
  //Test Black and White men respectively.
  //Number of men at start & end points should not change if moving distance > 6.
  {
    BackgammonBoard testBoard = new BackgammonBoard();
    String result;
    testBoard.setPoint(20, 1, true);
    testBoard.setPoint(0, 1, false);
    testBoard.move(0, 8);
    testBoard.move(20, 10);
    int fromCountBlack = testBoard.getPointCount(20);
    int toCountBlack = testBoard.getPointCount(10);
    int fromCountWhite = testBoard.getPointCount(0);
    int toCountWhite = testBoard.getPointCount(8);

    if ((fromCountBlack == 1 && toCountBlack == 0)
        && (fromCountWhite == 1 && toCountWhite == 0))
    {
      result = "CORRECT";
    }
    else result = "BUG";

    return result;
  }


  private static String Test2()
  //Test Black and White men respectively.
  //Start & end number should not change if being moved off the Board (end point < 0 or > 23).
  {
    BackgammonBoard testBoard = new BackgammonBoard();
    String result;
    testBoard.setPoint(0, 1, true);
    testBoard.setPoint(23, 1, false);
    testBoard.move(0, -1);
    testBoard.move(23, 24);
    int fromCountBlack = testBoard.getPointCount(0);
    int toCountBlack = testBoard.getPointCount(-1);
    int fromCountWhite = testBoard.getPointCount(23);
    int toCountWhite = testBoard.getPointCount(24);

    if ((fromCountBlack == 1 && toCountBlack == 0)
        && (fromCountWhite == 1 && toCountWhite == 0))
    {
      result = "CORRECT";
    }
    else result = "BUG";

    return result;
  }


  private static String Test3()
  //Test Black and White men respectively.
  //After moving, start number -1, end number +1, end colour keeps the same.
  {
    BackgammonBoard testBoard = new BackgammonBoard();
    String result;
    testBoard.setPoint(5, 1, true);
    testBoard.setPoint(8, 1, false);
    testBoard.move(5, 0);
    testBoard.move(8, 10);
    int fromCountBlack = testBoard.getPointCount(5);
    int toCountBlack = testBoard.getPointCount(0);
    Boolean toColourBlack = testBoard.getPointBlack(0);
    int fromCountWhite = testBoard.getPointCount(8);
    int toCountWhite = testBoard.getPointCount(10);
    Boolean toColourWhite = !testBoard.getPointBlack(10);

    if ((fromCountBlack == 0 && toCountBlack == 1 && toColourBlack)
        && (fromCountWhite == 0 && toCountWhite == 1 && toColourWhite))
    {
      result = "CORRECT";
    }
    else result = "BUG";

    return result;
  }


  private static String Test4()
  //Test Black and White men respectively.
  //When moving direction is wrong, start & end number should not change.
  {
    BackgammonBoard testBoard = new BackgammonBoard();
    String result;
    testBoard.setPoint(0, 1, true);
    testBoard.setPoint(10, 1, false);
    testBoard.move(0, 5);
    testBoard.move(10, 8);
    int fromCountBlack = testBoard.getPointCount(0);
    int toCountBlack = testBoard.getPointCount(5);
    int fromCountWhite = testBoard.getPointCount(10);
    int toCountWhite = testBoard.getPointCount(8);

    if ((fromCountBlack == 1 && toCountBlack == 0)
        && (fromCountWhite == 1 && toCountWhite == 0))
    {
      result = "CORRECT";
    }
    else result = "BUG";

    return result;
  }


  private static String Test5()
  //Test Black and White men respectively.
  //After attack, start number -1, end number = 1, bar number+1, end colour change.
  {
    BackgammonBoard testBoard = new BackgammonBoard();
    String result;
    testBoard.setPoint(5, 1, true);
    testBoard.setPoint(0, 1, false);
    testBoard.setPoint(8, 1, false);
    testBoard.setPoint(10, 1, true);
    testBoard.move(5, 0);
    testBoard.move(8, 10);
    int fromCountBlack = testBoard.getPointCount(5);
    int toCountBlack = testBoard.getPointCount(0);
    Boolean toColourBlack = testBoard.getPointBlack(0);
    int barCountWhite = testBoard.getBarWhiteCount();
    int fromCountWhite = testBoard.getPointCount(8);
    int toCountWhite = testBoard.getPointCount(10);
    Boolean toColourWhite = !testBoard.getPointBlack(10);
    int barCountBlack = testBoard.getBarBlackCount();

    if ((fromCountBlack == 0 && toCountBlack == 1 && toColourBlack && barCountWhite ==1)
        && (fromCountWhite == 0 && toCountWhite == 1 && toColourWhite && barCountBlack ==1))
    {
      result = "CORRECT";
    }
    else result = "BUG";

    return result;
  }


  private static String Test6()
  //Test Black and White men respectively.
  //When moving to a point with more than 2 opponent's men, start & end number & end colour should not change.
  {
    BackgammonBoard testBoard = new BackgammonBoard();
    String result;
    testBoard.setPoint(5, 1, true);
    testBoard.setPoint(0, 2, false);
    testBoard.setPoint(8, 1, false);
    testBoard.setPoint(10, 2, true);
    testBoard.move(5, 0);
    testBoard.move(8, 10);
    int fromCountBlack = testBoard.getPointCount(5);
    int toCountBlack = testBoard.getPointCount(0);
    Boolean toColourBlack = testBoard.getPointBlack(0);
    int fromCountWhite = testBoard.getPointCount(8);
    int toCountWhite = testBoard.getPointCount(10);
    Boolean toColourWhite = !testBoard.getPointBlack(10);

    if ((fromCountBlack == 1 && toCountBlack == 2 && !toColourBlack)
        && (fromCountWhite == 1 && toCountWhite == 2 && !toColourWhite))
    {
      result = "CORRECT";
    }
    else result = "BUG";

    return result;
  }
}

