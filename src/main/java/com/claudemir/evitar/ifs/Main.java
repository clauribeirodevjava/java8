package com.claudemir.evitar.ifs;

import com.claudemir.evitar.ifs.Funcionario.Cargo;

public class Main {
	
	public static void main(String[] args) {
		
		Venda venda0 = new Venda(new Funcionario().cargo(Cargo.ATENDENTE).nome("Claudemir").salario(200), 200);
		Venda venda1 = new Venda(new Funcionario().cargo(Cargo.VENDEDOR).nome("Claudemir").salario(200), 200);
		Venda venda2 = new Venda(new Funcionario().cargo(Cargo.GERENTE).nome("Claudemir").salario(200), 200);
		Venda venda3 = new Venda(new Funcionario().cargo(Cargo.AJUDANTE).nome("Claudemir").salario(200), 200);
		Venda venda4 = new Venda(new Funcionario().cargo(Cargo.RECEPCIONISTA).nome("Claudemir").salario(200), 200);
		Venda venda5 = new Venda(new Funcionario().cargo(Cargo.DIRETOR).nome("Claudemir").salario(200), 200);
		
		System.out.println(venda0.calculaComissao());

		System.out.println(venda1.calculaComissao());

		System.out.println(venda2.calculaComissao());

		System.out.println(venda3.calculaComissao());

		System.out.println(venda4.calculaComissao());

		System.out.println(venda5.calculaComissao());
	}

}
