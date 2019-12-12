/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voting;



import java.io.File;
import java.util.HashMap;
import java.util.Scanner;





public class Vote {

         
          private final  Voter voter;
          private Date timeOfVoting;
          public String  VoterID;
          public String  CandidateName ;
          public  Scanner x ;
         
          

    public Vote(Voter voter) {
      
        this.voter = voter;
    }
        
    /**
     *
     * @param VoteList
     */
    HashMap<String,String> VoteList = new HashMap<>();
    
    
    public void addVote(HashMap<String,String> VoteList,String VoterID,String CandidateName){
            VoteList.put(VoterID, CandidateName);
    }
  
            
    public boolean hasVote(){
            
        return false; 
}
  
//    public  HashMap<String,String> showListOfVote(){
//    
// 
//            
//   
//}
}
