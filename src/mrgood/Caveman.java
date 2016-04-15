/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrgood;

import images.ResourceTools;
import java.awt.Image;

/**
 *
 * @author Lauchlan
 */
public class Caveman extends Character {

    public Caveman(int column, int row, CellDataProviderIntf cellData) {
        super(column, row, cellData);
        setImage(ResourceTools.loadImageFromResource("mrgood/caveman_stand_right.png"));
    }
    
}
