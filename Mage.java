// Team double u
// Gian Tricarico, Fabiola Radosav, James Zhang
// APCS1 pd4
// HW32 -- Ye Olde Role Playing Game, Expanded
// 2016-11-19

public class Mage extends Character{
    
    // Methods


    // Constructor
    public Mage( String n ) {
        name = n;
        HP = 70;
        strength = 60;
        defense = 60;
        attRating = 1.3;
        DEFENSE = defense;
        ATTRATING = attRating;
    }
    public static String getInfo() {
        String s;
        s = "The Mage possesses knowledge of the arcane arts, a magical ";
        s += "staff, and a cool hat.";
        return s;
    }
    

}
