/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mr.good;

import environment.Environment;
import grid.Grid;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javafx.stage.Screen;
import static javax.sound.midi.ShortMessage.START;
import static mr.good.OopsScreen.PLAY;

/**
 *
 * @author samuelmartinezdelcampo
 */
public class GameSurface extends Environment implements CellDataProviderIntf, MoveValidatorIntf {

    Image startscreen;
    Image gameover;

    private Grid grid;
    private Character MrGood;
    private ArrayList<Barrier> barriers;
//    private ArrayList<Item> items;
    private int score;
    private int Health;
//    private final Screen screen = Screen.START;

    public GameSurface() {
        Health = 100;
        grid = new Grid(7, 7, 60, 60, new Point(50, 50), new Color(220, 220, 220));
//        barrier = new Barrier(0, 0, Color.BLACK, this);
        
        
        Color translucentGrey = new Color(64, 64, 64, 100);
        
        barriers = new ArrayList<>();
        for (int column = 0; column < grid.getColumns(); column++) {
            barriers.add(new Barrier(column, 0, translucentGrey, this));
            barriers.add(new Barrier(column, grid.getRows()-1, translucentGrey, this));
        }

        for (int row = 1; row < grid.getRows()-1; row++) {
            barriers.add(new Barrier(0, row, translucentGrey, this));
            barriers.add(new Barrier(6, row, translucentGrey, this));
        }


//        startscreen = ResourceTools.loadImageFromResource("MrGoodStartscreen.jpg");

    }

    private int getRandomNumber(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }

    public Point getRandomGridPoint() {
        return new Point(1 + (int) (Math.random() * (grid.getColumns() - 2)), 1 + (int) (Math.random() * (grid.getRows() - 2)));
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
            for (Barrier b : barriers){
                b.draw(graphics);
            }
        }
        
    }

//<editor-fold defaultstate="collapsed" desc="CellDataProviderIntf">
    @Override
    public int getCellWidth() {
        return grid.getCellWidth();
    }
    
    @Override
    public int getCellHeight() {
        return grid.getCellHeight();
    }
    
    @Override
    public int getSystemCoordX(int column, int row) {
        return grid.getCellSystemCoordinate(column, row).x;
    }
    
    @Override
    public int getSystemCoordY(int column, int row) {
        return grid.getCellSystemCoordinate(column, row).y;
    }
//</editor-fold>

    @Override
    public Point validateMove(Point newHead) {
        return null;
    }

}
