/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import view.MainForm;

/**
 *
 * @author Diak
 */

public class FormController {
    
    private MainForm mainFrm;
    private DatabaseController dbCtrl;
    private Vector<String> columnNames;
    
    public FormController( DatabaseController dbCtrl) {
        
        
        this.dbCtrl = dbCtrl;
        initComponents();
        setWorkerTable();
        
    }
    
    private void initComponents(){
        
       columnNames = new Vector<>();
        
        columnNames.add("Név");
        columnNames.add("Fizetés");
        columnNames.add("Születés");
        columnNames.add("Belépés");
        columnNames.add("Cím");
        columnNames.add("Város");
        columnNames.add("Szerep");
        
        mainFrm = new MainForm();
        mainFrm.getExitBtn().addActionListener (event -> exit() );
        mainFrm.getUpdateBtn().addActionListener (event -> update() );
        mainFrm.getSaveBtn().addActionListener (event -> save() );
        mainFrm.setVisible(true);
        
        
    }
    
    private void setWorkerTable() {
        
        Vector<Vector<Object>> workerData = new Vector<>();
        workerData = dbCtrl.getWorkerData();
        
        DefaultTableModel model = new DefaultTableModel( workerData, columnNames);
        mainFrm.getWorkerTbl().setModel(model);
        
        
    }
    
    private void update() {
        
    }
    
    private void save() {
        
        
    }
    private void exit() {
        System.exit(0);
    }
    
}
