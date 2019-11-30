/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voting;

import java.util.Scanner;


public class Main {
    
    
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
//         String name , id , userName , password   , phoneNumber, city;
//         id ="27010200202071";
//         name = "mostafa";
//         password = "253332Mm4";
//         userName = "mostafa";
//         phoneNumber = "01000000000";
//         city = "cairo";
             String filepath  = "out.txt";
//         
//                 
//         Registeration re = new Registeration();
//      boolean m =   re.Isvalidate(name, id,userName,password,phoneNumber,city);
//                    re.SignUp(name, id, userName, password, phoneNumber, city, filepath, m);
//     
//       
           
             Registeration re = new Registeration();
             re.login("mostafa","253332Mm4" , filepath);
         
            
           




    }
    
}
