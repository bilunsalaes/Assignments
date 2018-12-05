//Michael Martin
//M5A1 Programming Assignment 5

// This is my populationFor class
public class populationFor {

    public static void main(String[] args) {

        // create an instance of Populations to carry out the calculation
        Populations popObj = new Populations();
        
        for (int counter = 1; (popObj.unitedStatesPopulation > popObj.mexicoPopulation || popObj.unitedStatesPopulation > popObj.japanPopulation); counter++) {
            popObj.mexico();
            popObj.unitedStates();
            popObj.japan();
            
            System.out.println("\n" + counter + " years have passed");
            /*
			{
				if ((unitedStatesPopulation <= mexicoPopulation) && (unitedStatesPopulation <= japanPopulation))
					break;
			}
             */
        }
    }

}
