/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrgood;

import grid.Grid;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Lauchlan
 */
class Projectile {

    public static final int IGNORE_COL_OR_ROW = -1;

    public static final int SPEED_SLOWEST = 1;
    public static final int SPEED_SLOW = 2;
    public static final int SPEED_MEDIUM = 3;
    public static final int SPEED_FAST = 4;
    public static final int SPEED_FASTEST = 5;
    public static final int SPEED_INSANE = 7;

    public Projectile(int column, int row, int speed, CellDataProviderIntf cellData, Direction direction, Image image) {
        //figure out initial position (x, y) from column and row
        this.x = cellData.getSystemCoordX(column, row);
        this.y = cellData.getSystemCoordY(column, row);

        this.speed = speed;
        this.direction = direction;

        this.cellData = cellData;

        this.image = image;
    }

    public void draw(Graphics graphics) {
        graphics.drawImage(getImage(), cellData.getSystemCoordX(x, y),
                cellData.getSystemCoordY(x, y),
                cellData.getCellWidth(),
                cellData.getCellHeight(), null);
    }

    //<editor-fold defaultstate="collapsed" desc="Properties">
//    private int column, row, speed;
    private int y;
    private int x;
    private Direction direction;

    private int speed;
    private Color color;
    private Image image;

    private CellDataProviderIntf cellData;

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the image
     */
    public Image getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * @return the cellData
     */
    public CellDataProviderIntf getCellData() {
        return cellData;
    }

    /**
     * @param cellData the cellData to set
     */
    public void setCellData(CellDataProviderIntf cellData) {
        this.cellData = cellData;
    }

    /**
     * @return the direction
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }
//</editor-fold>

    public void move() {
        switch (direction) {
            case LEFT:
                x -= speed;
                break;

            case RIGHT:
                x += speed;
                break;

            case DOWN:
                y += speed;
                break;

            case UP:
                y -= speed;
                break;
        }
    }
}
