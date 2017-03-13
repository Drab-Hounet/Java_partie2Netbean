package java_netbean_part2;
/**
 * @author drab
 *
 */
public class Moderator extends User {
	
	
    private int level_moderator = 1;
    /**
     * 
     */
    public Moderator() {

    }
	
    public Moderator(String pName, String pFirst_name, int pAge, int plevel_moderator) {
        super(pName, pFirst_name, pAge);
        level_moderator = plevel_moderator;
    }
	
    /**
     * @Override the level_moderator
     */
    public int getLevel_moderator() {
        return level_moderator;
    }
		
    /**
     * @param level_moderator true or false and level_moderator the level_moderator to set
     * @return 
     */
    public boolean setLevel_moderator(int level_moderator) {
        if(level_moderator == 1 || level_moderator == 2){
            this.level_moderator = level_moderator;
            return true;
        }
        return false;
    }
	
    @Override
    public String displayProfil(){
        return super.displayProfil() + " Ton niveau de modération est de " + this.level_moderator;
    }
	
    @Override
    public void setProfil(){
        Menu.menuSetProfile(this);
    }	
}
