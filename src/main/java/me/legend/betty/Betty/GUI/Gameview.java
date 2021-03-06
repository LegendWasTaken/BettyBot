package me.legend.betty.Betty.GUI;

import me.legend.betty.Betty.Enums.Gamestate;

import javax.swing.*;

public class Gameview extends JFrame {

    public static final int SIZE_X = 380;
    public static final int SIZE_Y = 520;

    public GameCapture capture;

    public Gameview() {
        super();
        setSize(SIZE_X, SIZE_Y);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        this.capture = new GameCapture(SIZE_X, SIZE_Y, this);
        add(this.capture);
        setVisible(true);
    }

    public void setCurrentGamestate(Gamestate state){
        setTitle("Betty Jstris Bot | Current State: " + state.toString().toLowerCase());
    }

}
