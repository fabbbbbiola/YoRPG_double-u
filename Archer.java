// Team double u
// Gian Tricarico, Fabiola Radosav, James Zhang
// APCS1 pd4
// HW32 -- Ye Olde Role Playing Game, Expanded
// 2016-11-19

public class Archer extends Character{
    
    // Methods


    // Constructor
    public Archer( String n ) {
        name = n;
        HP = 70;
        strength = 70;
        defense = 70;
        attRating = 1;
        DEFENSE = defense;
        ATTRATING = attRating;
    }        
        
    public static String getInfo() {
        String s;
        s = "Always equiped with a handy bow, the archer rains down arrows ";
        s += "from above.";
        return s;
    }
    

    

}
