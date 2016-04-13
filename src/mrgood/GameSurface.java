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
        grid = new Grid(8, 8, 60, 60, new Point(200, 40), new Color(220, 220, 220));

        startscreen = ResourceTools.loadImageFromResource("mrgood/boulderuphill.jpg");

        Color translucentGrey = new Color(64, 64, 64, 150);

        barriers = new ArrayList<>();
        for (int column = 0; column < grid.getColumns(); column++) {
            barriers.add(new Barrier(column, 0, translucentGrey, this));
            barriers.add(new Barrier(column, grid.getRows() - 1, translucentGrey, this));
        }

        for (int row = 1; row < grid.getRows() - 1; row++) {
            barriers.add(new Barrier(0, row, translucentGrey, this));
            barriers.add(new Barrier(7, row, translucentGrey, this));
        }

        MrGood = new Caveman(3, 3, this);

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
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            MrGood.move(Direction.LEFT);
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            MrGood.move(Direction.RIGHT);
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            MrGood.move(Direction.DOWN);
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            MrGood.move(Direction.UP);
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

        switch (screen) {
            case START:
                graphics.setFont(new Font("ARIAL", Font.BOLD, 25));
                graphics.drawImage(startscreen, 0, 0, 900, 580, this);
                graphics.setColor(Color.GRAY);
                graphics.drawString("PRESS SPACE TO START", 475, 515);

                graphics.setFont(new Font("ARIAL", Font.BOLD, 80));
                graphics.setColor(Color.WHITE);
                graphics.drawString("Mr.Good", 35, 115);

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

                if (MrGood != null) {
                    MrGood.draw(graphics);
                }

                break;

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
