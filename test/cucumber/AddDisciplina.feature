Feature: adicionar disciplina
	As a professor
	I want to adicionar uma nova disciplina
	So that eu adiciono uma nova disciplina
	
	Scenario: adicionar nova disciplina
		Given eu estou na pagina de adicionar disciplina
		When eu digito o nome da nova disciplina "POO", a data de inicio das aula "20/08/2018" e professor "thais"
		And eu clico no botao
		Then eu vejo os detalhes da disciplina "POO" 