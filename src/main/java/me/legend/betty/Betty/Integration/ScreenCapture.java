package me.legend.betty.Betty.Integration;

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

}
