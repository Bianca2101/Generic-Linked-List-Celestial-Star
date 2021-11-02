public class TestMyLinkedList 
{
	public static void main(String[] args) 
	{
		MyLinkedList<CelestialStar> visibleList= new MyLinkedList<CelestialStar>();
		MyLinkedList<CelestialStar> newList= new MyLinkedList<CelestialStar>();
		
		System.out.println("Test determineIfVisible method if parameter is null: ["+ visibleList.determineIfVisible(null)+"]\n");
		
		CelestialStar s1= new CelestialStar("Polaris", 80, "Little Dipper", 'Y');
		CelestialStar s2= new CelestialStar("Sirius", 7, "Canis Major", 'Y');
		CelestialStar s3= new CelestialStar("Betelgeuse", 650, "Orion", 'N');
		CelestialStar s4= new CelestialStar("Rigel", 900, "Orion", 'N');
		CelestialStar s5= new CelestialStar("Vega", 25, "Lyra", 'Y');
		CelestialStar s6= new CelestialStar("Pleiades", 43, "Taurus", 'Y');
		CelestialStar s7= new CelestialStar("Antares", 550, "Scorpius", 'N');
		
		System.out.println("\nTest determineIfVisible method if list is empty: ["+ visibleList.determineIfVisible(s1)+"]\n");
		
		visibleList.append(s1);
        visibleList.append(s2);
		visibleList.append(s3);
		visibleList.append(s4);
		visibleList.append(s5);
		visibleList.append(s6);
		visibleList.append(s7);
		System.out.println("Celestial Stars: \n"+visibleList);
		
		System.out.println("\n****If stars are fewer or equal to 80 light years away they are clearly visible****\n");
		newList = visibleList.determineIfVisible(s1);
		System.out.println("Stars that are visible (fewer or equal to 80 light years away): \n"+newList);
	}
}