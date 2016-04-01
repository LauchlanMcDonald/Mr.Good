/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mr.good;

import environment.Environment;
import grid.Grid;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 *
 * @author samuelmartinezdelcampo
 */
public class GameSurface extends Environment {

    private Grid grid;
    private ArrayList<Barrier> barriers;

    public GameSurface() {

        grid = new Grid(30, 25, 20, 20, new Point(0, 0), new Color(220, 220, 220));
        
        
        
        
        
        
//<editor-fold defaultstate="collapsed" desc="Barriers">
        barriers = new ArrayList<>();
        barriers.add(new Barrier(0, 0, Color.GREEN, this));
        barriers.add(new Barrier(1, 0, Color.GREEN, this));
        barriers.add(new Barrier(2, 0, Color.GREEN, this));
        barriers.add(new Barrier(3, 0, Color.GREEN, this));
        barriers.add(new Barrier(4, 0, Color.GREEN, this));
        barriers.add(new Barrier(0, 1, Color.GREEN, this));
        barriers.add(new Barrier(0, 2, Color.GREEN, this));
        barriers.add(new Barrier(0, 3, Color.GREEN, this));
        barriers.add(new Barrier(0, 4, Color.GREEN, this));
        barriers.add(new Barrier(0, 5, Color.GREEN, this));
        barriers.add(new Barrier(0, 6, Color.GREEN, this));
        barriers.add(new Barrier(0, 7, Color.GREEN, this));
        barriers.add(new Barrier(5, 0, Color.GREEN, this));
        barriers.add(new Barrier(6, 0, Color.GREEN, this));
        barriers.add(new Barrier(7, 0, Color.GREEN, this));
        barriers.add(new Barrier(8, 0, Color.GREEN, this));
        barriers.add(new Barrier(0, 8, Color.GREEN, this));
        barriers.add(new Barrier(0, 9, Color.GREEN, this));
        barriers.add(new Barrier(0, 10, Color.GREEN, this));
        barriers.add(new Barrier(0, 11, Color.GREEN, this));
        barriers.add(new Barrier(0, 12, Color.GREEN, this));
        barriers.add(new Barrier(0, 13, Color.GREEN, this));
        barriers.add(new Barrier(0, 14, Color.GREEN, this));
        barriers.add(new Barrier(9, 0, Color.GREEN, this));
        barriers.add(new Barrier(10, 0, Color.GREEN, this));
        barriers.add(new Barrier(11, 0, Color.GREEN, this));
        barriers.add(new Barrier(12, 0, Color.GREEN, this));
        barriers.add(new Barrier(13, 0, Color.GREEN, this));
        barriers.add(new Barrier(14, 0, Color.GREEN, this));
        barriers.add(new Barrier(15, 0, Color.GREEN, this));
        barriers.add(new Barrier(16, 0, Color.GREEN, this));
        barriers.add(new Barrier(17, 0, Color.GREEN, this));
        barriers.add(new Barrier(18, 0, Color.GREEN, this));
        barriers.add(new Barrier(19, 0, Color.GREEN, this));
        barriers.add(new Barrier(20, 0, Color.GREEN, this));
        barriers.add(new Barrier(21, 0, Color.GREEN, this));
        barriers.add(new Barrier(22, 0, Color.GREEN, this));
        barriers.add(new Barrier(23, 0, Color.GREEN, this));
        barriers.add(new Barrier(24, 0, Color.GREEN, this));
        barriers.add(new Barrier(25, 0, Color.GREEN, this));
        barriers.add(new Barrier(26, 0, Color.GREEN, this));
        barriers.add(new Barrier(27, 0, Color.GREEN, this));
        barriers.add(new Barrier(28, 0, Color.GREEN, this));
        barriers.add(new Barrier(29, 0, Color.GREEN, this));
        barriers.add(new Barrier(0, 15, Color.GREEN, this));
        barriers.add(new Barrier(0, 16, Color.GREEN, this));
        barriers.add(new Barrier(0, 17, Color.GREEN, this));
        barriers.add(new Barrier(0, 18, Color.GREEN, this));
        barriers.add(new Barrier(0, 19, Color.GREEN, this));
        barriers.add(new Barrier(0, 20, Color.GREEN, this));
        barriers.add(new Barrier(0, 21, Color.GREEN, this));
        barriers.add(new Barrier(0, 22, Color.GREEN, this));
        barriers.add(new Barrier(0, 23, Color.GREEN, this));
        barriers.add(new Barrier(0, 24, Color.GREEN, this));
        barriers.add(new Barrier(1, 24, Color.GREEN, this));
        barriers.add(new Barrier(2, 24, Color.GREEN, this));
        barriers.add(new Barrier(3, 24, Color.GREEN, this));
        barriers.add(new Barrier(4, 24, Color.GREEN, this));
        barriers.add(new Barrier(5, 24, Color.GREEN, this));
        barriers.add(new Barrier(6, 24, Color.GREEN, this));
        barriers.add(new Barrier(7, 24, Color.GREEN, this));
        barriers.add(new Barrier(8, 24, Color.GREEN, this));
        barriers.add(new Barrier(9, 24, Color.GREEN, this));
        barriers.add(new Barrier(10, 24, Color.GREEN, this));
        barriers.add(new Barrier(11, 24, Color.GREEN, this));
        barriers.add(new Barrier(12, 24, Color.GREEN, this));
        barriers.add(new Barrier(13, 24, Color.GREEN, this));
        barriers.add(new Barrier(14, 24, Color.GREEN, this));
        barriers.add(new Barrier(15, 24, Color.GREEN, this));
        barriers.add(new Barrier(16, 24, Color.GREEN, this));
        barriers.add(new Barrier(17, 24, Color.GREEN, this));
        barriers.add(new Barrier(18, 24, Color.GREEN, this));
        barriers.add(new Barrier(19, 24, Color.GREEN, this));
        barriers.add(new Barrier(20, 24, Color.GREEN, this));
        barriers.add(new Barrier(21, 24, Color.GREEN, this));
        barriers.add(new Barrier(22, 24, Color.GREEN, this));
        barriers.add(new Barrier(23, 24, Color.GREEN, this));
        barriers.add(new Barrier(24, 24, Color.GREEN, this));
        barriers.add(new Barrier(25, 24, Color.GREEN, this));
        barriers.add(new Barrier(26, 24, Color.GREEN, this));
        barriers.add(new Barrier(27, 24, Color.GREEN, this));
        barriers.add(new Barrier(28, 24, Color.GREEN, this));
        barriers.add(new Barrier(29, 24, Color.GREEN, this));
        barriers.add(new Barrier(29, 1, Color.GREEN, this));
        barriers.add(new Barrier(29, 2, Color.GREEN, this));
        barriers.add(new Barrier(29, 3, Color.GREEN, this));
        barriers.add(new Barrier(29, 4, Color.GREEN, this));
        barriers.add(new Barrier(29, 5, Color.GREEN, this));
        barriers.add(new Barrier(29, 6, Color.GREEN, this));
        barriers.add(new Barrier(29, 7, Color.GREEN, this));
        barriers.add(new Barrier(29, 8, Color.GREEN, this));
        barriers.add(new Barrier(29, 9, Color.GREEN, this));
        barriers.add(new Barrier(29, 10, Color.GREEN, this));
        barriers.add(new Barrier(29, 11, Color.GREEN, this));
        barriers.add(new Barrier(29, 12, Color.GREEN, this));
        barriers.add(new Barrier(29, 13, Color.GREEN, this));
        barriers.add(new Barrier(29, 14, Color.GREEN, this));
        barriers.add(new Barrier(29, 15, Color.GREEN, this));
        barriers.add(new Barrier(29, 16, Color.GREEN, this));
        barriers.add(new Barrier(29, 17, Color.GREEN, this));
        barriers.add(new Barrier(29, 18, Color.GREEN, this));
        barriers.add(new Barrier(29, 19, Color.GREEN, this));
        barriers.add(new Barrier(29, 20, Color.GREEN, this));
        barriers.add(new Barrier(29, 21, Color.GREEN, this));
        barriers.add(new Barrier(29, 22, Color.GREEN, this));
        barriers.add(new Barrier(29, 23, Color.GREEN, this));
        barriers.add(new Barrier(29, 24, Color.GREEN, this));
    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {

        if (grid != null) {
            grid.paintComponent(graphics);
        }

        if (barriers != null) {
            for (Barrier barrier : barriers) {
                barrier.draw(graphics);
            }
        }
    }

}
