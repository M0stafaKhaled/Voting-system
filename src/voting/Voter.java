/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author mkost
 */
public class Voter extends Person{

      private Scanner x ;
     
    
   
        ArrayList<Candidate> candidates = new ArrayList<>();
    
    public Voter(String name, String id, String userName, String password, String phoneNumber, String city) {
        super(name, id, userName, password, phoneNumber, city);
       
        
    }
    
    
   
     
    
    
    
    
}
