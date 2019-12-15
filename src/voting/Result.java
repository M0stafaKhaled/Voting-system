package voting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Result {
    
    Candidate candidate  ;
    private Scanner x ;
     int CandidteNumberOfVote =0 ; 
     String [] []ca =  {{"kkd","0"}
             ,{"pipi","0"}
             ,{"Amr","0"}
             ,{"khaled" ,"0"}};
    public Result(Candidate candidate) {
        this.candidate = candidate;
    }

    Result() {
        
    }
     
   public int getResultofCandidte(String currenCandidteNmae){
   
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
                hashMap.keySet().stream().map((key) -> {
             // System.out.println("key : " + key);
             return key;
         }).forEachOrdered((key) -> {
             if(hashMap.get(key).contains(currenCandidteNmae))
                 CandidteNumberOfVote++ ;
             
             //System.out.println("value : " + hashMap.get(key));
         });
     
         }
         catch(FileNotFoundException e1){
                System.out.println("File not found");
         }
   
           
   return CandidteNumberOfVote;
   }
   public void ShowResult(String [] candidateName){
   
   
       for (int i = 0; i < candidateName.length; i++) {
           
       }
   
   }

    
            
            
            
}
