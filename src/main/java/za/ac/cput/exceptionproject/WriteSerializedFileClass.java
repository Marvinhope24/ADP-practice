/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.exceptionproject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author LilMinx
 */
public class WriteSerializedFileClass {
    private ObjectOutputStream output;
    Account[] accountArray = new Account[5];
    
    public void populateArray(){
        accountArray[0] = new Account("Sipho", "Cheque", 1234.55);
        accountArray[1] = new Account("Freddy", "Savings", 3463.23);
        accountArray[2] = new Account("Mary", "Transmission", 5650.89);
        accountArray[3] = new Account("Nicky", "Cheque", 1234.55);
        accountArray[4] = new Account("Linda", "Savings", 1161.29);
    }
    
    public void openFile(){
        try{
            output = new ObjectOutputStream(new FileOutputStream("clients.ser"));
            System.out.println("*** ser file created and opened for writing ***");
        }
        catch(IOException ioe){
            System.out.println("error opening ser file: " + ioe.getMessage());
        }
    }
    
    public void closeFile(){
        try{
            output.close();
        }
        catch(IOException ioe){
            System.out.println("error closing ser file " + ioe.getMessage());
        }
    }
    
    // this is basically the process
    public void writeToFile(){
        try{
            for (int i = 0; i<accountArray.length; i++){// loop through array
                output.writeObject(accountArray[i]);// caling the object you would like to write to the file
                System.out.printf("object %d written to ser file: \n",i);
            }//end for
        }
        catch(IOException ioe){
            System.out.println("error writing to ser file: " + ioe);
        }
        finally{
            closeFile();
            System.out.println("*** File has been closed ***");
        }
    }
}
