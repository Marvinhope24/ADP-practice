/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.exceptionproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author LilMinx
 */
public class ReadSerializedFileClass {
    private ObjectInputStream input;
    Account account;
    Account [] accountArray = new Account[5];
    
    public void openFile(){
        try{
            input = new ObjectInputStream(new FileInputStream("clients.ser"));
            System.out.println("*** ser file opened for reaading ***");
        }
        catch(IOException ioe){
            System.out.println("error opening ser file: " + ioe.getMessage());
        }
    }
    public void closeFile(){
        try{
            input.close();
        }
        catch(IOException ioe){
            System.out.println("error closing ser file: " + ioe.getMessage());
        }
    }
    
    public void readFromFile(){
        try{
            for(int i =0; i<accountArray.length; i++){//loop through array check end 
                accountArray[i] = (Account) input.readObject();//will read object and assign to  empty array and loop for length of array
                System.out.println(accountArray[i]);// call the toStrinf method here
            }//end for                       
           }//end try
        catch(ClassNotFoundException ioe){
            System.out.println("Class error reading ser file: " + ioe);
        }
        catch(IOException ioe){
            System.out.println("error reading from ser file: " + ioe);
        }
        finally{
            closeFile();
            System.out.println("*** file has been closed ***");
        }
        }
    }
    
    

