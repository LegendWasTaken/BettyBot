package me.legend.betty.Betty.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GameCapture extends JPanel {

    public BufferedImage capture;
    private Gameview gameview;
    private int width;
    private int height;

    public GameCapture(int width, int height, Gameview view){
        this.capture = new BufferedImage(width, height, 1);
        this.gameview = view;
        this.width = width;
        this.height = height;
    }

    public void renderMatrix(boolean[][] matrix){
        int currentX = 0;
        int currentY = 0;

        int boxX = this.width / matrix[0].length;

        this.capture = new BufferedImage(width, height, 1);
        for(int x=0; x<matrix.length; x++){
            for(int y=0; y<matrix[x].length; y++){
                if(matrix[x][y]){
                    for(int a=0; a<boxX; a++) {
                        for (int b = 0; b < boxX; b++) {
                            capture.setRGB(x * boxX + currentX + a, y * boxX + currentY + b, 0xFFFFFF);
                        }
                    }
                }
            }
        }
        this.gameview.repaint();
    }

    @Override
    public void paintComponent(Graphics g){
        g.drawImage(capture, 0, 0, null);
    }

}
