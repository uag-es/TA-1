package steps

import pages.*
import cucumber.api.groovy.EN
import cucumber.api.groovy.Hooks

this.metaClass.mixin(Hooks)
this.metaClass.mixin(EN)

Given(~/^eu estou na pagina de adicionar disciplina$/) { ->
	to AddDisciplinaPage
	at AddDisciplinaPage
}

When(~/^eu digito o nome da nova disciplina "(.*?)", a data de inicio das aula "(.*?)" e professor "(.*?)"$/) { String dis, String data, String prof ->
	page.criarDisciplina(dis, data, prof)
}

And(~/^eu clico no botao$/) { ->
	page.botaoCriar()
}

Then(~/^eu vejo os detalhes da disciplina "(.*?)"/) { String dis ->
	at ShowDisciplinaPage
	page.exibirDisciplina(dis)
}