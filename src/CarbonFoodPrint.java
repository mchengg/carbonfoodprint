import java.util.HashMap;

public class CarbonFoodPrint
{
	static HashMap<String, Float> map;

	static void initialize()
	{
		map = new HashMap<String, Float>();
		// Sourced from http://css.umich.edu/factsheets/carbon-footprint-factsheet
		map.put( "Beef", 6.61f );
		map.put( "Milk", 0.72f );
		map.put( "Rice", 0.16f );
	}

	static void print()
	{
		for ( String food : map.keySet() )
		{
			System.out.println( food + " contains " + 
				map.get( food ) + "lbs of CO2 per serving!" );
		}
	}

        public static void main( String[] args )
        {
                System.out.println( "A friendly carbon footprint calculator" );
                initialize();
		print();
        }
}
