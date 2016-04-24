/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.HapusDokumenTubesMhs;
import View.MenuHapusMahasiswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author acer
 */
public class ControllerHapusMahasiswa implements ActionListener {

    private Aplikasi model;
    MenuHapusMahasiswa view;

    public ControllerHapusMahasiswa(Aplikasi model) {
        this.model = model;
        view = new MenuHapusMahasiswa();
        view.setVisible(true);
        view.getBtnHapusMahasiswa().addActionListener(this);
        view.getBtnMainMenu1().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if(o.equals(view.getBtnHapusMahasiswa())) {
            new ControllerMenuMahasiswa(model);
            view.dispose();
        }
        else if(o.equals(view.getBtnMainMenu1())) {
            new ControllerHome(model);
            view.dispose();
        }
    }

}
