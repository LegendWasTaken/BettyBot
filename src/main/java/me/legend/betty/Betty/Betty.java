package me.legend.betty.Betty;

import me.legend.betty.Betty.Enums.PlayStyle;
import me.legend.betty.Betty.GUI.Gameview;
import me.legend.betty.Betty.Integration.ScreenCapture;

public class Betty {

    PlayStyle style;
    Gameview view;

    public Betty(PlayStyle style){
        this.style = style;
    }

    public void start(){
        view = new Gameview();
        boolean matrix[][] = new boolean[10][20];
        for(int i=0; i<10; i++){
            for(int j=0; j<20; j++){
                matrix[i][j] = Math.random() >= 0.5;
            }
        }
        while(true)
        view.capture.renderMatrix(ScreenCapture.getGameMatrix(view.capture.capture));
    }

}
