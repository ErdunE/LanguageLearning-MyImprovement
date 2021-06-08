package com.snake;

// Get the png in the game

import javax.swing.*;
import java.net.URL;

public class Images {
    // get the path of the png and encapsulation
    public static URL bodyURL = Images.class.getResource("/images/body.png");
    public static ImageIcon bodyImg = new ImageIcon(bodyURL);

    public static URL foodURL = Images.class.getResource("/images/food.png");
    public static ImageIcon foodImg = new ImageIcon(foodURL);

    public static URL headDownURL = Images.class.getResource("/images/headdown.png");
    public static ImageIcon headDownImg = new ImageIcon(headDownURL);

    public static URL headLeftURL = Images.class.getResource("/images/headleft.png");
    public static ImageIcon headLeftImg = new ImageIcon(headLeftURL);

    public static URL headRightURL = Images.class.getResource("/images/headright.png");
    public static ImageIcon headRight = new ImageIcon(headRightURL);

    public static URL headUpURL = Images.class.getResource("/images/heightup.png");
    public static ImageIcon headUpImg = new ImageIcon(headUpURL);

    public static URL headerURL = Images.class.getResource("/images/header.png");
    public static ImageIcon headerImg = new ImageIcon(headerURL);
}
