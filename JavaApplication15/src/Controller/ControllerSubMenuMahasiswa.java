
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
 * @author acer
 */
class ControllerSubMenuMahasiswa implements ActionListener {

    private MenuTugasBesarMhs view;
    Aplikasi model;

    public ControllerSubMenuMahasiswa(Aplikasi model) {
        view = new MenuTugasBesarMhs();
        view.setVisible(true);
        this.model = model;
        view.getBtnHalamanUtama().addActionListener(this);
        view.getBtnTambahDokumentasiKeTugasBesar().addActionListener(this);
        view.getBtnHapusDokumentasiTugasBesar().addActionListener(this);
        view.getBtnTambahKeTugasBesar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(view.getBtnHalamanUtama())) {
            new ControllerHome(model);
            view.dispose();
        } else if (o.equals(view.getBtnTambahKeTugasBesar())) {
            
            new ControllerInputDokumentasi(model);
            view.dispose();
        } else if (o.equals(view.getBtnTambahDokumentasiKeTugasBesar())) {
            new ControllerInputDokumentasi(model);
            view.dispose();

        }
    }
}
