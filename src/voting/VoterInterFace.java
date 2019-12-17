
package voting;

import java.util.Scanner;


public class VoterInterFace {
    
    private Scanner sc = new Scanner(System.in);
    String fristName, lastName, id, userName, password, phoneNumber, city ;
        public void VoterSystmetUI(){
        
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
                    
                   
                   System.out.println("1-Add vote\n2-Delete Vote");
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
        
        }
}
