package steps

import ta.Discipline
import ta.DisciplineController
import java.util.Date

class RemoverDisciplinaTestDataAndOperations{
	
	static public void RemoverDisciplina(Discipline instancia){
		def remove = new DisciplineController()
		remove.delete(instancia)
		remove.response.reset()
	}
}
