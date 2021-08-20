import javax.swing.*;
import java.awt.*;

public class Main
{
    ///////////////////////Make The Grid/////////////////////

    public class difficulty
    {
        int minesNo;
        public difficulty(int minesNo)
        {
            this.minesNo = minesNo;
        }
    }
    public class size
    {
        int width;
        int height;

        public size(int width, int height)
        {
            this.width = width;
            this.height = height;
        }

    }
    size small = new size(7,7);
    size medium = new size(12,12);
    size large = new size(20,20);

    difficulty easy = new difficulty(3);
    difficulty mid = new difficulty(6);
    difficulty hard = new difficulty(10);


    boolean isMine;
    boolean isFlag;
    boolean isShown;

    public class mineGridLayout
    {

    }

    //////////////////////NEW GAME////////////////


    ////////////////PLAY THE GAME/////////////

}
