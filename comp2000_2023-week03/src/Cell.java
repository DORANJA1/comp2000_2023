import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;;

public class Cell extends Rectangle{
  // fields
  int x;
  int y;
  static int size = 35;
  Graphics g;


  
  // constructors
  public Cell(int inX, int inY) {
    x = inX;
    y = inY;
    if(super.contains(inX, inY)==false){
      Actor actor = new Actor();
      actor.Cat(g, inX, inY);
    };
  }

  // methods
  public void paint(Graphics g, Point mousePos) {
    if(contains(mousePos)) {
      g.setColor(Color.GRAY);
    } else {
      g.setColor(Color.WHITE);
    }

    g.fillRect(x, y, size, size);
    g.setColor(Color.BLACK);
    g.drawRect(x, y, size, size);
    
  }

  public boolean contains(Point p) {
    if(p != null) {
      return x < p.x && x+size > p.x && y < p.y && y+size > p.y;
    } else {
      return false;
    }
  }
}
