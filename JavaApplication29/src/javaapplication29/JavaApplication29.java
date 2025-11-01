package javaapplication29;
import java.io.FileReader;
import java.io.IOException;

public class JavaApplication29 
{
    public static void main(String[] args) 
    {
        try
        {
            FileReader rd = new FileReader("C:\\Users\\Arcade Player\\Desktop\\NewFile.txt");
            int g = rd.read();
            
            while((g = rd.read()) != -1)
             System.out.println((char) g);
        }
        catch(IOException gg)
        {
            System.out.println("File could not be openned...");
        }
    }
    
}

