//This class is used for initialising a new BackgammonBoard and provide some basic option methods.
public class BackgammonBoard{
    //Using an array'number' to store the number of the men on each point.
    //Using an array'colour' to store the colour of the men on each point.
    //Using an int'blackOnBar' to record the number of black men on bar.
    //Using an int'whiteOnBar' to record the number of white men on bar.
    private int[] number = new int[24];
    private boolean[] colour = new boolean[24];
    private int blackOnBar = 0;
    private int whiteOnBar = 0;

    public BackgammonBoard(){
    }

    //Using method'pointOnBoard' to check if a point is in legal bounds.
    private boolean pointOnBoard(int point) {
        return (point >= 0 && point <= 23);
    }

    //Using method'getPointCount' to get the number of men on the point.
    public int getPointCount(int point){
        return this.pointOnBoard(point) ? this.number[point] : 0;
    }

    //Using method'getPointBlack' to get the colour of men on the point.
    //'true' for 'black' and 'false' for 'white'.
    public boolean getPointBlack(int point){
        if(this.pointOnBoard(point)){
            return this.colour[point];
        }
        else{
            return true;
        }
    }

    //Using method'setPoint' to set the number and colour of men on the point.
    public void setPoint(int point, int count, boolean black){
        if(count >= 0 && this.pointOnBoard(point)){
            this.number[point] = count;
            this.colour[point] = black;
        }
    }

    //Using method'getBarBlackCount' to get the number of black men on bar.
    public int getBarBlackCount(){
        return this.blackOnBar;
    }

    //Using method'getBarWhiteCount' to get the number of white men on bar.
    public int getBarWhiteCount(){
        return this.whiteOnBar;
    }

    //Using method'move' to move a man from one point to another.
    public void move(int fromPoint, int toPoint){
        int distance = Math.abs(toPoint - fromPoint);
        if((distance >=1 && distance <=6) && this.pointOnBoard(fromPoint) && this.pointOnBoard(toPoint)){
            int fromNumber = this.getPointCount(fromPoint);
            int toNumber = this.getPointCount(toPoint);
            boolean fromColour = this.getPointBlack(fromPoint);
            boolean toColour = this.getPointBlack(toPoint);
            /*
            Black men can only move from higher to lower numbered points.
            White men can only move from lower to higher numbered points.
            A piece may be moved to an empty point, or to a point occupied by his or her own men,
            or to a point occupied by exactly one of the opponent's men.
            */
            if(fromNumber > 0 && ((fromColour && fromPoint > toPoint) || (!fromColour && fromPoint < toPoint))
                && (fromColour == toColour || toNumber <= 1)){
                //Attack a single opponent's man.
                if(fromColour != toColour && toNumber == 1){
                    if(toColour){
                        ++this.blackOnBar;
                    }
                    else{
                        ++this.whiteOnBar;
                    }
                    this.setPoint(fromPoint, fromNumber - 1, fromColour);
                    this.setPoint(toPoint, toNumber, fromColour);
                }
                //Move to an empty point or a point with own men.
                else if((toNumber == 0) || (fromColour == toColour)){
                    this.setPoint(fromPoint, fromNumber - 1, fromColour);
                    this.setPoint(toPoint, toNumber + 1, fromColour);
                }
            }
        }
    }
}

