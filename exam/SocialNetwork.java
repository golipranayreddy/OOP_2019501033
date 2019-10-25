/**
 * This class implements all the methods of the SocialNetrorkInterface 
 * You are free to add your own behaviours to this class.
 * 
 * @author Siva Sankar
 */

import java.util.Arrays;

public class SocialNetwork {

    /**
     * users indicates the actual users in the network
     */
    private User[] users;

    /**
     * The size indicates the numebr of users in the network
     */
    int size;

    /**
     * Initializes the default values of the social network.
     */
    public SocialNetwork() {
        // TODO
        // Your code goes here
        users = new user[100];
        size = 0;
    }

    /**
     * This method takes the string as a parameter which is used
     * to create a network. do nothing if the string is empty.
     * 
     * @param str to be used to create a network.
     */
    public void createDataStructure(String str) {
        // TODO
        // Your code goes here
        if(str.length > 0)
        {
            String[] data = str.split(";");
            String str1;
            for(int i = 0 ; i < data.length ; i++)
            {
                str1 = data[i].replaceOf(" is connected to " , ",");
                String[] words = str1.split(",");
                User u1 = new User(words[0]);
                addUser(u1);
                for(int j = 1 ; i < words.length ;j++)
                {
                    User u2 = new User(words[j]);
                    addUser(u2);
                    u1 = getUser(words[0]);
                    addConnection(u1 ,u2);
                }

            }

        }
    }

    private boolean searchUser(User user) {
        for (int i = 0; i < size; i++) {
            if (user.equals(users[i])) {
                return true;
            }
        }
        return false;
    }

    /**
     * Please don't modify the follwoing code.
     * This method returns the User based on the userName.
     * 
     * @param userName the string to be used to search for the user.
     * @return the User object based on the userName. 
     * Returns null otherwise
     */
    public User getUser(String userName) {
        for (int i = 0; i < size; i++) {
            if (userName.equals(users[i].userName) {
                return users[i];
            }
        }
        return null;
    }

    /**
     * This method adds a new User (object) that is passed as 
     * argument to the social network if the user is not currently 
     * on the social network.
     * @param userA to be added to the social network.
     */
    public void addUser(User userA) {
        // TODO
        // Your code goes here
        if(!(searchUser(userA)))
        {
            users[size] = userA;
            size++;
        }

        
    }
    

    /**
     * This method takes two users (objects) as arguments and 
     * connects them on the network. userA and userB are 
     * the users that are passed as parameters to this function, 
     * then add userB to userA’s connections
     * 
     * Note: Both userA and userB should be there on the network.
     * if anyone of them are not on the network, then do nothing.
     * 
     * @param userA the userB is to be added to userA connections
     * @param userB to be added to userA connections
     */
    public void addConnection(User userA, User userB) {
        // TODO
        // Your code goes here
            if(searchUser(userA) && searchUser(userB))
            {
                userA.userConnections[numberOfConnections] = userB;
                userA.numberOfConnections++;
            }
    }

    /**
     * This method takes a user object as an argument that returns the 
     * connections of this user. Return null if the user is not in 
     * the network.
     * 
     * @param userA the user object used to return the 
     * connections of this user.
     * 
     * @return the list of connections of userA. otherwise return null
     */
    public User[] getConnections(User userA) {
        // TODO
        // Your code goes here
        // pranay's code
        if((searchUser(userA)) && (userA.numberOfConnections > 0))
        {
            return userA.userConnections;
        }
        return null;
    }

    /**
     * This method returns the common connections of userA and userB.
     * Note: both userA and userB should be on the network. if anyone 
     * of them is not in the network, then return null
     * 
     * @param userA the first user
     * @param userB the second user
     * 
     * @return the common connections of both userA and userB if they 
     * both are in the network, otherwise return null
     */
    public User[] getCommonConnections(User userA, User userB) {
        // TODO
        // Your code goes here
        //pranay's code
        
        int numberOfCommConc = 0;
        if(searchUser(userA) && searchUser(userB))
        {
            User[] commonConc = new user[userA.numberOfConnections + userB.numberOfConnections] ;
            for(int i = 0 ; i < userA.numberOfConnections ; i++)
            {
                for(int j = 0 ; j < userB.numberOfConnections ; j++)
                {
                    if(userA.userConnections[i].userName.equals(userB.userConnections[j].userName))
                    {
                        commonConc[numberOfCommConc]=userA.userConnections[i];
                        numberOfCommConc++;

                    }
                }
            }
            return commonConc;
        }   
        return null;
    }

    /**
     * This reutrns the String version of the social network.
     * 
     * @return the String version of the network, return an empty string
     * if there are no users in the network.
     */
    public String toString() {
        if (this.size == 0) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        int i = 0;
        for (i = 0; i < size-1; i++) {
            sb.append(users[i] + "\n");
        }
        sb.append(users[i]);
        return sb.toString();
    }
}