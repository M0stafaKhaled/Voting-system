/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voting;

public class Person {

    private String name;
    private String id;
    private String userName;
    private String password;
    private String phoneNumber;
    private String city;


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

  public Person(String name, String id, String userName, String password, String phoneNumber, String city) {
        this.name = name;
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.city = city;
    }  

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", id=" + id + ", userName=" + userName + ", password=" + password + ", phoneNumber=" + phoneNumber + ", city=" + city + '}';
    }
    
    
    
}
