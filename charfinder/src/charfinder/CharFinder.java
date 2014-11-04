package charfinder;

public class CharFinder {

	public static void main(String[] args) {

		CharFinder cf = new CharFinder();

		String s = "Praktikum";

		System.out.println("the first character of " + s + " is "
				+ cf.getFirstChar(s));
		System.out.println("the last character of " + s + " is "
				+ cf.getLastChar(s));
		cf.printAllCharPositions(s);
		cf.getCharPos(s, 'p');

		// char t = s.charAt(0);
		//
		// System.out.println(t);
		//
		// System.out.println(s + " length is " + s.length());
		//
		// char l = s.charAt(s.length()-1);
		// System.out.println(l);

	}

	Character getFirstChar(String s) {
		Character ch = s.charAt(0);

		return ch;
	}

	Character getLastChar(String s) {
		Character ch = s.charAt(s.length() - 1);

		return ch;
	}

	void printAllCharPositions(String s) {
		Integer currentPosition = 0;
		Integer lastPosition = s.length() - 1;

		while (currentPosition <= lastPosition) {
			System.out.println(s.charAt(currentPosition) + " is at Position "
					+ currentPosition);
			currentPosition++;
		}
	}

	void getCharPos(String s, Character toFind) {
		
		s = s.toLowerCase();

		Integer currentPosition = 0;
		Integer lastPosition = s.length() - 1;

		Boolean found = false;

		while (currentPosition <= lastPosition) {


			if (s.charAt(currentPosition) == toFind) {
			found = true;
			System.out.println(toFind + " is at position " + currentPosition + " of " + s);
			
			}

			currentPosition++;
		}
		
		if(found == false){
			System.out.println(toFind + " was not found");
		}
	}

}
