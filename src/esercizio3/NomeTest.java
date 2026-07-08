package esercizio3;

public class NomeTest {

	

		public static void main (String args[]) {

			Nome myNome = new Nome(); 
			Nome myCognome = new Nome();
			myNome.stampa();
			myNome.letteraNome = "    II";
			myNome.stampa();
			myNome.stampa();
			myNome.stampa();
			myNome.stampa();
			myNome.stampa();
			myNome.stampa();
			myNome.stampa();
			myNome.stampa();
			myNome.letteraNome = "IIIIIIIIII";
			myNome.stampa();
			myNome.letteraNome = "  ";
			myNome.stampa();
			

			
			myCognome.stampaCognome();
			myCognome.letteraCognome = "DD    DD";
			myCognome.stampaCognome();
			myCognome.letteraCognome = "DD      DD";
			myCognome.stampaCognome();
			myCognome.letteraCognome = "DD      DD";
			myCognome.stampaCognome();
			myCognome.stampaCognome();
			myCognome.stampaCognome();
			myCognome.stampaCognome();			
			myCognome.stampaCognome();
			myCognome.letteraCognome = "DD    DD";
			myCognome.stampaCognome();
			myCognome.letteraCognome = "DDDDDD";
			myCognome.stampaCognome();
		}

	}
