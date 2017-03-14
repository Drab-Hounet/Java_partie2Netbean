package java_netbean_part2;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author jerome.lombard
 */
public abstract class Person {
    protected String name = new String();
    protected String first_name = new String();
    protected int birthYear;
    protected int yearCurrent = Calendar.getInstance().get(Calendar.YEAR);
    protected ArrayList<User> listUsersConnected = new ArrayList<>();
    
    /**
    * @return name
    */
    protected String getName(){
        return this.name;
    }
    
    /**
     * @return first name
     */
    protected String getFirst_name(){
        return this.first_name;
    }

    /**
     * @return age
     */
    protected int getBirthYear(){
        return this.birthYear;
    }
    
    /**
     * @param name the name to set
     */
    protected void setName(String name) {
        this.name = name;
    }
    
    /**
     * @param first_name the first_name to set
     */
    protected void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    /**
     * @param pBirthYear
     */
    protected void setBirthYear(int pBirthYear) {
        this.birthYear = pBirthYear;
    }
    
    /**
     *
     * @return
     */
    protected int getAge(){
        return (yearCurrent - birthYear);
    }
    //-------------------------------------------FRIENDS-------------------------------------------

    /**
     * @return listFriends
     */
    public ArrayList<User> getListFriends() {
        return listUsersConnected;
    }

    /**
     *
     */
    public void displayFriends(){
        if(!this.listUsersConnected.isEmpty()){
            for(User friend : this.listUsersConnected){
                System.out.println(friend.displayProfil());
            }
        }else{
            System.out.println("-------> aucun ami");
        }
    }

    /**
     * @param friend to add in listFriends
     */
    public void addPerson (User friend) {
        this.listUsersConnected.add(friend);		
    }
    
    
}
