// Team double u
// Gian Tricarico, Fabiola Radosav, James Zhang
// APCS1 pd4
// HW32 -- Ye Olde Role Playing Game, Expanded
// 2016-11-19

public class Rogue extends Character{
    
    // Methods


    // Constructor
    public Rogue( String n ) {
        name = n;
        HP = 60;
        strength = 80;
        defense = 50;
        attRating = 1.5;
        DEFENSE = defense;
        ATTRATING = attRating;
    }
    
    public static String getInfo() {
        String s;
        s = "Rogue is a fictional superhero usually associated with the X-Men ";
        s += "owned by Marvel Comics.";
        return s;
    }
    

}
