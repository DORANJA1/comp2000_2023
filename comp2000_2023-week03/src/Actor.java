import java.awt.Graphics;
import java.awt.Color;

public class Actor extends Stage{
    Cell[][] cells = new Cell[20][20];
    int size = 35;

    public void paint(Graphics g, Color c){
        g.setColor(c);
        g.fillRect(0, 0, size, size);
    }

    public void Cat(int x, int y){
       
    }

    public void Dog(){

    }

    public void Brid(){

    }
}
