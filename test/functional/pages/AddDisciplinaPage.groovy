package pages

import java.util.Date;
import geb.Page

class AddDisciplinaPage extends Page {
	static url = "discipline/create"
    def titulo = "Create Discipline"
   
    static at = {
	    title ==~ titulo
    }
   
    def criarDisciplina(String nomeDisciplina, String dataInicioAula, String professor){
	   $("form").discipline = nomeDisciplina
	   $("select", name:"applicationDate").click()
	   $("select", name:"applicationDate").value(dataInicioAula)
	   $("form").professor = professor
	}
	
	def botaoCriar(){
		$("input", name: "create").click()
	}
}