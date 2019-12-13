/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voting;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;






public class Vote {

         
        
          private Date timeOfVoting;
          public String  VoterID;
          public String  CandidateName ;
          private Scanner x ;
    
    
    
    public void addVote(HashMap<String,String> VoteList,String VoterID,String CandidateName){
            VoteList.put(VoterID, CandidateName);
    }
  
            
    public boolean hasVote(){  
        return false; 
}
   public  HashMap<String,String> showListOfVote(String filpath){
                String voterId ;
                String candidateName ;
              HashMap<String, String> hashMap = new HashMap();
         try {
            x = new Scanner(new File(filpath));
            x.useDelimiter("[,\n]");
             while (x.hasNext()) {  
                 voterId = x.next();
                 candidateName = x.next();
                 hashMap.put(voterId,candidateName);  
                
             }
              ;
            
             x.close();
         }
         catch(FileNotFoundException e1){
                System.out.println("File not found");
         }
         return hashMap;
}
}
