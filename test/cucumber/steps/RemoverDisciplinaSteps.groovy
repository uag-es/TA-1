package steps

import cucumber.api.PendingException
import ta.Discipline
import steps.RemoverDisciplinaTestDataAndOperations
import ta.DisciplineController
import steps.CriarDisciplinaTestDataAndOperations
import java.util.Date

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

String disciplinaTemp

Given(~/^o sistema possui um disciplina com nome "(.*?)" e lecionada pelo professor "(.*?)"$/) { String dis, String prof ->
	Date data = new Date()
	data.format("dd/MM/yyyy")
	CriarDisciplinaTestDataAndOperations.CriarDisciplina(dis,data, prof) 
}

When(~/^eu removo a disciplina "(.*?)"$/) { String disciplina ->
	disciplinaTemp = disciplina
	Discipline disciplinaTeste = new Discipline()
	disciplinaTeste = Discipline.findByDiscipline(disciplina)
	RemoverDisciplinaTestDataAndOperations.RemoverDisciplina(disciplinaTeste)
}

Then(~/^o sistema removeu corretamente a disciplina$/) { ->
	assert Discipline.findByDiscipline(disciplinaTemp) == null
}