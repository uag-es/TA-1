Feature: Remover uma disciplina
	As a professor
	I want to remover uma disciplina do sistema
	So that eu removi a disciplina
	
	Scenario:remover uma disciplina do sistema
		Given o sistema possui um disciplina com nome "POO" e lecionada pelo professor "Thais"
		When eu removo a disciplina "POO"
		Then o sistema removeu corretamente a disciplina 