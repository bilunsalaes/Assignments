
public class Populations {
    
	// These are the required variables for my tests to function. I wanted to use
	// the multiplier variables so we can test different rates for
	// growth and rates for decline.

	 double newPopulation;
	 double mexicoMultiplier = (1.0105);
	 double unitedStatesMultiplier = (0.9984);
	 double japanMultiplier = (1.0101);
	 int counter = 0;
	 long mexicoPopulation = (121000000);
	 long unitedStatesPopulation = (315000000);
	 long japanPopulation = (127000000);

	// Mexico's growth rate calculations and output.
	public  void mexico() {
		newPopulation = mexicoPopulation * mexicoMultiplier;
		mexicoPopulation = (long) newPopulation;
		System.out.println("\n The Mexico population is " + " " + mexicoPopulation + " this year. ");
	}

	// The United States's growth decline calculation and output.
	public  void unitedStates() {
		newPopulation = unitedStatesPopulation * unitedStatesMultiplier;
		unitedStatesPopulation = (long) newPopulation;
		System.out.println("\n The US population is " + " " + (unitedStatesPopulation) + " this year. ");
	}

	// Japan's growth rate calculation and output.
	public  void japan() {
		newPopulation = japanPopulation * japanMultiplier;
		japanPopulation = (long) newPopulation;
		System.out.println("\n The Japan population is " + " " + japanPopulation + " this year. ");
	}
    
}
