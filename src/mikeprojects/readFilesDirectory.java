
package mikeprojects;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class readFilesDirectory {

    public static void main(String[] args)
    {
        int count=0;
        File folder = new File("/Volumes/mike_external_one/mike_web_albums/animalkingpark/images");

        String[] files = folder.list();

        for (String file : files)
        {
            System.out.println("picture.add("+"@"+file+"@"+");");
            count++;

        }

        System.out.println(count);
    }

}
