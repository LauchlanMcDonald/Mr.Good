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
import static javax.sound.midi.ShortMessage.START;

/**
 *
 * @author samuelmartinezdelcampo
 */
public class GameSurface extends Environment implements CellDataProviderIntf, MoveValidatorIntf {

    private Grid grid;
    private ArrayList<Barrier> barriers;
   
    Image startscreen;
    private int screen;

    public GameSurface() {

        grid = new Grid(30, 25, 20, 20, new Point(0, 0), new Color(220, 220, 220));
        
        startscreen = ResourceTools.loadImageFromResource("Mr.Good/MrGoodStartscreen.jpg");
        
        
        
        
        
        
//<editor-fold defaultstate="collapsed" desc="Barriers">//<editor-fold defaultstate="collapsed" desc="Barriers">
        

//</editor-fold>
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

        if (getGrid() != null) {
            getGrid().paintComponent(graphics);
        }

        if (getBarriers() != null) {
            for (Barrier barrier : getBarriers()) {
                barrier.draw(graphics);
            }
        }
        
    
        switch (screen) {
            case START:
                graphics.setFont(new Font("ARIAL", Font.BOLD, 40));
                graphics.drawImage(startscreen, 0, 0, 900, 580, this);
                graphics.drawString("PRESS SPACE TO START", 215, 550);

                break;
    }

    /**
     * @return the grid
     */
    public Grid getGrid() {
        return grid;
    }

    /**
     * @param grid the grid to set
     */
    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    /**
     * @return the barriers
     */
    public ArrayList<Barrier> getBarriers() {
        return barriers;
    }

    /**
     * @param barriers the barriers to set
     */
    public void setBarriers(ArrayList<Barrier> barriers) {
        this.barriers = barriers;
    }

//<editor-fold defaultstate="collapsed" desc="CellDataProviderIntf">
    @Override
    public int getCellWidth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int getCellHeight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int getSystemCoordX(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int getSystemCoordY(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//</editor-fold>

}
