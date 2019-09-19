### COMP90041 Project 1: Backgammon Game
This is the Project 1 for COMP90041(Programming and Software Development) from the University of Melbourne.

#### 1. The Game of Backgammon
Backgammon is a board game that originated from ancient Persian.

<img src="https://github.com/Andy-TK/COMP90041_Project_Backgammon/blob/master/Backgammon.png" alt="Backgammon" width="50%">

The 24 triangles on the board, called _points_, can each hold any number of disk-shaped game pieces, called _men_, as long as all the men on a point are the same colour. We number the points from 0 (lower right) through 11 (lower left) to 12 (upper left) through to 23 (upper right). There are two colours of men; actual colours vary depending on the Backgammon set, but we shall call the colours _black_ and _white_.

The two players face each other across the board; the player on the near side moves the black pieces, and the facing player moves white. The two players take turns rolling dice which determine how far they are allowed to move how many of their men in that turn. White men always move from lower to higher numbered points (clockwise), and black men move from higher to lower numbered points (anti-clockwise). Each move consists of the player selecting one of his or her pieces and moving it one of the numbers of steps indicated by the dice. A piece may be moved to an empty point, or to a point occupied by his or her own men, or to a point occupied by exactly one of the opponent’s men. In the latter case, the opponent’s man is moved from the destination point to the _bar_ running from top to bottom down the middle of the above picture, and the player’s man becomes the sole occupant of that point. It is not permitted to move a piece onto a point occupied by two or more of the opponent’s men. For example, one of the men in the lower left of the above picture (on point 11) would be allowed to move to the empty point 13, or to point 16, because it is occupied by men of the same colour, but not to point 12, because that is occupied by more than one of the opponent’s men. It is also not permitted to move a man directly from point 11 to point 18, because that is more than 6 points away.

