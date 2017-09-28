/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Naython
 */
public class StartUp {
    Reader r = new KeyboardReader();
    Writer w = new GuiWriter();
    InputOutputService ios = new InputOutputService( r, w );
    ios.inAndOut();
}
