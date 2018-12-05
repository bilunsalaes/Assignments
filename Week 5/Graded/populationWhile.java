//Michael Martin
//M5A1 Programming Assignment 5

public class populationWhile {

    // The main method only needs to call the test method from the
    // populationFor class.
    // I may have gone a little overboard with defining my conditions for the while
    // loop but I wanted to make absolutely sure there were no bugs.
    public static void main(String[] args) {
        
        // create an instance of Populations to carry out the calculation
        Populations popObj = new Populations();
        
        // count the year changes
        int counter = 0;
        while (popObj.mexicoPopulation < popObj.unitedStatesPopulation
                || popObj.japanPopulation <= popObj.unitedStatesPopulation) {
            
            popObj.mexico();
            popObj.unitedStates();
            popObj.japan();
            counter++;
            
            System.out.println("\n" + counter + " years have passed");
        }

        // This output statement will give us the final population counts for all three
        // countries by the end of the simulation.
        {
            System.out.println("\nThe tables have turned. " + " " + " The population for the United States is now "
                    + " " + popObj.unitedStatesPopulation + ", the population of Mexico is now " + " "
                    + popObj.mexicoPopulation + ", and finally the current population of Japan is " + " "
                    + popObj.japanPopulation + ".");

        }

    }

}
