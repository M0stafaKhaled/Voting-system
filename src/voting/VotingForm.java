
package voting;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;


public class VotingForm {
    public void showCandidatesInfo(){
            
        
         Scanner x ;
        String filpath  = "ListOfCandite.txt";
        String nameOfUser = null ;
        String idOfUser = null ;
        String userNameOfUser ;
        String passwordOfUser = null ;
        String  phoneNumberOfUser = null ;                  
        String cityOfUser = null ;
        String  party_symbol,Electoral_program ; 
       // ArrayList<String> CandidatesName = new ArrayList<>();

        try {
            x = new Scanner(new File(filpath));
            x.useDelimiter("[,\n]");

            while (x.hasNext()) {

                nameOfUser = x.next();
                idOfUser = x.next();
                
                userNameOfUser = x.next();
        
                phoneNumberOfUser = x.next();
                cityOfUser = x.next();
                party_symbol = x.next();
                Electoral_program = x.next();
                System.out.println("---------------------------------------------");
                System.out.println(nameOfUser + "\n" 
                + cityOfUser +"\n"
                        + party_symbol+"\n"
                +Electoral_program);
                System.out.println("---------------------------------------------");
        
    }
    
}
        catch(FileNotFoundException r){}
    }
}
