/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.MenuMahasiswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author acer
 */
public class ControllerMenuMahasiswa implements ActionListener {

    MenuMahasiswa view;
    Aplikasi model;

    public ControllerMenuMahasiswa(Aplikasi model) {
        this.model = model;
        view = new MenuMahasiswa();
        view.setVisible(true);
        view.getBtnCariMhs().addActionListener(this);
        view.getBtnMainMenu1().addActionListener(this);
        view.getBtnHapusMhs().addActionListener(this);
        view.getBtnaddMhs().addActionListener(this);
       

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object a = ae.getSource();
        if (a.equals(view.getBtnCariMhs())) {
            new ControllerLoginMhs(model);
            view.dispose();
        } else if (a.equals(view.getBtnMainMenu1())) {
            new ControllerHome(model);
            view.dispose();
        } else if (a.equals(view.getBtnHapusMhs())) {
            new ControllerHapusMahasiswa(model);
            view.dispose();
        } else if (a.equals(view.getBtnaddMhs())) {
            new ControllerInputDataMahasiswa(model);
            view.dispose();
        } 
    }
}
