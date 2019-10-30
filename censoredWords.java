/*A program to censor some bad words. For example, the words fuck, shit, bitch optionally censored.

*@author Serkan Yılmaz

*/

import java.io.*;
import java.util.Scanner;

public class censoredWords {
    public static void main(String[] args){
        //If you add/delete some bad words add/delete scanner.
        System.out.println("Fuck: ");
        Scanner input1 = new Scanner(System.in);
        String input11 = input1.nextLine();

        System.out.println("Shit: ");
        Scanner input2 = new Scanner(System.in);
        String input22 = input1.nextLine();

        System.out.println("Bitch: ");
        Scanner input3 = new Scanner(System.in);
        String input33 = input1.nextLine();

        {
        try{
            File file = new File("C:\\Users\\Serkan\\Desktop\\deneme.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = "", oldtext = "";
            while((line = reader.readLine()) != null)
            {
                oldtext += line + "\r\n";
            }

            reader.close();

            //Add or delete some bad words
            String replacedText = oldtext.replaceAll("fuck", "" + input11);
            replacedText = replacedText.replaceAll("shit","" + input22);
            replacedText = replacedText.replaceAll("bitch","" + input33);

            FileWriter writer = new FileWriter("C:\\Users\\Serkan\\Desktop\\deneme.txt");
            writer.write(replacedText);
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
}
