package psoft.lab1.disciplinas;

import java.util.Collection;
import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Disciplinas {
	private HashMap<Integer, Disciplina> disciplinas;
	
	@JsonCreator
	public Disciplinas() {
		this.disciplinas = new HashMap<Integer, Disciplina>();
	}

	public HashMap<Integer, Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(HashMap<Integer, Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public Collection<Disciplina> getValores() {
		return this.disciplinas.values();
	}	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((disciplinas == null) ? 0 : disciplinas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplinas other = (Disciplinas) obj;
		if (disciplinas == null) {
			if (other.disciplinas != null)
				return false;
		} else if (!disciplinas.equals(other.disciplinas))
			return false;
		return true;
	}
	
	
	
}
