/**
 * This class discusses about the Contact Object. The attributes of the contact object
 * are as follows.
 * name : Name of the person / friend.
 * email : mail id of the person / friend.
 * phoneNumber : Phone Number of the person / friend.
 * 
 * @author Siva Sankar
 */

//  Your code goes here... For Contact class
public final class contact
{
    private String name;
    private String email;
    private String phoneNumber;


 public Contact(final String name1 , final String email1 , final String phoneNumber1)   
 {
     this.name = name1;
     this.email = email1;
     this.phoneNumber =phoneNumber1;
 } 

 public void setName(final String name1)
 {
     this.name = name1;
 }
public String getname()
{
    return this.name;
}
public void setEmail(final String email1)
{
    this.email = email1;
}
public String getEmail()
{
    return this.email1;
}
public String getPhoneNumber(final String phn)
{
    this.phoneNumber = phn;
}
public String getPhoneNumber()
{
    return this.phoneNumber;
}
public String toString()
{
     return "{ Name = " + this.name + ", " + "Email = " + this.email + ", "
         + "Phone Number = " + this.phoneNumber + " }";
}
}
