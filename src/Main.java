import javax.swing.*;

import java.awt.*;

public class Main extends JFrame {
    Grid  Gr = new Grid();
    Cell  Ce = new Cell();
    public static void main(String[] args) throws Exception{
        Main window = new Main();
    }

    class Canvas extends JPanel{
        public Canvas(){
            setPreferredSize(new Dimension(720, 720));
        }

        @Override
        public void paint(Graphics g){
            Gr.paint(g);
            Ce.paintPart(g, Color.green, 3, 0);
        }
        
       

        
    }

    private Main(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }


}

