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
public class InputOutputService {
    private Reader reader;
    private Writer writer;
    public InputOutputService( Reader reader, Writer writer ) {
		this.reader = reader;
		this.writer = writer;
    }
    public void inAndOut() {
            String line = reader.readMessage();
            writer.writeMessage( line );
    }
}
