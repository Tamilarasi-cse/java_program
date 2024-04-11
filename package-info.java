package tamil;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Fops 
  {
    public static void main(String atgs[]) throws FileNotFoundException 
        {
        try 
            {
                Scanner in = new Scanner(System.in);
            System.out.println("Enter file name:");
            String fname = in.nextLine();
            File file = new File(fname);
            System.out.println("File Created!");
            System.out.println("\nWriting data:\nEnter data:");
            FileWriter fw;
            fw = new FileWriter(file);
            String con; 
            do
{
                    con= in.nextLine();
                    fw.write(con+"\n");;
                }while(con!="");
            fw.close();
            System.out.println("\nReading data:...");
            Scanner f = new Scanner(file);
            while(f.hasNextLine())
              {
                System.out.println(f.nextLine());
              }
            f.close();
            System.out.println("\nDeleting the file...");
            file.delete();
            System.out.println("File Deleted!");    
         } 
         catch (IOException e)
          {
            e.printStackTrace();
          }
    }
}
