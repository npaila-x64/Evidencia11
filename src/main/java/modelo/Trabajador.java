package modelo;

public class Trabajador extends Persona {
	private String isapre;
	private String fonasa;
	private Empresa empresa;

	public Trabajador() {
		nombre = "";
		apellido = "";
		rut = "";
		isapre = "";
		fonasa = "";
	}

	public String getIsapre() {
		return isapre;
	}

	public void setIsapre(String isapre) {
		this.isapre = isapre;
	}

	public String getFonasa() {
		return fonasa;
	}

	public void setFonasa(String fonasa) {
		this.fonasa = fonasa;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
}