package voting;

import java.util.ArrayList;
import java.util.Scanner;

public class VoterInterFace {

    private Scanner sc = new Scanner(System.in);
    int LoobCondation = 1;
    String fristName, lastName, id, userName, password, phoneNumber, city;
    Voter currentVoter ;
    private     VotingForm v;

    public void VoterSystmetUI() {

        int chooseOfVoter = 0;
        int x;
        do {
            System.out.println("-----------------------------------");

            System.out.println("1-create new account \n2-login \nChoose:");

            chooseOfVoter = sc.nextInt();

            System.out.println("-----------------------------------");

            switch (chooseOfVoter) {

                case 1:

                    System.out.println("Enter FristName : ");
                    fristName = sc.next();
                    System.out.println("Enter LastName : ");
                    lastName = sc.next();
                    System.out.println("Enter ID :");
                    id = sc.next();
                    System.out.println("Enter Password : ");
                    password = sc.next();
                    System.out.println("Enter UserName : ");
                    userName = sc.next();
                    System.out.println("Enter PhoneNumber :");
                    phoneNumber = sc.next();
                    System.out.println("Enter City : ");
                    city = sc.next();

                    Registeration re = new Registeration(fristName, lastName, id, userName, password, phoneNumber, city);
                    boolean success = re.Isvalidate();

                    if (success) {

                        re.SignUp(fristName, lastName, id, userName, password, phoneNumber, city, "Voter.txt", success);
                        System.out.println("done");
                    }
                    break;

                case 2:
                    String filepath = "Voter.txt";
                    boolean isLoginsuccess;

                    System.out.println("Enter your UserName or ID :");
                    userName = sc.next();
                    System.out.println("Enter your Password :");
                    password = sc.next();
                    Registeration registeration = new Registeration();
                    registeration.login(userName, password, filepath);
                    isLoginsuccess = registeration.isIsLogin();
                    if (isLoginsuccess) {
                         currentVoter = registeration.getVoter();
                        System.out.println("Welcome To Voting System " + currentVoter.getFirstName());
                        System.out.println("----------------------------------------");
                        VoterOtion();
                    }
                    break;

                default:
                    System.out.println("-----------------------");
                    System.out.println("Try Again! ");
                    System.out.println("-----------------------");
            }
            System.out.println("1-Back to main list"
                    + "\n2-Exit");
            System.out.println("-------------------------");
            LoobCondation = sc.nextInt();
        } while (LoobCondation == 1);
        System.out.println("Thank You for using our Voting System \nGood Luck!");
        System.exit(LoobCondation);

    }

    public void VoterOtion() {
        int LoobCondation2 = 1;
        int option;
        option = sc.nextInt();
        do {
            System.out.println("1-ShowCanditeInfo\n2-Add\nvote3-Delete Vote");
            System.out.println("----------------------------------------");
            option = sc.nextInt();
         v = new VotingForm();
            switch (option) {
                case 1:
                    v.showCandidatesInfo();
                    break;

                case 2:
                    int getNumberOfcandidate;
                    String candidteName = null;
                    ArrayList<String> ListOfCandidate = v.candidateList();
                    for (int i = 0; i < ListOfCandidate.size(); i++) {
                        System.out.println(ListOfCandidate.get(i));
                    }
                    System.out.println("Enter Number Of Candidate You Want to Vote");
                    getNumberOfcandidate = sc.nextInt();
                    try {
                        candidteName = v.getCandidateName(getNumberOfcandidate);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("not such candidte in this number");
                    }
                       currentVoter.submitvote(candidteName);
                    break;
                case 3:
                break;
                default:
                    System.out.println("-----------------------");
                    System.out.println("Try Again! ");
                    System.out.println("-----------------------");
            }
            System.out.println("1-Back to main list"
                    + "\n2-Exit");
            System.out.println("-------------------------");

            LoobCondation2 = sc.nextInt();
        } while (LoobCondation2 == 1);

    }

}
