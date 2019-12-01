/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voting;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mkost
 */
public class Voting {

          private final List<Candidate> candidates;
          private final  Voter voter;
          private  Date timeOfVoting;

    public Voting(Voter voter ,ArrayList<Candidate>candidates ) {
        this.candidates = candidates;
        this.voter = voter;
    }
    
     public void sumbitVote(){}
     public void cancleVote(){}
     public void countVote(){}
     public boolean hasVote(){
     return  false;}
   
   
}
