/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.MenuTugasBesarAsisten;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Penguin
 */
public class ControllerTubesAsisten implements ActionListener{
    private MenuTugasBesarAsisten view;
    private Aplikasi model;

    public ControllerTubesAsisten(Aplikasi model) {
        this.model = model;
        view = new MenuTugasBesarAsisten();
        view.setVisible(true);
        view.getBtnHalamanUtama().addActionListener(this);
        view.getBtnHapusTubes().addActionListener(this);
        view.getBtnLihatTubes().addActionListener(this);
        view.getBtnTambahTubes().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       Object o = e.getSource();
       if (o.equals(view.getBtnHalamanUtama())){
           new ControllerHome(model);
           view.dispose();
       }else if (o.equals(view.getBtnHapusTubes())){
           
       }
    }
    
}
