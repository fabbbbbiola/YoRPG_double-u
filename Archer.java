// Team double u
// Gian Tricarico, Fabiola Radosav, James Zhang
// APCS1 pd4
// HW34 -- Ye Olde Role Playing Game, Unchained
// 2016-11-23

public class Archer extends Character{
    
    // Methods


    // Constructor
    public Archer( String n ) {
        name = n;
        HP = 70;
        strength = 70;
        defense = 70;
        attRating = 1;
        // DEFENSE = defense;
        // ATTRATING = attRating;
    }        
        
    public String about() {
        information = "Always equiped with a handy bow, the archer rains down ";
        information += "arrows from above.";
        return information;
    }
    

    

}
