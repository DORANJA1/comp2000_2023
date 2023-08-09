import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;


public class Stage extends Rectangle{
    Grid grid = new Grid();

    Actor actor0 = new Actor();
    Actor actor1 = new Actor();
    Actor actor2 = new Actor();
    

}

class Actor extends Stage{
    Cell[][] cells = new Cell[20][20];
    int size = 35;
    Graphics g;


    
    public void paint(Graphics g, Color c, int x ,int y){
        g.setColor(c);
        g.fillRect(0, 0, size, size);
    }

    public void Cat(Graphics g, int x, int y){
        
        // paint(g, Color.blue, x, y);
        g.setColor(Color.BLUE);
        g.fillRect(x, y, size, size);
    }

    public Cell Dog(int x, int y){
        paint(g, Color.YELLOW, x, y);
        return cells[x/size][y/size];

    }

    public Cell Brid(int x, int y){
        paint(g, Color.GREEN, x, y);
       return cells[x/size][y/size];

    }
}

