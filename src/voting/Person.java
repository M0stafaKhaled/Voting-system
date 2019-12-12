
package voting;

public abstract class Person {

    protected String name;
    protected String id;
    protected String userName;
    protected String phoneNumber;
    protected String city;
   
    

  public Person(String name, String id, String userName, String phoneNumber, String city) {
        this.name = name;
        this.id = id;
        this.userName = userName;
       
        this.phoneNumber = phoneNumber;
        this.city = city;
    }  

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", id=" + id + ", userName=" + userName + ", phoneNumber=" + phoneNumber + ", city=" + city + '}';
    }
         
  
   
    
    
    
}
