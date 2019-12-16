
package voting;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Admin {
    
    private Candidate candidate;
    private final  String userName ;
    private final  String password ;
   private VoteDate  voteDate ;

    public Admin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Admin() {
        this.userName = null;
        this.password = null;
    }
    
    public  void addCandidte(String name, String id, String userName,  String phoneNumber, String city,String party_symbol, String Electoral_program){
    
    candidate = new Candidate(name, id, userName, phoneNumber, city, party_symbol, Electoral_program);
        String filePath = "ListOfCandite.txt";
    try {
                    FileWriter fw = new FileWriter(filePath, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fw);
                    try (PrintWriter pw = new PrintWriter(bufferedWriter)) {
                        pw.println(name + "," + id + "," + userName + "," +   phoneNumber + "," + city + "," + party_symbol + "," + Electoral_program);
                        pw.flush();
                        
                    }
                    
                } catch (IOException e) {
                    System.out.println("File not Found And"
                            + "Data is unsaved");
                }
    
    }
    public   static ArrayList<String> candidateList(){
        
        Scanner x ;
        String filpath  = "ListOfCandite.txt";
        String nameOfUser = null ;
        String idOfUser = null ;
        String userNameOfUser ;
        String passwordOfUser = null ;
        String  phoneNumerOfUser = null ;                  
        String cityOfUser = null ;
        String  party_symbol,Electoral_program ; 
        ArrayList<String> CandidatesName = new ArrayList<>();

        try {
            x = new Scanner(new File(filpath));
            x.useDelimiter("[,\n]");

            while (x.hasNext()) {

                nameOfUser = x.next();
                idOfUser = x.next();
                
                userNameOfUser = x.next();
        
                phoneNumerOfUser = x.next();
                cityOfUser = x.next();
                party_symbol = x.next();
                Electoral_program = x.next();
                
                CandidatesName.add(nameOfUser);
                
            }
        
       
    
    
    }
        catch(FileNotFoundException e1){}
         return CandidatesName;
    }
    
    public static void showCanditeName(){
        
       
         candidateList().forEach((n) -> System.out.println(n)); 
    
    }
    

  
    
}
