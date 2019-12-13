
package voting;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
     public static void main(String[] args) throws IOException {
         Scanner sc = new Scanner(System.in);
//         String name , id , userName , password   , phoneNumber, city;
//      id ="27010200202071";
//         name = "mostafa";
//         password = "253332Mm4";
//         userName = "mostafa";
//         phoneNumber = "01500000000";
//         city = "cairo";
//             String filepath  = "voter.txt";
// 
//
//         Registeration re = new Registeration();
//      boolean m =   re.Isvalidate(name, id,userName,password,phoneNumber,city);
//                    re.SignUp(name, id, userName, password, phoneNumber, city, filepath, m);
//         
           Vote vote = new Vote();
           Map m = vote.showListOfVote();
          
        
        
          
            
          
        
              vote.addVote((HashMap<String, String>) m,"2201801239" ,"pipi");
           
           System.out.println(m.size());
           
           
            m.keySet().stream().map((key) -> {
               System.out.println("key : " + key);
             return key;
         }).forEachOrdered((key) -> {
             System.out.println("value : " + m.get(key));
         });
           

    }
    
}
