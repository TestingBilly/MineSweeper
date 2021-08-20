package MineSweeper;

public class Block
{
    private boolean isBomb;
    private boolean isUncovered;
    private int [][] bombsNextTo;
    private boolean isFlagged;

    private int y;
    private int x;

    public Block(int x, int y)
    {
        this.x = x;
        this.y = y;

        float randomBombing = (float) Math.random();
        float ratioOfBombs = 0.25f;
        if (randomBombing <= ratioOfBombs)
        {
            isBomb = true;
        }
        else
        {
            isBomb= false;
        }

    }
// public int nearBombs(int x, int y)
// {
//     int no = 0;
//     for (int offsetX=-1; offsetX<=1; offsetX++)
//     {
//         for (int offsetY=-1; offsetY<=1; offsetY++)
//         {
//             no+=bombsNextTo[offsetX+x][offsetY+y];
//          }
//     }
//     return no;
// }
    public String toString ()
    {
        if (isBomb && isUncovered)
        {
            return "X";
        }
        if (!isBomb && isUncovered)
        {
           // return nearBombs(this.x,this.y);
            return "O";
        }

        return "[" + x + y + "]";
    }
}
