/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.exceptionproject;

/**
 *
 * @author LilMinx
 */
public class RunSerializedFileClass {
    public static void main(String[] args){
        //WriteSerializedFileClass obj = new WriteSerializedFileClass();
        //following is the methods
       // obj.populateArray();
       // obj.openFile();
       // obj.writeToFile();
       // obj.closeFile();
       
       ReadSerializedFileClass obj = new ReadSerializedFileClass();
       obj.openFile();
       obj.readFromFile();
       obj.closeFile(); 
    }
}
