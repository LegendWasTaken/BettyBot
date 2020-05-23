package me.legend.betty.Betty;

import me.legend.betty.Betty.Enums.Gamestate;
import me.legend.betty.Betty.Enums.PlayStyle;
import me.legend.betty.Betty.GUI.Gameview;
import me.legend.betty.Betty.Integration.ScreenCapture;
import sun.awt.X11.Screen;

public class Betty {

    PlayStyle style;
    Gameview view;
    Gamestate gamestate;

    public Betty(PlayStyle style){
        this.style = style;
    }

    public void start(){
        view = new Gameview();
        try {
            while (true) {
                // Get the state the game is currently in
                gamestate = ScreenCapture.getCurrentGameState();
                view.setCurrentGamestate(gamestate);
                //

                Thread.sleep(100); // We should only sample stuff 10 times a second ish
//            view.capture.renderMatrix(ScreenCapture.getGameMatrix(view.capture.capture));
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
