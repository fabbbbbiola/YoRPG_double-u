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
    
    /*========================
No longer necessary because each subclass will have its own normalize and
specialize methods:

    protected int DEFENSE;
    protected double ATTRATING;
 ========================*/

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
    
    public abstract void specialize(); /* {
        
        attRating = ATTRATING*(Math.random()+1.0);
	    defense = DEFENSE*(int)(Math.random()+1.0);
       
	    } */
    
    public abstract void normalize(); /* {
        
        defense = DEFENSE;   
        attRating = ATTRATING;
        
	} */
    
    public abstract String about(); /* {
        //lets us write the about text in each specific class as we create them
        return ((Character)c).getInfo();
	} */
}
