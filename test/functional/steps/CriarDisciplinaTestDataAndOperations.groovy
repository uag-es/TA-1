package steps

import ta.Discipline
import ta.DisciplineController

class CriarDisciplinaTestDataAndOperations{
	
	static public void CriarDisciplina(String disciplina, Date data, String professor){
		def adicionar = new DisciplineController()
		adicionar.params << [discipline: disciplina, classTime:data, Professor: professor]
		adicionar.criarSalvarDisciplina()
		adicionar.response.reset()
	}
}
