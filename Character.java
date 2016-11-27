// Team double u
// Gian Tricarico, Fabiola Radosav, James Zhang
// APCS1 pd4
// HW34 -- Ye Olde Role Playing Game, Unchained
// 2016-11-23

public abstract class Character{

    protected String name;
    protected int HP;
    protected int strength;
    protected int defense;
    protected double attRating;
 
    protected int DEFENSE;
    protected double ATTRATING;
    protected String information;
    protected static int numPotions;


    public static void gainPotion(){
	numPotions += 1;
    }

    //this is something the final boss can do
    public static void losePotions(){
	numPotions = 0;
    }

    public void heal(){
	if (numPotions > 0)
	    { HP += (int)(HP/2);
		System.out.println("You've healed!");
		numPotions -=1;}
	else {System.out.println("Oops! Looks like you're outta juice!");}
        
    }
    
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
    
    public abstract String about(); 
}
