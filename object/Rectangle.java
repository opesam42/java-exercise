import javax.swing.*;
import java.awt.*;

public class Rectangle extends JPanel {
    int length;
    int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.drawRect(50, 50, (50 + this.length), (50 + this.width));
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Rectangle Drawing");
        Rectangle rect1 = new Rectangle(10, 30);

        frame.add(rect1);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        // on the way royal concept

    }
}
