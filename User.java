package java_netbean_part2;

import java.util.ArrayList;

public class User extends Person implements Relationship{
	
    private final int level_moderator = 0;
    protected ArrayList<Message> listMessage = new ArrayList<>(); 
    
    public User(){
    }

    public User(String pName, String pFirst_name, int pBirthYear){
        name = pName;
        first_name = pFirst_name;
        birthYear = pBirthYear;
    }
 
    public void connect(){
        System.out.println(this.getName() + " est connecté");
    }
    //-------------------------------------------MESSAGE-------------------------------------------

    /**
     * @return listMessage
     */
    public boolean getListMessage() {
        if(!this.listMessage.isEmpty()){
            for(int i = 0 ; i < this.listMessage.size() ; i ++){
                System.out.println((i+1) + ". : " + this.listMessage.get(i).getContent());
            }
        }else{
            System.out.println("-------> aucun message");
            return false;
        }
        return true;
    }

    /**
     * @param message the message to set
     */
    public void addMessage(Message message) {
        this.listMessage.add(message);
    }

    public void deleteMessage(){
        if(this.getListMessage()){
            try{
                this.listMessage.remove(Menu.menuDeleteMessage(this.listMessage, "Quel message souhaitez vous effacez ? ")-1);
                System.out.println("message supprimé");
            }catch(Exception e){
                System.out.println("Aucun message à supprimer");
            }

        }
    }

    //-------------------------------------------USER----------------------------------------------

    public void setProfil(){
        Menu.menuSetUser(this);
    }

    /**
     * @return all attributes toString
     */
    public String displayProfil(){
        return this.name + " " + this.first_name + " age : " + this.getAge() + " ans";
    }

    public int getLevel_moderator() {
        return level_moderator;
    }
}
