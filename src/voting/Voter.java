package voting;

public final class Voter extends Person {

    private String password;

    private final Vote vote = new Vote();

    public Voter(String FirstName, String LastName, String ID, String username, String password, String phoneNumber, String city) {

        super(FirstName, LastName, ID, phoneNumber, city);
        this.password = password;
    }
    
    public boolean ISVoted(){
            return vote.hasVote(this.id);
    }
    
    public void submitvote(String CandidateName) {
        vote.addVote(this.id, CandidateName);
        vote.saveVote(getId(), CandidateName);
        System.out.println("done");
    }
    public String getCadidateName(){
 
    return vote.serch(id);
    }

    public void removeVote() {

    }

    public String getId() {
        return this.id;
    }

    public Vote getVote() {
        return vote;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }

}
