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

             
     
                String m  ;
   
          
    public Voter(String name, String id, String userName, String password, String phoneNumber, String city) {
               super(name, id, userName, password, phoneNumber, city);
               
                    m =  name + " "+ id +" "+ userName  +" "+ password +" "+ phoneNumber +" "+ city;
    }
        

    
    
   
     
    
    
    
    
}
