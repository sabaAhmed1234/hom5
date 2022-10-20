package Library.howemork;

import javax.swing.*;
import java.awt.*;

public class Name_com extends JComponent {
    public void p_com(Graphics g)
    {
        String name ="saba";
        Graphics2D g2=(Graphics2D) g;
        Rectangle rect=new Rectangle(300,300,100,100);
        g2.setColor(Color.cyan);
        g2.fill(rect);
        g2.setColor(Color.red);
        g2.drawString(name,400,300);
    }
}
