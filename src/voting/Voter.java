package voting;

import java.util.HashMap;
import java.util.Map;

public final class Voter extends Person{
              private String VoterData ;
              private String password;
              private String id;
              private Vote vote;
   
          
    public Voter(String name, String id, String userName, String password, String phoneNumber, String city,Vote vote) {
               super(name, id, userName,  phoneNumber, city);
                this.vote = vote;
                   VoterData=  name + " "+ id +" "+ userName  +" "+ password +" "+ phoneNumber +" "+ city;
                   
    }
   public void vote(Map<String,String>VoteList , String CandidateName){
                vote.addVote((HashMap<String, String>) VoteList, this.id, CandidateName);
   
   }
     public void editeVote(){}
     public void removeVote(){}

    public String getVoterData() {
        return VoterData;
    }

    
    
        

    
    
   
     
    
    
    
    
}
