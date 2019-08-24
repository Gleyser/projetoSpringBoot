package psoft.lab1.disciplinas;

public class GeradorID {
	 private static int ID = 1;

	 public static int getProximoID() {
	        return ID++;
	    }

}
