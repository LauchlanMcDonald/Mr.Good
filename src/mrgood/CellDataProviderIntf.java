/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrgood;

/**
 *
 * @author Lauchlan
 */
public interface CellDataProviderIntf {
    
    public int getCellWidth();
    public int getCellHeight();
    
    public int getSystemCoordX(int column, int row);
    public int getSystemCoordY(int column, int row);
    
    public int getMinRow();
    public int getMaxRow();
    
    public int getMinColumn();
    public int getMaxColumn();
    
        
}
