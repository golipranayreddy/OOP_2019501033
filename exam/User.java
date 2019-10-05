import java.util.*;

public class User {
    public String userName;
    private String[] userConnections;
    private int numberOfConnections;

    
    public User(String userName )
    {
      this.userName = userName;

      this.userConnections = new String[50];
      
      this.numberOfConnections = 0;
    }

    public void SetnumberOfConnections(String numberOfConnections)
    {
        this.numberOfConnections = numberOfConnections;
    }

    public int getnumberOfConnections()
    {
        return numberOfConnections;
    }

    public String[] userConnectionsList()
    {
        return userConnections; 
    }
     


}