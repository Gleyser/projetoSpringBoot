package psoft.lab1.disciplinas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;

public class RankingDeDisciplinas {
	
	private List<Disciplina> disciplinas;
	
	@JsonCreator
	public RankingDeDisciplinas() {
		this.disciplinas = new ArrayList<Disciplina>();
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
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
		RankingDeDisciplinas other = (RankingDeDisciplinas) obj;
		if (disciplinas == null) {
			if (other.disciplinas != null)
				return false;
		} else if (!disciplinas.equals(other.disciplinas))
			return false;
		return true;
	}
	
	

}
