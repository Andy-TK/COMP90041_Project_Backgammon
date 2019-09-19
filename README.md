### COMP90041 Project 1: Backgammon Game
This is the Project 1 for COMP90041(Programming and Software Development) from the University of Melbourne.

#### 1. The Game of Backgammon
Backgammon is a board game that originated from ancient Persian.

The 24 triangles on the board, called _points_, can each hold any number of disk-shaped game pieces, called _men_, as long as all the men on a point are the same colour. We number the points from 0 (lower right) through 11 (lower left) to 12 (upper left) through to 23 (upper right). There are two colours of men; actual colours vary depending on the Backgammon set, but we shall call the colours _black_ and _white_.

<img src="https://github.com/Andy-TK/COMP90041_Project_Backgammon/blob/master/Backgammon.png" alt="Backgammon" width="50%">

The two players face each other across the board; the player on the near side moves the black pieces, and the facing player moves white. The two players take turns rolling dice which determine how far they are allowed to move how many of their men in that turn. White men always move from lower to higher numbered points (clockwise), and black men move from higher to lower numbered points (anti-clockwise). Each move consists of the player selecting one of his or her pieces and moving it one of the numbers of steps indicated by the dice. A piece may be moved to an empty point, or to a point occupied by his or her own men, or to a point occupied by exactly one of the opponent’s men. In the latter case, the opponent’s man is moved from the destination point to the _bar_ running from top to bottom down the middle of the above picture, and the player’s man becomes the sole occupant of that point. It is not permitted to move a piece onto a point occupied by two or more of the opponent’s men. For example, one of the men in the lower left of the above picture (on point 11) would be allowed to move to the empty point 13, or to point 16, because it is occupied by men of the same colour, but not to point 12, because that is occupied by more than one of the opponent’s men. It is also not permitted to move a man directly from point 11 to point 18, because that is more than 6 points away.

#### 2. What is the task?
#### 2.1. Write a Java class that represents a Backgammon board
You should write a Java class BackgammonBoard that represents a Backgammon board. It should implement the following methods and constructors:

`BackgammonBoard()` - (constructor) Creates a fresh _BackgammonBoard_ with no men on it.

`int getPointCount(int point)` - Returns the number of men on the point.

`boolean getPointBlack(int point)` - Returns _true_ if the men on the speciﬁed point are black, or _false_ if they are white. If there are no men on that point, the result may be either _true_ or _false_.

`void setPoint(int point, int count, boolean black)` - Sets the number of men on the speciﬁed point to the speciﬁed count, and sets their colour to black if _black_ is true, or white if it is false.

`int getBarBlackCount()` - Returns the number of black men on the bar.

`int getBarWhiteCount()` - Returns the number of white men on the bar.

`void move(int fromPoint, int toPoint)` - Moves one men from the speciﬁed _fromPoint_ to the speciﬁed _toPoint_, if the move is legal; if it is illegal, this method does nothing.

For `setPoint` and `move` methods, if a speciﬁed point number is not between 0 and 23, the method should do nothing. For `getPointCount` and `getPointBlack`, if the speciﬁed point is out of bounds, the value returned may be any valid value of the appropriate type.

For more details, please check the [assessed4](https://github.com/Andy-TK/COMP90041_Project_Backgammon/blob/master/assessed4.pdf).

#### 2.2. Write a Java class that represents a Backgammon board
You should write a Java class BackgammonBoard that represents a Backgammon board. It should implement the following methods and constructors:

`BackgammonBoard()` - (constructor) Creates a fresh _BackgammonBoard_ with no men on it.

`int getPointCount(int point)` - Returns the number of men on the point.

`boolean getPointBlack(int point)` - Returns _true_ if the men on the speciﬁed point are black, or _false_ if they are white. If there are no men on that point, the result may be either _true_ or _false_.

`void setPoint(int point, int count, boolean black)` - Sets the number of men on the speciﬁed point to the speciﬁed count, and sets their colour to black if _black_ is true, or white if it is false.

`int getBarBlackCount()` - Returns the number of black men on the bar.

`int getBarWhiteCount()` - Returns the number of white men on the bar.

`void move(int fromPoint, int toPoint)` - Moves one men from the speciﬁed _fromPoint_ to the speciﬁed _toPoint_, if the move is legal; if it is illegal, this method does nothing.

For `setPoint` and `move` methods, if a speciﬁed point number is not between 0 and 23, the method should do nothing. For `getPointCount` and `getPointBlack`, if the speciﬁed point is out of bounds, the value returned may be any valid value of the appropriate type.

For more details, please check the [assessed4](https://github.com/Andy-TK/COMP90041_Project_Backgammon/blob/master/assessed4.pdf).