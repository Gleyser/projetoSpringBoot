package psoft.lab1.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import psoft.lab1.disciplinas.Disciplina;
import psoft.lab1.disciplinas.DisciplinaComparator;
import psoft.lab1.disciplinas.RankingDeDisciplinas;

@Service
public class DisciplinaService {
	private Disciplina disciplina = new Disciplina("lalala", 0);
	private HashMap<Integer, Disciplina> disciplinas = new HashMap<Integer, Disciplina>();
	
	public Disciplina addDisciplina(Disciplina disciplina2) {
		this.disciplina = disciplina2;
		this.disciplinas.put(disciplina2.getId(), disciplina2);	
		return this.disciplina;	
				
	}

	public Disciplina getDisciplina(int id) throws Exception {
		if (this.disciplinas.containsKey(id)) {
			Disciplina disciplina3 = this.disciplinas.get(id);
			return disciplina3;
		}
		
		throw new Exception("disciplina nao encontrada");
	}

	public RankingDeDisciplinas getDisciplinas() {
		Collection<Disciplina> disciplinas = this.disciplinas.values();
		ArrayList<Disciplina> lista1 = new ArrayList<Disciplina>();
		for (Disciplina d : disciplinas) {
			lista1.add(d);
		}
		RankingDeDisciplinas disciplinas3 = new RankingDeDisciplinas();
		disciplinas3.setDisciplinas(lista1);
		return disciplinas3;
		
		
	}

	public Disciplina setNomeDisciplina(int id, Disciplina nome) throws Exception {
		if (this.disciplinas.containsKey(id)) {
			Disciplina disciplina3 = this.disciplinas.get(id);
			this.disciplina = nome;
			disciplina3.setNome(disciplina.getNome());
			return disciplina3;
		}
		
		throw new Exception("disciplina nao encontrada");
	}

	public Disciplina setNotaDisciplina(int id, Disciplina nota) throws Exception {
		if (this.disciplinas.containsKey(id)) {
			Disciplina disciplina3 = this.disciplinas.get(id);
			this.disciplina = nota;
			disciplina3.setNota(disciplina.getNota());
			return disciplina3;
		}
		
		throw new Exception("disciplina nao encontrada");
	}

	public Disciplina deleteDisciplina(int id) throws Exception {
		if (this.disciplinas.containsKey(id)) {
			Disciplina disciplina3 = this.disciplinas.remove(id);
			return disciplina3;
		}
		
		throw new Exception("disciplina nao encontrada");
	}

	public RankingDeDisciplinas getRankingDisciplinas() {
		
		Collection<Disciplina> disciplinas = this.disciplinas.values();
		ArrayList<Disciplina> lista1 = new ArrayList<Disciplina>();
		for (Disciplina d : disciplinas) {
			lista1.add(d);
		}
		Collections.sort(lista1, new DisciplinaComparator());
		RankingDeDisciplinas disciplinas3 = new RankingDeDisciplinas();
		disciplinas3.setDisciplinas(lista1);
		return disciplinas3;
	}
	
	

}
