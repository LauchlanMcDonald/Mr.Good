/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrgood;

import audio.AudioPlayer;
import environment.Environment;
import grid.Grid;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.List;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.AbstractList;
import java.util.ArrayList;

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
    private Screen screen;

    public GameSurface() {
        this.screen = screen.START;
        Health = 100;
        grid = new Grid(7, 7, 60, 60, new Point(50, 50), new Color(220, 220, 220));

        startscreen = ResourceTools.loadImageFromResource("mrgood/boulderuphill.jpg");

        Color translucentGrey = new Color(64, 64, 64, 150);

        barriers = new ArrayList<>();
        for (int column = 0; column < grid.getColumns(); column++) {
            barriers.add(new Barrier(column, 0, translucentGrey, this));
            barriers.add(new Barrier(column, grid.getRows() - 1, translucentGrey, this));
        }

        for (int row = 1; row < grid.getRows() - 1; row++) {
            barriers.add(new Barrier(0, row, translucentGrey, this));
            barriers.add(new Barrier(6, row, translucentGrey, this));
        }

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

        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            screen = Screen.PLAY;
        }
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
            for (Barrier b : barriers) {
                b.draw(graphics);
            }
        }

        switch (screen) {
            case START:
                graphics.setFont(new Font("ARIAL", Font.BOLD, 25));
                graphics.drawImage(startscreen, 0, 0, 900, 580, this);
                graphics.drawString("PRESS SPACE TO START", 475, 515);

                break;

            case PLAY:

                if (grid != null) {
                    grid.paintComponent(graphics);
                }

                if (barriers != null) {
                    for (int i = 0; i < barriers.size(); i++) {
                        barriers.get(i).draw(graphics);
                    }
                }

        }

    }

    @Override
    public int getCellWidth() {
        return grid.getCellWidth();
    }

    @Override
    public int getCellHeight() {
        return grid.getCellHeight();
    }

    @Override
    public int getSystemCoordX(int column, int row
    ) {
        return grid.getCellSystemCoordinate(column, row).x;
    }

    @Override
    public int getSystemCoordY(int column, int row
    ) {
        return grid.getCellSystemCoordinate(column, row).y;
    }

    @Override
    public Point validateMove(Point newHead
    ) {
        return null;
    }
}
