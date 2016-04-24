/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.Mahasiswa;
import View.HapusDokumenTubesMhs;
import View.LoginAsisten;
import View.LoginMahasiswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Penguin
 */
public class ControllerHapusDokumenTubesMhs implements ActionListener {
    Aplikasi model;
    Mahasiswa m;
    HapusDokumenTubesMhs view;
    LoginMahasiswa view2;
    

    public ControllerHapusDokumenTubesMhs(Aplikasi model) {
        this.model = model;
        view = new HapusDokumenTubesMhs();
        view.setVisible(true);
        view.getBtnMainMenu().addActionListener(this);
        view.getBtnSimpan().addActionListener(this);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if(o.equals(view.getBtnSimpan())) {
            String a = view.getComboDokumen().toString();
            model.getMahasiswa(view2.getBoxNIMMhs().getText());
            new ControllerMenuTubesMhs(model);
            view.dispose();
        } else if(o.equals(view.getBtnMainMenu())) {
            new ControllerHome(model);
            view.dispose();
        }
    }
    
}
