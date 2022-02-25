/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.EnterpriseResourcePlanning.controller;

import ec.edu.espe.EnterpriseResourcePlanning.view.FrmLogIn;
import javax.swing.JFrame;

/**
 *
 * @author david
 */
public class FormsHandler {
    public static void goToMainScreen(JFrame jFrameToClose){
        FrmLogIn frmLogIn = new FrmLogIn();
        jFrameToClose.setVisible(false);
        frmLogIn.setVisible(true);
}
}