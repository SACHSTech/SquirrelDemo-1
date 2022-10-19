package OOPDemo;

public class Squirrel{
    // instance variables
    String colourString;
    String sizeString;
    int nutCountInt;
    Boolean aliveBoolean;
    double iqDouble;

    // constructor
    /**
     * FUCK THA JAVADOCS
     * @param newColourString
     * @param newSizeString
     * @param newInt
     * @param newNutCountInt
     * @param newiqDouble
     */
    public Squirrel(String newColourString, String newSizeString, int newNutCountInt, double newiqDouble) {
        this.aliveBoolean = true;
        this.colourString = newColourString;
        this.sizeString = newSizeString;
        this.nutCountInt = newNutCountInt;
        this.iqDouble = newiqDouble;
    }

    // instance methods
    public void run(){
        System.out.println("run!!");
    }

    public void findNut(int numberNuts){
        nutCountInt++;
    }

    public int getNutCount(){
        return this.nutCountInt;
    }

    public void climb(){
        System.out.println("Climb that tree!!!!");
    }

    public void kill(){
        this.aliveBoolean = false;
    }

    public void eatNut(){
        
    }
}