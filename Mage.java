// Team double u
// Gian Tricarico, Fabiola Radosav, James Zhang
// APCS1 pd4
// HW34 -- Ye Olde Role Playing Game, Unchained
// 2016-11-23

public  class Mage extends Character{
    
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
    public String about() {
        information = "The Mage possesses knowledge of the arcane arts, a ";
        information += "magical staff, and a cool hat.";
        return information;
    }


}
