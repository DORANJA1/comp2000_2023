import java.awt.Color;
import java.awt.Graphics;

public class Grid {
   

    public void paint(Graphics g){
        for(int i=10; i<710; i+=35){
            for(int j=10; j<710; j+=35){
                g.setColor(Color.BLACK);
                g.drawRect(i, j, 35, 35);
                g.setColor(Color.WHITE);
                g.fillRect(i, j, 34, 34);

            }
        }
    }
    
}
