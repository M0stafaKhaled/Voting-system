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
public class Person {

    private String name;
    private String id;
    private String userName;
    private String password;
    private String phoneNumber;
    private String city;
    private Scanner x;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean Isvalidate() {

        if (!valName(this.name)) {
            System.out.println("Name is unvalied");
            return false;
        }
        if (!valID(this.id)) {
            System.out.println("ID is unvalied");
            return false;
        }
        if (!valPhone(this.phoneNumber)) {
            System.out.println("phone is unvalied");
            return false;
        }
        if (!valPassword(this.password)) {
        } else {
            System.out.println("password is unvalied");
            return false;
        }
        if (!valUserName(this.userName)) {
            System.out.println("userName is unvalied");
            return false;
        }
        if (!valCity(this.city)) {

            System.out.println("city name is unvalied");
            return false;
        }
        return true;
    }

    public boolean valPhone(String phoneNumber) {
        return phoneNumber.charAt(0) == 0 && phoneNumber.charAt(1) == 1 && phoneNumber.length() == 11 && phoneNumber.matches("[0-9+]");

    }

    public boolean valName(String name) {

        return Pattern.matches("[a-zA-Z]+{3,6}", name);
    }

    public boolean valUserName(String userName) {
        return Pattern.matches("[a-zA-Z0-9]+-?_?", name);
    }

    public boolean valPassword(String password) {

        if (password.length() >= 8 && 15 > password.length()) {

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

    public Person(String name, String id, String userName, String password, String phoneNumber, String city) {
        this.name = name;
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.city = city;
    }

    public static void ADDUser(String name, String id, String userName, String password, String phoneNumber, String city, String filePath) {

        try {
            FileWriter fw = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bufferedWriter);
            pw.println(id + "," + name + "," + userName + "," + password + "," + phoneNumber + "," + city);
            pw.flush();
            pw.close();

        } catch (IOException e) {
            System.out.println("File not Found And"
                    + "Data is unsaved");
        }
    }

    public void login(String SearchTerm,String password, String filpath) {
        boolean found = false;
        String nameOfUer = "";
        String idOfUer = " ";
        String userNameOfUer = " ";
        String passwordOfUer = " ";
        String  phoneNumerOfUer = " ";                  
        String cityOfUer = " ";

        try {
            x = new Scanner(new File(filpath));
            x.useDelimiter("[,\n]");

            while (x.hasNext()) {

                nameOfUer = x.next();
                idOfUer = x.next();
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
    
    
    public void vote(){
    
    
    }
    
}
