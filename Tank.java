// Team double u
// Gian Tricarico, Fabiola Radosav, James Zhang
// APCS1 pd4
// HW34 -- Ye Olde Role Playing Game, Unchained
// 2016-11-23

public class Tank extends Character{
    
    // Methods


    // Constructor
    public Tank( String n ) {
        name = n;
        HP = 200;
        strength = 90;
        defense = 150;
        attRating = 0.4;
        // DEFENSE = defense;
        // ATTRATING = attRating;
    }
       
    public String about() {
	information = "TANK TAKE ALL THE HIT.";
	return information;
    }
    

}
