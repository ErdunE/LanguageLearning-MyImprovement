package com.snake;

import javax.swing.*;
import java.awt.*;

// extends JPanel
public class GamePanel extends JPanel {
    // auto call
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // set background color
        this.setBackground(new Color(132, 186, 205));

        // insert header png
        Images.bodyImg.paintIcon(this,g,0,0);
        g.fillRect(15,70,770,685);
    }
}
