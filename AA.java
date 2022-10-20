package Library.howemork;

import javax.swing.*;

public class AA {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(2000,2000);
        frame.setTitle("ny name");
        frame.setVisible(true);
        Name_com nc = new  Name_com();
        frame.add(nc);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
