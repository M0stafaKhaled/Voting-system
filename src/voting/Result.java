package voting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Result {
    
    Candidate candidate  ;
    private Scanner x ;
     int CandidteNumberOfVote =0 ; 
  
   public int getResult(){
   
       String filpath = "VotingList.txt";
       String voterId = "";
       String candidateName = "" ; 
        HashMap<String, String> hashMap = new HashMap();
         try {
            x = new Scanner(new File(filpath));
            x.useDelimiter("[,\n]"); 
             while (x.hasNext()) {  
                 voterId = x.next();
                 candidateName = x.next();
                 hashMap.put(voterId,candidateName);  
             }
             x.close();
                hashMap.keySet().stream().map((key) -> {
             // System.out.println("key : " + key);
             return key;
         }).forEachOrdered((key) -> {
             if(hashMap.get(key).contains("kkd"))
                 CandidteNumberOfVote++ ;
             
             //System.out.println("value : " + hashMap.get(key));
         });
     
         }
         catch(FileNotFoundException e1){
                System.out.println("File not found");
         }
   
           
   return CandidteNumberOfVote;
   }
            
            
            
}
