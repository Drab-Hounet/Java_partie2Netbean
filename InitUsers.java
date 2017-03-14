

/**
 *
 * @author jerome.lombard
 */
public class InitUsers {
    
    GroupUser group = new GroupUser();
    
    public InitUsers(){
        //user default----------------------------------------------------------
        User bob = new User("bob", "hin", 1983 );
        this.group.addUser(bob);
        Message messageBob = new Message();
        messageBob.setContent();
        bob.addMessage(messageBob);
        User agathe = new User("agathe", "zebluz", 1977 );
        this.group.addUser(agathe);
        User jacques = new User("Jacques", "hadit", 1985 );
        this.group.addUser(jacques);
        User bruce = new User("bruce", "hel", 1999 );
        this.group.addUser(bruce);
        //----------------------------------------------------------------------
        //String pName, String pFirst_name, int pBirthYear, int pSalary, int pContractDuration
        Director director = new Director("Jérôme", "le big boss", 1983, 150000, 1000);
        System.out.println(director.getName() + director.work());
    }

    public GroupUser getGroup() {
        return group;
    }
   
   
   
    
}
