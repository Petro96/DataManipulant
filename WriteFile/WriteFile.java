
package WriteFile;

import java.io.*;
import java.util.Scanner;



public class WriteFile{

    private String fileName;
    private int sizeOfData;
    int count = 0;
    Scanner sc = new Scanner(System.in);

    protected String inputString;

    public WriteFile(String fileName,int sizeOfData){
        
        this.fileName = fileName;
        this.sizeOfData = sizeOfData;

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Data.txt"));
            while (count < sizeOfData){
                inputString=sc.nextLine()+"\n";
                writer.write(inputString);
                count++;
            }
            writer.close();


        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }


    }


}