package com.claudemir.evitar.ifs;

public class Funcionario {
	
	private String nome;
	private double salario;
	private Cargo cargo;
	
	
	public Funcionario nome(String nome) {
		this.nome = nome;
		return this;
	}
	
	public Funcionario salario(double salario) {
		this.salario = salario;
		return this;
	}
	
	public Funcionario cargo(Cargo cargo) {
		this.cargo = cargo;
		return this;
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
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	public enum Cargo implements Comissao{
		ATENDENTE { @Override public double calculaComissao(double valor) { 
		    return valor * 0.1; } }, 

		VENDEDOR { @Override public double calculaComissao(double valor) { 
		    return valor * 0.15 + 5; } },

		GERENTE { @Override public double calculaComissao(double valor) { 
		    return valor * 0.20 + 10; } },

		AJUDANTE { @Override public double calculaComissao(double valor) { 
		    return valor * 0.08 + 1; } }, 

		RECEPCIONISTA { @Override public double calculaComissao(double valor) { 
		    return valor * 0.05; } }, 

		DIRETOR { @Override public double calculaComissao(double valor) { 
		    return valor * 0.25 + 20; } };
	}
}