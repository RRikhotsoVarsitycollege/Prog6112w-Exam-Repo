package javaapplication31;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class JavaApplication31 
{
    public static void main(String[] args) 
    {
        try
        {
            FileWriter FW = new FileWriter("C:\\users\\Arcade Player\\Desktop\\NewFile.txt");
            BufferedWriter BW = new BufferedWriter(FW);
            BW.append("this is the text that we are appending into our file");
        }
        catch(IOException j)
        {
            System.out.println("Something went wrong");
        }  
    }    
}
