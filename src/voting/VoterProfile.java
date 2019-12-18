package voting;


public class VoterProfile {
    private final Voter voter;

    public VoterProfile(Voter voter) {
        this.voter = voter;
    }
    public void ShowDataOfVoter(){
        System.out.println(voter.firstName + "\n" + voter.lastName + "\n"+voter.lastName + "\n"+ voter.getId()+ "\n"+voter.phoneNumber+voter.userName);
        if(voter.ISVoted()){
                System.out.println(voter.getCadidateName());
        
        }
    }
    
    
}
