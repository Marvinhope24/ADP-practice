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
public class RunFiles {
    public static void main(String[] args)
    {
        
        ReadDelimFile myReadObj = new ReadDelimFile();
        myReadObj.openFiles();
        myReadObj.readAndWrite();
        myReadObj.closeFiles();
    }
    
}
