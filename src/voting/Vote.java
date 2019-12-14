package voting;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Vote {
        
          private Date timeOfVoting;
          public String  VoterID;
          public String  CandidateName ;
          private Scanner x ;
    

    public void addVote(HashMap<String,String> VoteList,String VoterID,String CandidateName){
                if(!(hasVote(VoteList, VoterID))){
              String  filePath = "VotingList.txt";
            VoteList.put(VoterID, CandidateName);
             try {
                    FileWriter fw = new FileWriter(filePath, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fw);
                    try (PrintWriter pw = new PrintWriter(bufferedWriter)) {
                        pw.println(VoterID+","+CandidateName);
                        pw.flush();
                    }
             }
             catch(IndexOutOfBoundsException e1){  
                        System.out.println("Fie not found");
                    } catch (IOException ex) {
                        Logger.getLogger(Vote.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                }
    }
    public boolean hasVote(HashMap<String,String>List ,String VoterId){  
        
              return List.containsKey(VoterId);       
}
         
   public  Map<String,String> showListOfVote(){
        String filpath = "VotingList.txt";
                String voterId = "";
                String candidateName = "" ;
              HashMap<String, String> hashMap = new HashMap();
         try {
            x = new Scanner(new File(filpath));
            x.useDelimiter("[,\n]"); 
             while (x.hasNext()) {  
                 voterId = x.next();
                 candidateName = x.next();
                 hashMap.put(voterId,candidateName);  
             }
             x.close();
         }
         catch(FileNotFoundException e1){
                System.out.println("File not found");
         }
         return hashMap;
}
}
