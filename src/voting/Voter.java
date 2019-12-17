package voting;

import java.util.HashMap;
import java.util.Map;

public final class Voter extends Person {
              private String VoterData ;
              private String password;
              private String id;
              private Vote vote;
   
          
    public Voter(String FirstName, String LastName, String ID,String username ,String password, String phoneNumber, String city,Vote vote) {
               super(FirstName, LastName,ID , username , phoneNumber , city);
                this.vote = vote;
                   VoterData=  FirstName + " " + LastName+ " "+ ID +" "+ username  +" "+ password +" "+ phoneNumber +" "+ city;
                   
    }
    public Voter(String FirstName, String LastName, String ID,String username ,String password, String phoneNumber, String city) {
              super(FirstName, LastName,ID , username , phoneNumber , city);
                   VoterData=  FirstName + " " + LastName+ " "+ ID +" "+ username  +" "+ password +" "+ phoneNumber +" "+ city;
                   
    }
   public void Suvote(Map<String,String>VoteList , String CandidateName){
                vote.addVote((HashMap<String, String>) VoteList, this.id, CandidateName);
   
   }
  
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

   
    
        

    
    
   
     
    
    
    
    
}
