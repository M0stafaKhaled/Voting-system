package voting;

import java.util.HashMap;
import java.util.Map;

public final class Voter extends Person implements EndTimeOfVoteing{
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

    public String getPassword() {
        return password;
    }

    public String getId() {
        return id;
    }

    public Vote getVote() {
        return vote;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getUserName() {
        return userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean EndTimeOfVoteing() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
        

    
    
   
     
    
    
    
    
}
