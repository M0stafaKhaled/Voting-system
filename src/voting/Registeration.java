/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voting;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Pattern;


/**
 *
 * @author mkost
 */
public final class Registeration {
    private String name;
    private String id;
    private String userName;
    private String password;
    private String phoneNumber;
    private String city;
   private int ID; 
    private  Scanner x ;
   
    public Registeration(String name, String id, String userName, String password, String phoneNumber, String city) {
        this.name = name;
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.city = city;
    }
    public Registeration(String loginterm , String Password , String filpath){
    
            login(loginterm, Password,filpath );
    }
    public  Registeration(){
    
    
    }
      
    
     public boolean Isvalidate(String name, String id, String userName, String password, String phoneNumber, String city) {

        if (!valName(name)) {
            System.out.println("Name is unvalied");
            return false;
        }
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
    public boolean valName(String name) {

        return Pattern.matches("[a-zA-Z]+{3,6}", name);
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

   

    public  void SignUp(String name, String id, String userName, String password, String phoneNumber, String city, String filePath , boolean Isvalidate ) {
            if(!Isvalidate) {
                
                
        } 
            
            else {
                try {
                    FileWriter fw = new FileWriter(filePath, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fw);
                    try (PrintWriter pw = new PrintWriter(bufferedWriter)) {
                        pw.println(id + "," + name + "," + userName + "," + password + "," + phoneNumber + "," + city);
                        pw.flush();
                    }
                    
                } catch (IOException e) {
                    System.out.println("File not Found And"
                            + "Data is unsaved");
                }
        }
    }

    public final void login(String SearchTerm,String password, String filpath) {
        boolean found = false;
        String nameOfUer ;
        String idOfUer ;
        String userNameOfUer ;
        String passwordOfUer = null ;
        String  phoneNumerOfUer ;                  
        String cityOfUer ;

        try {
            x = new Scanner(new File(filpath));
            x.useDelimiter("[,\n]");

            while (x.hasNext()) {

                
                idOfUer = x.next();
                nameOfUer = x.next();
                userNameOfUer = x.next();
                passwordOfUer = x.next();
                phoneNumerOfUer = x.next();
                cityOfUer = x.next();

                if (idOfUer.equals(SearchTerm) || userNameOfUer.equals(SearchTerm)) {

                    found = true;

                }
            }
            if(found){
                if(!passwordOfUer.equals(password)) {
                    System.out.println("Incorrect password.");
                }
                else 
                    System.out.println("login correct");
                
            }
            else{
                    System.out.println("Incorrect username");
            
            }
            

        } catch (FileNotFoundException e) {
        }

       
    }
}
