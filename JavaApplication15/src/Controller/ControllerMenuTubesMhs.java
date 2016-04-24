/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.MenuTugasBesarMhs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Penguin
 */
public class ControllerMenuTubesMhs implements ActionListener {

    Aplikasi model;
    MenuTugasBesarMhs view;

    public ControllerMenuTubesMhs(Aplikasi model) {
        this.model = model;
        view = new MenuTugasBesarMhs();
        view.setVisible(true);
        view.getBtnHalamanUtama().addActionListener(this);
        view.getBtnHapusDokumentasiTugasBesar().addActionListener(this);
        view.getBtnTambahDokumentasiKeTugasBesar().addActionListener(this);
        view.getBtnTambahKeTugasBesar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(view.getBtnHalamanUtama())) {
            new ControllerHome(model);
            view.dispose();
        } else if (o.equals(view.getBtnHapusDokumentasiTugasBesar())) {
            new ControllerHapusDokumenTubesMhs(model);
            view.dispose();
        } else if (o.equals(view.getBtnTambahDokumentasiKeTugasBesar())) {
            new ControllerInputDokumentasi(model);
            view.dispose();
        }else if (o.equals(view.getBtnTambahKeTugasBesar())){
            new ControllerMenuTubesMhs(model);
            view.dispose();
        }
    }

}
