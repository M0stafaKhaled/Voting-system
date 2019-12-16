
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
    private Result result; 
    private final String[] user_name = {"admin", "Admin",};
    private final String[] password = {"admin", "Admin"};
    private VoteDate  voteDate ;

    public Admin(VoteDate voteDate) {
        this.voteDate = voteDate;
    }
    public Admin (){}
    ///////////////////////////////////////////////////

    public Admin(Result result) {
        this.result = result;
    }
    
    public void Savedate(String startDate , String endDate){
        
        String filePath = "VoteDate.txt";
     try {
                    FileWriter fw = new FileWriter(filePath, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fw);
                    try (PrintWriter pw = new PrintWriter(bufferedWriter)) {
                        pw.println(startDate + ","+endDate);
                        pw.flush();
                        
                    }
                    
    
    }
     catch(IOException e1){}
    
             }
    
    public void setStartTimeAndEndTime(String start , String end){
        if(voteDate.getStartaVotingDate() == null ){
        voteDate.setEndOfVotingDate(end);
        voteDate.setStartaVotingDate(start);
            Savedate(start, end);

        }
       
    
        else
            System.out.println("it is ready seted");
    
    }
    public  String getSartDate() throws FileNotFoundException{
        
                    String startDate = "";
                    Scanner x; 
                    String filpath = "VoteDate.txt";
                     x = new Scanner(new File(filpath));
            x.useDelimiter("[,\n]");
      
                
                
               return startDate = x.next();
           
            
                    
        } 
    public  String getEndDate() throws FileNotFoundException{
        
                     String startDate = "";
                    Scanner x; 
                    String filpath = "VoteDate.txt";
                     x = new Scanner(new File(filpath));
             x.useDelimiter("[,\n]");
      
                
                
               return startDate = x.next();
    
    
    }
    
     
          
       
       
    
    public  void addCandidte(String firstName ,String lastName, String id, String userName,  String phoneNumber, String city,String party_symbol, String Electoral_program){
    
    candidate = new Candidate(firstName,lastName, id, userName, phoneNumber, city, party_symbol, Electoral_program);
        String filePath = "ListOfCandite.txt";
    try {
                    FileWriter fw = new FileWriter(filePath, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fw);
                    try (PrintWriter pw = new PrintWriter(bufferedWriter)) {
                        pw.println(firstName +   "," + lastName +  ","+ id + "," + userName + "," +   phoneNumber + "," + city + "," + party_symbol + "," + Electoral_program);
                        pw.flush();
                        
                    }
                    
                } catch (IOException e) {
                    System.out.println("File not Found And"
                            + "Data is unsaved");
                }
    
    }
    public  static  ArrayList<String> candidateList(){
          ArrayList<String> CandidatesName = new ArrayList<>();

        Scanner x ;
        String  filpath  = "ListOfCandite.txt";
        String  firstNameOfCandidte = null ;
        String lasttNameOfCandidte = null ;
        String  idOfUser = null ;
        String  userNameOfUser ;
        String  passwordOfUser = null ;
        String  phoneNumerOfUser = null ;                  
        String  cityOfUser = null ;
        String  party_symbol,Electoral_program ; 
      
        try {
            x = new Scanner(new File(filpath));
            x.useDelimiter("[,\n]");

            while (x.hasNext()) {
                firstNameOfCandidte = x.next();
                lasttNameOfCandidte = x.next();
                idOfUser = x.next();
                userNameOfUser = x.next();
                phoneNumerOfUser = x.next();
                cityOfUser = x.next();
                party_symbol = x.next();
                Electoral_program = x.next();
                CandidatesName.add(firstNameOfCandidte);
            }
    }
        catch(FileNotFoundException e1){}
         return CandidatesName;
    }
    public static void showCanditeName(){
        System.out.println("--------------------------------");
         candidateList().forEach((n) -> System.out.println(n)); 
          System.out.println("--------------------------------");
    }
    
     public boolean AdminIsLogIn(String username , String password) {
       boolean isLogin = false ; 
        for (int i = 0; i < getUser_name().length; i++) {
            if (username.equals(getUser_name()[i]) && password.equals(getPassword()[i])) {
                System.out.println("-----------------------");
                System.out.println("Welcome to Voting System " + username);
                System.out.println("");
                isLogin = true;
                return isLogin;
            }
            else{
                    System.out.println("");
                    System.out.println("Password or username inValid");
                    return isLogin;
            }
        }
        return isLogin;
    }
    public String[] getUser_name() {
        return user_name;
    }
    public String[] getPassword() {
        return password;
    }
     
    public void showResult(){
    
            result.ShowResult();
    
    }
 

  
    
}
