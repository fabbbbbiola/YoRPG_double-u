// Team double u
// Gian Tricarico, Fabiola Radosav, James Zhang
// APCS1 pd4
// HW32 -- Ye Olde Role Playing Game, Expanded
// 2016-11-19


public class Warrior extends Character{


    // Methods


    // Constructor
    public Warrior( String n ) {
        name = n;
        HP = 125;
        strength = 100;
        defense = 40;
        attRating = 0.4;
        // DEFENSE = defense;
        // ATTRATING = attRating;
    }
        
    public String about() {
        information = "The warrior is imbued with a sword, a shield and a ";
        information += "healthy heaping of courage.";
        return information;
    }
    public void specialize() {
	defense = 20;
	attRating = .75;
    }
    
}
