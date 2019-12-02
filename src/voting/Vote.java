/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voting;


public class Vote {

         
          private final  Voter voter;
          private  Date timeOfVoting;

    public Vote(Voter voter  ) {
      
        this.voter = voter;
    }
    
     public void sumbitVote(){}
     public void cancleVote(){}
     public void countVote(){}
     public boolean hasVote(){
     return  false;}
   
   
}
