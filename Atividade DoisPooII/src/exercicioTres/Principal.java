package exercicioTres;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate contratacao = LocalDate.now();
		Medico med1 = new Medico("1111", "Bob Esponja", "Ortopedista", "bob.esponja@dominio.com", 
				contratacao, 5468.79F);
		Medico med2 = new Medico("2222", "Lula Molusculo", "Cardiologista", "lula.molusculo@dominio.com", 
				contratacao, 5468.79F);
		Medico med3 = new Medico("3333", "Patrick", "Neurologista", "patrick.estrela@dominio.com", 
				contratacao, 5468.79F);
		Medico med4 = new Medico("4444", "Sr Sirigueijo", "Ortopedista", "sr.sirihueijo@dominio.com", 
				contratacao, 5468.79F);
		Medico med5 = new Medico("5555", "Sandy", "Urologista", "sandy@dominio.com", 
				contratacao, 5468.79F);
		
		Hospital hospital = new Hospital("Merces", "Manoel Goulart, 1578");
		
		hospital.adicionarMedico(med1);
		hospital.adicionarMedico(med2);
		hospital.adicionarMedico(med3);
		hospital.adicionarMedico(med4);
		hospital.adicionarMedico(med5);
		
		hospital.exibirMedicosAno(2022);
		
		System.out.println("_____________________________________");
		
		hospital.excluirMedico("1111");
		
		hospital.imprime();
		
	}

}
