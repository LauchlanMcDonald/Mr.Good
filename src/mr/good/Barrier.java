/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mr.good;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Lauchlan
 */
class Barrier {

    public void draw(Graphics graphics) {
        graphics.setColor(this.color);
        graphics.fill3DRect(cellData.getSystemCoordX(column, row),
                            cellData.getSystemCoordY(column, row),
                            cellData.getCellWidth(),
                            cellData.getCellHeight(), true);
    }

//<editor-fold defaultstate="collapsed" desc="Constructors">
    public Barrier(int column, int row, Color color, CellDataProviderIntf cellData) {
        this.column = column;
        this.row = row;

        this.color = color;
        this.cellData = cellData;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Properties">
    private int column, row;
    private Color color;
    private CellDataProviderIntf cellData;

    /**
     * @return the point of the cell location
     */
    public Point getLocation() {
        return new Point(column, row);
    }

    /**
     * @return the column
     */
    public int getX() {
        return column;
    }

    /**
     * @param x the column to set
     */
    public void setX(int x) {
        this.column = x;
    }

    /**
     * @return the row
     */
    public int getY() {
        return row;
    }

    /**
     * @param y the row to set
     */
    public void setY(int y) {
        this.row = y;
    }

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
//</editor-fold>

}
