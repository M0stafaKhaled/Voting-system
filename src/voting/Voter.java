/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voting;






/**
 *
 * @author mkost
 */
public final class Voter extends Person{

             
     
              private String VoterData ;
              private String password;
              private String id;
               
   
          
    public Voter(String name, String id, String userName, String password, String phoneNumber, String city) {
               super(name, id, userName,  phoneNumber, city);
               
                    VoterData=  name + " "+ id +" "+ userName  +" "+ password +" "+ phoneNumber +" "+ city;
                  
    }
    
   public void vote(){}
     public void editeVote(){}

    public String getVoterData() {
        return VoterData;
    }

    public void setVoterData(String VoterData) {
        this.VoterData = VoterData;
    }
    
        

    
    
   
     
    
    
    
    
}
