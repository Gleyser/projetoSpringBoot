package psoft.lab1.disciplinas;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Disciplina {
	private int id;
	private String nome;	
	private double nota;

	@JsonCreator
	public Disciplina(String nome, double nota) {
		this.id = GeradorID.getProximoID();
		this.nome = nome;
		this.nota = nota;
	}	
		
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public double getNota() {
		return nota;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(nota);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Disciplina other = (Disciplina) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(nota) != Double.doubleToLongBits(other.nota))
			return false;
		return true;
	}
	
}
