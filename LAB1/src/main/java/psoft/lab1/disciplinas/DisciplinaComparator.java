package psoft.lab1.disciplinas;

import java.util.Comparator;

public class DisciplinaComparator implements Comparator<Disciplina> {
	 
	public int compare(Disciplina disciplina, Disciplina outraDisciplina) {
		Double nota1 = disciplina.getNota();
		Double nota2 = outraDisciplina.getNota();
		if (nota1 < nota2) {
            return 1;
        }
        if (nota1 > nota2) {
            return -1;
        }
        return 0;

	}
}
