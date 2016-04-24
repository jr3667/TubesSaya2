/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.TambahTubesAsisten;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Penguin
 */
public class ControllerTambahTubesAsisten implements ActionListener {
    Aplikasi model;
    TambahTubesAsisten view;

    public ControllerTambahTubesAsisten(Aplikasi model) {
        this.model = model;
        view = new TambahTubesAsisten();
        view.setVisible(true);
        view.getBtnMainMenu1().addActionListener(this);
        view.getBtnTambahTubes().addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(view.getBtnMainMenu1())){
            new ControllerHome(model);
            view.dispose();
        } else if (o.equals(view.getBtnTambahTubes())){
            new ControllerTambahTubesAsisten(model);
            view.dispose();
        }
    }
    
    
}
