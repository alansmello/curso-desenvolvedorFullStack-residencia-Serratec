
public class Medico {
	
	private String crm;
	private String nome;
	private double salario;
	private double valorConsulta;
	private static int numeroMedico;
	
	
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
		this.numeroMedico +=1;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	
	public double getValorConsulta() {
		return valorConsulta;
	}
	public void setValorConsulta(double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}
	public static int getNumeroMedico() {
		return numeroMedico;
	}
	
	public Medico() {
		
	}
	public Medico(String crm, String nome, double valorConsulta) {
		setCrm(crm);
		setNome(nome);
		setValorConsulta(valorConsulta);
	}
	
	public void pagamentoDinheiro() {
		this.salario += this.valorConsulta; 
	}
	public void pagamentoPlano() {
		this.salario += (this.valorConsulta * 0.7); 
	}
	
	public void exibirDados() {
		System.out.println("*******************************************");
		System.out.println("crm: " + getCrm());
		System.out.println("nome: " +getNome());
		System.out.printf("salario: %.2f \n" , getSalario()) ;
		System.out.printf("valor da consulta: %.2f \n" , getValorConsulta());
		System.out.println("*******************************************");

		
	}
}
