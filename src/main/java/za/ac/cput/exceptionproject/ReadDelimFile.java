/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.exceptionproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author LilMinx
 */
public class ReadDelimFile {
    private String prodTypeStr, catNum, purchPrice, sellPrice, quantitySold;
    private String description;
    private int prodType;
    private FileReader fr;
    private BufferedReader br;
    private BufferedWriter bw;
    private FileWriter fw;
    
    public void openFiles()
    {
        try
        {
            fr = new FileReader("SalesDelim.txt");
            br = new BufferedReader(fr);
        }
        
        catch(IOException fnfe)
       {
           System.out.println("File not found...");
           System.out.println(fnfe);
           System.exit(1);
       }
    }  
    
    public void readAndWrite()
    {
        String ks, nm, str;
        StringTokenizer token;
        
        try
        {
            ks = br.readLine();
            
          while(ks!=null)// loop to see whether reach end of file
        {
                token = new StringTokenizer(ks,"#");//ks parameter used to split strin and # use seperate different fields
                prodTypeStr  = token.nextToken();
                catNum       = token.nextToken();
                description  = token.nextToken();
                purchPrice   = token.nextToken();
                sellPrice    = token.nextToken();
                quantitySold = token.nextToken();
                System.out.printf("%s %s\n", description, quantitySold);
                     ks = br.readLine();
        }//end while
        }//end try
        
        catch(IOException ioe)
        {
            System.out.println(ioe);
        }
    } //end method   

    public void closeFiles()
    {
        try
        {
            br.close();
        }
        catch(IOException ioe)
        {
            System.out.println(ioe);
        }
    }//end close method        
}

