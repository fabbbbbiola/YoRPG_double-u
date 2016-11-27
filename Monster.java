// Team double u
// Gian Tricarico, Fabiola Radosav, James Zhang
// APCS1 pd4
// HW34 -- Ye Olde Role Playing Game, Unchained
// 2016-11-23

public class Monster extends Character{
    
    // distinct from the name variable inherited from superclass Character:
    private String monsterName = "Rudy";

    public Monster() {

        HP = 150;
        strength = 20 + (int)(Math.random()*60); //20 thru 65
        defense = 70;
        attRating = 1;
    }
    
    
    public String about() {
        information = "The monster terrorizes and lays waste to the kingdom ";
        information += "you hold dear. Slay it.";
        return information;
    }
    
    public String getName() {
        return monsterName;
    }
    
    
    // For some reason, it returns an error when we don't override the attack
    // method.
    public int attack( Character c ) {
        int damage = (int) ((strength * attRating) - c.getDefense());
        if ( damage < 0 ) {
            damage = 0;
        }
        c.lowerHP(damage);
        return damage;
    }

    public static boolean dropPotion(){
	if ((int)(Math.random()*10) > 5)
	    {numPotions += 1;
		return true;}
	return false;
    }

} // end class Monster
