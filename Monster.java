// Team double u
// Gian Tricarico, Fabiola Radosav, James Zhang
// APCS1 pd4
// HW32 -- Ye Olde Role Playing Game, Expanded
// 2016-11-19


public class Monster extends Character{
    
    // distinct from the name variable inherited from superclass Character:
    private String monsterName = "Rudy";

    public Monster() {

        HP = 100;
        strength = 20 + (int)(Math.random()*45); //20 thru 65
        defense = 20 + (int)(Math.random()*45);
        attRating = 1;
    }
    
    
    public static String about() {
        String s;
        s = "The monster terrorizes and lays waste to the kingdom you ";
        s += "hold dear. Slay it.";
        return s;
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
} // end class Monster
