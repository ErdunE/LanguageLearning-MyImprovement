package com.snake;
/*
    Gluttonous Snake
    Erdun E
    Contact: Erdun_E@student.uml.edu
    Anyone may freely use this code. Just don't sue me if it breaks stuff.
    Created: May 26th, 2021.
    Last Updated: May 26th, 2021.
 */
import javax.swing.*;
import java.awt.*;

public class StartGame {
    public static void main(String[] args) {
        // create a window
        JFrame jf = new JFrame();

        // title part
        jf.setTitle("Snake Game by E");

        // set the height and width
        // set the location when window pop out
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        jf.setBounds((width-800)/2,(height-800)/2,800,800);

        // size of window can not resize
        jf.setResizable(false);
        // close window, programming stop.
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // create panel and add into the window
        GamePanel gp = new GamePanel();
        jf.add(gp);

        // display window
        jf.setVisible(true);



    }
}
