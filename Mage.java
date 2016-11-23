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
        // DEFENSE = defense;
        // ATTRATING = attRating;
    }
    public String about() {
        information = "The Mage possesses knowledge of the arcane arts, a ";
        information += "magical staff, and a cool hat.";
        return information;
    }
    public void specialize() {
	defense = 30;
	attRating = 2.4;
    }
    public void normalize() {
	defense = 60;
	attRating = 1.3;
    }

}
