package com.claudemir.evitar.ifs;

import com.claudemir.evitar.ifs.Funcionario.Cargo;

public class Venda {

	private final Funcionario funcionario;
	private final double valor;

	public Venda(Funcionario funcionario, double valor) {
		super();
		this.funcionario = funcionario;
		this.valor = valor;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public double getValor() {
		return valor;
	}

	public double calculaComissaoComIfs() {

		double comissao = 0.0;

		Cargo cargo = this.funcionario.getCargo();

		if (cargo.equals(Cargo.ATENDENTE)) {
			comissao = valor * 0.1;
		} else if (cargo.equals(Cargo.VENDEDOR)) {
			comissao = valor * 0.15 + 5;
		} else if (cargo.equals(Cargo.GERENTE)) {
			comissao = valor * 0.20 + 10;
		} else if (cargo.equals(Cargo.AJUDANTE)) {
			comissao = valor * 0.08 + 1;
		} else if (cargo.equals(Cargo.RECEPCIONISTA)) {
			comissao = valor * 0.05;
		} else if (cargo.equals(Cargo.DIRETOR)) {
			comissao = valor * 0.25 + 20;
		}

		return comissao;
	}
	
	
	public double calculaComissao() {
		double comissao = 0.0;
		Cargo cargo  = funcionario.getCargo();
		
		comissao = cargo.calculaComissao(this.valor);
		
		return comissao;
	}
}
