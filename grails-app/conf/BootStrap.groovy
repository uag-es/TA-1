import ta.ReportController
import ta.Student
import ta.Discipline

class BootStrap {

     def init = {servletContext ->
	
		def data1 = new Date()
		def poo = new Discipline(
				discipline: "POO",
				classTime: data1,
				professor: "thais"
			)
	    poo.save(failOnError: true)   
    
		def data2 = new Date()
		def aed = new Discipline(
				classTime: data2,
				discipline: "aed",
				professor: "igor"
			)
		aed.save(failOnError: true)	
		
		def aluno1 = new Student(
					name: "geo",
					login: "l",
					criteriaAndEvaluations: []
					)
		aluno1.save(failOnError:true)
	}
	 
    def destroy = {
    }
}
