
package voting;

public class Candidate extends Person{
    
    private String  party_symbol;
    private String Electoral_program;

    public Candidate(String name, String id, String userName,  String phoneNumber, String city,String party_symbol, String Electoral_program) {
        
        super(name, id, userName , phoneNumber, city);
         this.party_symbol = party_symbol;
        this.Electoral_program = Electoral_program;        
    }

    public String getParty_symbol() {
        return party_symbol;
    }

    public String getElectoral_program() {
        return Electoral_program;
    }

    public void setParty_symbol(String party_symbol) {
        this.party_symbol = party_symbol;
    }

    public void setElectoral_program(String Electoral_program) {
        this.Electoral_program = Electoral_program;
    }
    
   
    public  Candidate(){}

    public Candidate(String party_symbol, String Electoral_program) {
        this.party_symbol = party_symbol;
        this.Electoral_program = Electoral_program;
    }

   
    
}
