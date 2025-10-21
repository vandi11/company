/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import view.MainForm;

/**
 *
 * @author Diak
 */

public class FormController {
    
    private MainForm mainFrm;
    private DatabaseController dbCtrl;
    
    public FormController( DatabaseController dbCtrl) {
        
        
        this.dbCtrl = dbCtrl;
        initComponents();
        
        
    }
    
    private void initComponents(){
        mainFrm = new MainForm();
        mainFrm.getExitBtn().addActionListener (event -> exit() );
        mainFrm.setVisible(true);
        
        
    }
    private void exit() {
        System.exit(0);
    }
    
}
