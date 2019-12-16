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
        Result r = new Result();
        
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

            case 1: // if he is admin 
                String AdminUserName,
                 AdminPassword;
                boolean loginSuccess;
                int chooseOfCandidte = 0;
                int status = 1;
                System.out.println("Enter your UserName :");
                AdminUserName = sc.next();
                System.out.println("Enter your Password :");
                AdminPassword = sc.next();
                Admin admin = new Admin();
                loginSuccess = admin.AdminIsLogIn(AdminUserName, AdminPassword);
                //to cheack he login sucess 
                if (loginSuccess) {
                    do {
                        System.out.println("-------------------------------------");

                        System.out.println("1- Set Voting time"
                                + "\n2-show Candidtes Name "
                                + "\n3-Add Candite"
                                + "\n4-Show Result"
                        );
                        System.out.println("-------------------------------------");
                        System.out.println("choose the number of  method you want");
                        if (sc.hasNextInt()) {
                            chooseOfCandidte = sc.nextInt();
                        }

                        switch (chooseOfCandidte) {

                            case 1:
                                String startDate,
                                 endDate;
                                System.out.println("Enter Start Date of voting");
                                startDate = sc.next();
                                endDate = sc.next();

                                break;
                            case 2:
                                Admin.showCanditeName();
                                break;

                            case 3:
                                System.out.println("Enter FristName : ");
                                fristName = sc.next();
                                System.out.println("Enter LastName : ");
                                lastName = sc.next();
                                System.out.println("Enter ID :");
                                id = sc.next();
                                System.out.println("Enter UserName : ");
                                userName = sc.next();
                                System.out.println("Enter PhoneNumber :");
                                phoneNumber = sc.next();
                                System.out.println("Enter City : ");
                                city = sc.next();
                                System.out.println("Enter Party Symbol : ");
                                party_symbol = sc.next();
                                System.out.println("Enter Electoral Program : ");
                                Electoral_program = sc.next();
                                admin.addCandidte(fristName, lastName, id, userName, phoneNumber, city, party_symbol, Electoral_program);
                                break;
                            case 4:
                               
                                Admin  a= new Admin(r);
                                a.showResult();
                                
                                break;

                            default:
                                System.out.println("-----------------------");
                                System.out.println("Try Again! ");
                                System.out.println("-----------------------");
                        }

                        System.out.println("1-Back to main list"
                                + "\n2-Exit");
                        System.out.println("-------------------------");

                        status = sc.nextInt();
                    } while (status == 1);
                    System.out.println("Thank You for using our Pharmacy System \nGood Luck!");
                    System.exit(status);
                }

                break;

            case 2:
                int chooseOfVoter = 0  ;
                System.out.println("-----------------------------------");
                
                System.out.println("1-create new account \n2-login \nChoose:");
                
                chooseOfCandidte = sc.nextInt();
                
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
                                id = sc.next();
                                System.out.println("Enter UserName : ");
                                userName = sc.next();
                                System.out.println("Enter PhoneNumber :");
                                phoneNumber = sc.next();
                                System.out.println("Enter City : ");
                                city = sc.next();
                            
                    
                case 2 :
                String filepath = "Voter.txt"  ; 
                boolean isLoginsuccess ; 
                System.out.println("Enter your UserName or ID :");
                userName = sc.next();
                System.out.println("Enter your Password :");
                password = sc.next();
                Registeration registeration = new Registeration();
               registeration.login(userName, password, filepath);
               isLoginsuccess = registeration.isIsLogin();
               if(isLoginsuccess){
               
               
               
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
