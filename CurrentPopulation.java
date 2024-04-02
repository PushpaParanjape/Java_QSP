//Write a program to display the population for each of the next five years. Assume the current population is 312,032,486 and one year has 365 days.
// one birth every 7sec
// one detah every 13 sec
// one new immigrant every 45 sec


class CurrentPopulation
{
	public static void main(String [] args)
	{
		long currentPopulation = 312032486;
		long secondsInYear = 365*24*60*60; //seconds per year--(days in year)*(hours per day)*(min per hour)*(sec per min)
		long birthPerYear = secondsInYear/7;
		long deathPerYear = secondsInYear/13;
		long newImmigrant = secondsInYear/45;
		long newPopulation = currentPopulation +((birthPerYear - deathPerYear + newImmigrant)*5);
		System.out.println("The New population is :"+newPopulation );
	}

} 