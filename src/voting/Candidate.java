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
public class Candidate extends Person{
    
    private String  party_symbol;
    private String Electoral_program;

    public Candidate(String name, String id, String userName, String password, String phoneNumber, String city,String party_symbol, String Electoral_program) {
        
        super(name, id, userName, password, phoneNumber, city);
         this.party_symbol = party_symbol;
        this.Electoral_program = Electoral_program;
         
     
        
    }
   
    public  Candidate(){}

    public Candidate(String party_symbol, String Electoral_program) {
        this.party_symbol = party_symbol;
        this.Electoral_program = Electoral_program;
    }

   
    
}
