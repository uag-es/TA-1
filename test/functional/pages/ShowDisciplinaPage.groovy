package pages

import geb.Page

class ShowDisciplinaPage extends Page {
	static url = "/discipline/show"
	def titulo = "Show Discipline"
   
	static at = {
		title ==~ titulo
	}
	
	def exibirDisciplina(String disciplina){
	   def html = $('html').getAttribute("innerHTML")
	   assert html.contains(disciplina)
	}
}