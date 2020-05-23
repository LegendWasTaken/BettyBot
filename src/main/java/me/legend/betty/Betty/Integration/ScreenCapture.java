package me.legend.betty.Betty.Integration;

import me.legend.betty.Betty.Enums.Gamestate;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ScreenCapture {

    public static BufferedImage capture(int startX, int startY, BufferedImage out){
        try {
            Robot robot = new Robot();
            return robot.createScreenCapture(new Rectangle(
                    startX, startY,
                    out.getWidth(), out.getHeight()));
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    public static boolean[][] getGameMatrix(BufferedImage image){
        boolean matrix[][] = new boolean[10][20];
        BufferedImage captured = capture(1180, 250, image);
        int xOffset = 248 / 10;
        int yOffset = 480 / 20;
        for(int x=0; x<10; x++){
            for(int y=2; y<20; y++){
                Color color = new Color(captured.getRGB((x+1) * xOffset, (y+1) * yOffset));
                System.out.println(color);
                System.out.println("X: " + (x+1) * xOffset + ", Y: " + (y+1) * xOffset);
                matrix[x][y] = !((color.getRed() == 0 || color.getRed() == 46));
            }
        }
        return matrix;
    }

    public static Gamestate getCurrentGameState(){
        Gamestate currentState = Gamestate.UNKNOWN;
        try {
            Robot robot = new Robot();
            Color colour = robot.getPixelColor(1180 + 144, 250 + 312);
            if(colour.getRed() == 203 && colour.getGreen() == 214 && colour.getBlue() == 0)
                currentState = Gamestate.START; else currentState = Gamestate.PLAYING;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return currentState;
    }

}
