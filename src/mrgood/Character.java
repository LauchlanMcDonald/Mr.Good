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
public class Character {
    
//    private final Image 
    
    public Character(int column, int row, CellDataProviderIntf cellData, Image image){
        this.column = column;
        this.row = row;
        this.cellData = cellData;
        this.image = image;
    }
    
    public void draw(Graphics graphics){
///        graphics.drawImage(caveman_stand_left.png, 1, 1, null);
        graphics.drawImage(getImage(), 1, 1, null);
    }
    
    
//<editor-fold defaultstate="collapsed" desc="Properties">
    private int column, row;
    private CellDataProviderIntf cellData;
    private Image image;
    
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
     * @return the image
     */
    public Image getImage() {
        return image;
    }
//</editor-fold>
    
}
