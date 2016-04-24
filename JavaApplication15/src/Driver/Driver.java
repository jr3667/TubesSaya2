/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Driver;

import Controller.ControllerHome;
import Model.Aplikasi;


/**
 *
 * @author HP1000
 */
public class Driver {
    public static void main(String[] args) {
        Aplikasi model = new Aplikasi();
        Controller.ControllerHome view3 = new Controller.ControllerHome(model);
        
    }
}
