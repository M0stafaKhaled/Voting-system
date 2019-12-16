
package voting;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
     public static void main(String[] args) throws IOException {
         Scanner sc = new Scanner(System.in);
         String fristName,lastName , id , userName , password   , phoneNumber, city , party_symbol , Electoral_program ; 
         
         id ="27010200202071";
        fristName = "Omar";
        lastName = "khaled";
         password = "253332Mm4";
         userName = "khaled22";
         phoneNumber = "01500000006";
         city = "cairo";
         party_symbol = "pipe";
         Electoral_program  = "Senate instantly made him the highest-ranking African American officeholder in the country";
       
         // Start programe 
            int chooseUser =0 ;
        System.out.println("1-Admin \n2-Voter\nChoose:");
        if(sc.hasNextInt()) 
              chooseUser = sc.nextInt();
        else 
             System.err.println("please enter number");
        
        
            switch(chooseUser){
            
            case 1:
                
                
                break;
                
                case 2:
                    break;
            
            }
         
         
         
//             String filepath  = "voter.txt";
// 
//
//         Registeration re = new Registeration();
//      boolean m =   re.Isvalidate(name, id,userName,password,phoneNumber,city);
//                    re.SignUp(name, id, userName, password, phoneNumber, city, filepath, m);
//         
//           Vote vote = new Vote();
//           Map m = vote.showListOfVote();
//          
//        
//        
//          
//            
//                      
//                  
//              vote.addVote((HashMap<String, String>) m,"2201801239" ,"pipi");
//           
//           System.out.println(m.size());
//           
//           
//            m.keySet().stream().map((key) -> {
//               System.out.println("key : " + key);
//             return key;
//         }).forEachOrdered((key) -> {
//             System.out.println("value : " + m.get(key));
//         });

//Result result = new Result();
//         System.out.println(result.getResult());
//           
//    Admin admin = new Admin();
//            admin.candidateList();
//            admin.showCanditeName();
         //admin.addCandidte(name, id, userName, phoneNumber, city, party_symbol,Electoral_program);
         //admin.showCanditeName();
//          Result result = new Result();
//         result.ShowResult();
//         
         //System.out.println(  result.getResultofCandidte("Mostafa"));
    }
    
}
