package me.legend.betty;

import me.legend.betty.Betty.Betty;
import me.legend.betty.Betty.Enums.PlayStyle;

public class Main {

    public static void main(String... args){
        Betty betty = new Betty(PlayStyle.SPRINT);
        betty.start();
    }

}
