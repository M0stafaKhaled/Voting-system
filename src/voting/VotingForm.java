package voting;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class VotingForm {
    public  static  ArrayList<String> candidateList(){
          ArrayList<String> CandidatesName = new ArrayList<>();
        Scanner x ;
        String  filpath  = "ListOfCandite.txt";
        String  firstNameOfCandidte = null ;
        String lasttNameOfCandidte = null ;
        String  idOfUser = null ;
        String  userNameOfUser ;
        String  passwordOfUser = null ;
        String  phoneNumerOfUser = null ;                  
        String  cityOfUser = null ;
        String  party_symbol,Electoral_program ; 
        try {
            x = new Scanner(new File(filpath));
            x.useDelimiter("[,\n]");
            while (x.hasNext()) {
                firstNameOfCandidte = x.next();
                lasttNameOfCandidte = x.next();
                idOfUser = x.next();
                userNameOfUser = x.next();
                phoneNumerOfUser = x.next();
                cityOfUser = x.next();
                party_symbol = x.next();
                Electoral_program = x.next();
                CandidatesName.add(firstNameOfCandidte);
            }
    }
        catch(FileNotFoundException e1){}
         return CandidatesName;
    }
    
    public void showCandidatesInfo(){
        Scanner x ;
        Scanner sc  = new Scanner(System.in);
        int chosenCandidate =0;
        String filpath  = "ListOfCandite.txt";
        String firstNameOfCandidte = null ;
        String lasttNameOfCandidte = null ;
        String idOfUser = null ;
        String userNameOfUser ;
        String  phoneNumberOfUser = null ;                  
        String cityOfUser = null ;
        String  party_symbol,Electoral_program ; 
       // ArrayList<String> CandidatesName = new ArrayList<>();
        try {
            x = new Scanner(new File(filpath));
            x.useDelimiter("[,\n]");
            int i = 1 ;
            while (x.hasNext()) {
               
                firstNameOfCandidte = x.next();
                lasttNameOfCandidte = x.next();
                idOfUser = x.next();
                userNameOfUser = x.next();
                phoneNumberOfUser = x.next();
                cityOfUser = x.next();
                party_symbol = x.next();
                Electoral_program = x.next();
                ////////////////////////////////////////////////////
                System.out.println("---------------------------------------------");
                System.out.println( 
                 "Candilit Number "+i+"\n"+
                firstNameOfCandidte + "\n"+
                lasttNameOfCandidte + "\n"  
                + party_symbol+"\n"
                +Electoral_program);
                System.out.println("---------------------------------------------");
        i++;
       
        
        
    }
            
            System.out.println("enter the number of Candidate you want to vote");
           chosenCandidate = sc.nextInt();
           
            
}
        catch(FileNotFoundException r){}
    }
}
