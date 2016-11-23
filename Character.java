// Team double u
// Gian Tricarico, Fabiola Radosav, James Zhang
// APCS1 pd4
// HW32 -- Ye Olde Role Playing Game, Expanded
// 2016-11-19


public class Character{

    protected String name;
    protected int HP;
    protected int strength;
    protected int defense;
    protected double attRating;
    protected int DEFENSE;
    protected double ATTRATING;
    protected String information;

    public boolean isAlive(){

        return HP > 0;

    }
    
    public String getName() {
        return name;
    }

    public int getDefense(){

        return defense;
	
	}

    public void lowerHP(int damage){

        HP -= damage;

    }

    public int attack(Character c){

        int damage = (int) ((strength * attRating) - c.getDefense());
        if ( damage < 0 ) {
            damage = 0;
        }
        c.lowerHP(damage);
        return damage;
	
    }
    
    public void specialize() {
        
        attRating = ATTRATING*(Math.random()+1.0);
	    defense = DEFENSE*(int)(Math.random()+1.0);
       
    }
    
    public void normalize() {
        
        defense = DEFENSE;   
        attRating = ATTRATING;
        
    }
    
    /*
    public static String about(Character c){
        //lets us write the about text in each specific class as we create them
        return ((Character)c).getInfo();
    }
    */
}
