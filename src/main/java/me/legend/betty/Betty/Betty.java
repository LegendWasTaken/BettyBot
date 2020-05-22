package me.legend.betty.Betty;

import me.legend.betty.Betty.Enums.PlayStyle;
import me.legend.betty.Betty.GUI.Gameview;

public class Betty {

    PlayStyle style;
    Gameview view;

    public Betty(PlayStyle style){
        this.style = style;
    }

    public void start(){
        view = new Gameview();
    }

}
