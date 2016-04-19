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
    
    public Projectile(int column, int row, int speed, CellDataProviderIntf cellData) {

        this.column = column;
        this.row = row;
        this.speed = speed;

        this.cellData = cellData;
    }

    public void draw(Graphics graphics){
        graphics.setColor(Color.RED);
        
        
        if (row == IGNORE_COL_OR_ROW) {
            graphics.fillOval(cellData.getSystemCoordX(column, 0), 
                              cellData.getSystemCoordY(column, 0), 
                              cellData.getCellWidth(), 
                              cellData.getCellHeight());
        } else if (column == IGNORE_COL_OR_ROW) {
            graphics.fillOval(cellData.getSystemCoordX(0, row), 
                              cellData.getSystemCoordY(0, row), 
                              cellData.getCellWidth(), 
                              cellData.getCellHeight());
        }

    }
    
    
    //<editor-fold defaultstate="collapsed" desc="Properties">
    private int column, row, speed;
    private Color color;
    private Image image;
    
    private CellDataProviderIntf cellData;
    

    /**
     * @return the column
     */
    public int getColumn() {
        return column;
    }

    /**
     * @param column the column to set
     */
    public void setColumn(int column) {
        this.column = column;
    }

    /**
     * @return the row
     */
    public int getRow() {
        return row;
    }

    /**
     * @param row the row to set
     */
    public void setRow(int row) {
        this.row = row;
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
//</editor-fold>

    void move() {
        if (row == IGNORE_COL_OR_ROW) {
            
            
            
        } else {
            //will move horizontally
        }
    }

}
