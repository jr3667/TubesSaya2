/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.LihatDokumentasiAsisten;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author acer
 */
public class ControllerViewDokumentasi implements ActionListener {

    Aplikasi model;
    LihatDokumentasiAsisten view;

    public ControllerViewDokumentasi(Aplikasi model) {
        this.model = model;
        view = new LihatDokumentasiAsisten();
        view.setVisible(true);

        view.getBtnMainMenu().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(view.getBtnMainMenu())) {
            new ControllerHome(model);
            view.dispose();
        }
    }

}
