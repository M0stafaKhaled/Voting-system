package voting;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Pattern;


public final class Registeration {
  private String firstName;
  private String lastName;
    private String id;
    private String userName;
    private String password;
    private String phoneNumber;
    private String city;
    private int ID; 
    private  Voter voter;
    private  Scanner x ;
    private boolean  isLogin = false;
   
    public Registeration(String firstName ,String lastName, String id, String userName, String password, String phoneNumber, String city, boolean isvaleted) {
        this.firstName = 
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.city = city;
        SignUp(firstName,lastName, id, userName, password, phoneNumber, city, city, isvaleted);
    }
 
    public Voter getVoter() {
        return voter;
    }
    
      
    
     public boolean Isvalidate( String firstName ,String lastName,String id, String userName, String password, String phoneNumber, String city) {

        if (!valFirsName(firstName)) {
            System.out.println("first name is unvalied");
            return false;
        }
        if(!valLastName(lastName))
        if (!valID(id)) {
            System.out.println("ID is unvalied");
            return false;
        }
        if (!valPhone(phoneNumber)) {
            System.out.println("phone is unvalied");
            return false;
        }
        if (!valPassword(password)) {
             System.out.println("password is unvalied");
              return false;

        } 
        
        
        if (!valUserName(userName)) {
            System.out.println("userName is unvalied");
            return false;
        }
        if (!valCity(city)) {

            System.out.println("city name is unvalied");
            return false;
        }
        return true;
    }

   public static  boolean  valPhone(String phoneNumber) {
        return phoneNumber.charAt(0) == '0' && phoneNumber.charAt(1) == '1' && phoneNumber.length() == 11 && phoneNumber.matches("[0-9]+");

    }
    public boolean valLastName(String lastName) {

        return Pattern.matches("[a-zA-Z]+{3,6}", lastName);
    }
  public boolean valFirsName(String firstName) {

        return Pattern.matches("[a-zA-Z]+{3,6}", firstName);
    }

    public boolean valUserName(String userName) {
        return Pattern.matches("[a-zA-Z0-9]+-?_?", userName);
    }

    public boolean valPassword(String password) {

        if (password.length() >= 8) {

            return checkPassword(password);
        } else {
            System.out.println("Password is too small");
            return false;
        }
    }

    public boolean checkPassword(String password) {
        boolean hasCapital = false;
        boolean hasNumber = false;
        boolean hasLower = false;
        char c;
        for (int i = 0; i < password.length(); i++) {
            c = password.charAt(i);
            if (Character.isDigit(c)) {
                hasNumber = true;
            } else if (Character.isUpperCase(c)) {
                hasCapital = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            }
            if (hasCapital && hasLower && hasNumber) {
                return true;
            }
        }
        return false;

    }

    public boolean valCity(String city) {

        return Pattern.matches("[a-zA-Z]+", city);
    }

    public boolean valID(String id) {
        if (!Pattern.matches("[0-9]+", id)) {
            return false;
        }
        return id.length() == 14;
    }

   

    public  void SignUp(String firstName ,String lastName, String id, String userName, String password, String phoneNumber, String city, String filePath , boolean Isvalidate ) {
            if(!Isvalidate) {
                
                
        } 
            
            else {
                try {
                    FileWriter fw = new FileWriter(filePath, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fw);
                    try (PrintWriter pw = new PrintWriter(bufferedWriter)) {
                        pw.println(firstName +"," + lastName+  "," + id+"," + userName + "," + password + "," + phoneNumber + "," + city);
                        pw.flush();
                        login(userName, password, filePath);
                    }
                    
                } catch (IOException e) {
                    System.out.println("File not Found And"
                            + "Data is unsaved");
                }
        }
    }

    public final void login(String SearchTerm,String password, String filpath) {
        boolean found = false;
        String nameOfUser = null ;
        String idOfUser = null ;
        String userNameOfUser ;
        String passwordOfUser = null ;
        String  phoneNumerOfUser = null ;                  
        String cityOfUser = null ;

        try {
            x = new Scanner(new File(filpath));
            x.useDelimiter("[,\n]");

            while (x.hasNext()) {   
                idOfUser = x.next();
                nameOfUser = x.next();
                userNameOfUser = x.next();
                passwordOfUser = x.next();
                phoneNumerOfUser = x.next();
                cityOfUser = x.next();
                if (idOfUser.equals(SearchTerm) || userNameOfUser.equals(SearchTerm)) {
                    found = true;

                }
            }
            if(found){
                if(!passwordOfUser.equals(password)) {
                    System.out.println("Incorrect password");
                }
                else {
                 
                      isLogin = true;    
                    System.out.println(voter.getVoterData());
                   
                } 
            }
            else{
                    System.out.println("Incorrect username");
            
            }
            

        } catch (FileNotFoundException e) {
        }

       
    }

    public boolean isIsLogin() {
        return isLogin;
    }
    
}
