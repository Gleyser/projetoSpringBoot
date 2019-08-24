package psoft.lab1.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import psoft.lab1.service.DisciplinaService;
import psoft.lab1.disciplinas.Disciplina;
import psoft.lab1.disciplinas.Disciplinas;
import psoft.lab1.disciplinas.RankingDeDisciplinas;

@RestController
public class DisciplinaController {

	@Autowired
	private DisciplinaService disciplinaService;
	
	@PostMapping("/v1/disciplinas")
	public ResponseEntity<Disciplina> addDisciplina(@RequestBody Disciplina disciplina){
		return new ResponseEntity<Disciplina>(disciplinaService.addDisciplina(disciplina), HttpStatus.OK);
	}	
	
	@RequestMapping("/v1/disciplinas/{id}")
	public ResponseEntity<Disciplina> getDisciplina(@PathVariable int id) {
		try {
			return new ResponseEntity<Disciplina>(disciplinaService.getDisciplina(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping("/v1/disciplinas")
	public ResponseEntity<RankingDeDisciplinas> getDisciplinas() {
		return new ResponseEntity<RankingDeDisciplinas>(disciplinaService.getDisciplinas(), HttpStatus.OK);
	}
	
	@PutMapping("/v1/disciplinas/{id}/nome")
	public ResponseEntity<Disciplina> setNomeDisciplina(@PathVariable int id, @RequestBody Disciplina nome) {
		try {
			return new ResponseEntity<Disciplina>(disciplinaService.setNomeDisciplina(id, nome), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/v1/disciplinas/{id}/nota")
	public ResponseEntity<Disciplina> setNotaDisciplina(@PathVariable int id, @RequestBody Disciplina nota) {
		try {
			return new ResponseEntity<Disciplina>(disciplinaService.setNotaDisciplina(id, nota), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/v1/disciplinas/{id}")
	public ResponseEntity<Disciplina> deleteNota(@PathVariable int id) {
		try {
			return new ResponseEntity<Disciplina>(disciplinaService.deleteDisciplina(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping("/v1/disciplinas/ranking")
	public ResponseEntity<RankingDeDisciplinas> getRankingDisciplinas() {
		return new ResponseEntity<RankingDeDisciplinas>(disciplinaService.getRankingDisciplinas(), HttpStatus.OK);
	}
}
