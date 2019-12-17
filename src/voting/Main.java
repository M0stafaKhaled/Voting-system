package voting;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
      
        
       
       
       
        //System.out.println(r.getResultofCandidte("Amr"));
       //r.ShowResult();
        String fristName, lastName, id, userName, password, phoneNumber, city, party_symbol, Electoral_program;
        
//          VoteDate vd = new VoteDate();
//      
//         vd.remnderTime();
//         
        // Start programe 
//         VotingForm votingForm =   new VotingForm(); 
//         votingForm.showCandidatesInfo();
        int chooseUser = 0;
        System.out.println("1-Admin \n2-Voter\nChoose:");
        if (sc.hasNextInt()) {
            chooseUser = sc.nextInt();
        } else {
            System.err.println("please enter number");
        }

        switch (chooseUser) {

            case 1: 
                       // if he is admin    
                    AdminInterface adminInterface = new AdminInterface();
                    adminInterface.adminSystemUI();
                

                break;

            case 2:
                int chooseOfVoter = 0  ;
                System.out.println("-----------------------------------");
                
                System.out.println("1-create new account \n2-login \nChoose:");
                
                chooseOfVoter = sc.nextInt();
                
                 System.out.println("-----------------------------------");
               
                switch(chooseOfVoter)
                {
                
                case 1:
                                
                                System.out.println("Enter FristName : ");
                                fristName = sc.next();
                                System.out.println("Enter LastName : ");
                                lastName = sc.next();
                                System.out.println("Enter ID :");
                                id = sc.next();
                                 System.out.println("Enter Password : ");
                                password = sc.next(); 
                                System.out.println("Enter UserName : ");
                                userName = sc.next();
                                System.out.println("Enter PhoneNumber :");
                                phoneNumber = sc.next();
                                System.out.println("Enter City : ");
                                city = sc.next();
                                
                               Registeration re = new Registeration(fristName, lastName, id, userName, password, phoneNumber, city);
                               boolean success = re.Isvalidate(fristName, lastName, id, userName, password, phoneNumber, city);
                               
                             if(success){
                             
                                re.SignUp(fristName, lastName, id, userName, password, phoneNumber, city, "Voter.txt", success);
                                 System.out.println("done");
                             }
                                break;
                            
                    
                case 2 :
                String filepath = "Voter.txt"  ; 
                boolean isLoginsuccess ;
                int option ;
                System.out.println("Enter your UserName or ID :");
                userName = sc.next();
                System.out.println("Enter your Password :");
                password = sc.next();
                Registeration registeration = new Registeration();
               registeration.login(userName, password, filepath);
               isLoginsuccess = registeration.isIsLogin();
               if(isLoginsuccess){
                    
                   
                   System.out.println("1-Add vote\n 2-Delete Vote");
                   option = sc.nextInt();
                   switch(option){
                   
                   case 1:
                       int getNumberOfcandidate ;
                       String candidteName;
                       VotingForm v = new VotingForm();
                       v.showCandidatesInfo();
                       getNumberOfcandidate = sc.nextInt();
                       
                        candidteName =  v.getCandidateName(getNumberOfcandidate);
                        if(!(candidteName == null)){
                        
                        
                        
                        }
                       break;
                       
                       case 2:
                           
                           break;
                   
                   }
               
               }
                    
                }
                    
                    
                    
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
