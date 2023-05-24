package ClassPackage;

public class User extends Person {

    public String userName;

   public  String userPassword;

    public  int accessLevel;

    public User() {
    }

    public User(String userName, String userPassword, int accessLevel) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.accessLevel = accessLevel;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the userPassword
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * @param userPassword the userPassword to set
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * @return the accessLevel
     */
    public int getAccessLevel() {
        return accessLevel;
    }

    /**
     * @param accessLevel the accessLevel to set
     */
    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    @Override
    public String toString() {
        return "User{" + "userName=" + userName + ", userPassword=" + userPassword + ", accessLevel=" + accessLevel + '}';
    }
    
    
    
    

}