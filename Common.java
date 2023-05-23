/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lap_th5;

import java.util.Scanner;
import static javax.swing.text.html.HTML.Tag.S;

/**
 *
 * @author ASUS
 */
public class Common {

    static Scanner sc = new Scanner(System.in);
    static int getInt(String s){
        System.out.print(s);
        int result = 0;
        try{
            result = sc.nextInt();
        } catch (NumberFormatException e){
            System.out.println("Invalid input: " + s);
        }
        
        return result;
    
}
    static double getDouble (String s) {
        System.out.print(s);
        double result = 0;
        try {
            result = sc.nextDouble();
        }catch (NumberFormatException e) {
            System.out.println("Invalid input: " + s);
    }
    return result;
}
    static String getString(String s){
        String result = "";
        System.out.print(s);
        try{
           result =sc.nextLine();
        } catch (NumberFormatException e){
           System.out.println("Invalid input: " + S);
}
         return result;
   
}
    static boolean getBoolean(String s){
        boolean result = false;
        try {
           result = sc.nextBoolean();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + S);
        }
        return result;
    }

}
    
