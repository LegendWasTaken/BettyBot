package me.legend.betty.Betty.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GameCapture extends JPanel {

    public BufferedImage capture;

    public GameCapture(int width, int height){
        capture = new BufferedImage(width, height, 1);
        capture.setRGB(0, 0, 0xFFFFFF);
    }

    @Override
    public void paintComponent(Graphics g){
        g.drawImage(capture, 0, 0, null);
    }

}
