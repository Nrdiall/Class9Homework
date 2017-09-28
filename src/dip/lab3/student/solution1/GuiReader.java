/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;
import javax.swing.JOptionPane;
/**
 *
 * @author Naython
 */
public class GuiReader implements Reader{
    @Override
    public String readMessage() {
        String response =  JOptionPane.showInputDialog(null, "Enter message: ");
        return response;
    }
    
}
