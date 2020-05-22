package me.legend.betty;

import me.legend.betty.Betty.Betty;
import me.legend.betty.Betty.Enums.PlayStyle;
import me.legend.betty.Betty.GUI.Gameview;
import me.legend.betty.Betty.Integration.ScreenCapture;
import sun.awt.X11.Screen;

public class Main {

    public static void main(String... args){
//        Betty betty = new Betty(PlayStyle.SPRINT);
//        betty.start();

        Gameview view = new Gameview();
        while(true) {
            view.capture.capture = ScreenCapture.capture(1180, 260, view.capture.capture);
            view.repaint();
        }
    }

}
