import java.awt.Color;
import java.awt.Graphics;

public class Cell{
    
    public void paintPart(Graphics g, Color color, int x, int y){
    
        g.setColor(color);
        g.fillRect(10+x*35, 10+y*35, 35, 35);
    }

}