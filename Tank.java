// Team double u
// Gian Tricarico, Fabiola Radosav, James Zhang
// APCS1 pd4
// HW32 -- Ye Olde Role Playing Game, Expanded
// 2016-11-19

public class Tank extends Character{
    
    // Methods


    // Constructor
    public Tank( String n ) {
        name = n;
        HP = 200;
        strength = 90;
        defense = 150;
        attRating = 0.4;
        DEFENSE = defense;
        ATTRATING = attRating;
    }
       
    public static String getInfo() {   return "TANK TAKE ALL THE HIT.";   
    }
    

}
