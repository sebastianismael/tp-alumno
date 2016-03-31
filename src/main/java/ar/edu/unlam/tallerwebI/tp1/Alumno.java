package ar.edu.unlam.tallerwebI.tp1;

public class Alumno {

	private Integer nota1 = 0;
	private Integer nota2 = 0;

	public void calificarPrimerParcial(Integer nota) {
		this.nota1 = nota;
	}

	public void calificarSegundoParcial(Integer nota) {
		this.nota2 = nota;
	}

	public void setNota1(Integer nota1) {
		this.nota1 = nota1;
	}

	public Integer getNota2() {
		return nota2;
	}

	public int getPrimerParcial() {
		return this.nota1;
	}

	public int getSegundoParcial() {
		return this.nota2;
	}

	public boolean estaAprobado() {
		if (this.nota1 >= 4 && this.nota2 >= 4) {
			return true;
		}
		return false;
	}

	public boolean estaPromocionado() {
		if (this.nota1 >= 7 && this.nota2 >= 7) {
			return true;
		}
		return false;
	}
}
