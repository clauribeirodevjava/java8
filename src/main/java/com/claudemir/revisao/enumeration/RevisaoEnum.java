package com.claudemir.revisao.enumeration;

public class RevisaoEnum {
	
	public static void main(String[] args) {
		escolherOpcao(OpcoesMenu.SALVAR);
		MarcasEnum hp = MarcasEnum.HP;
		MarcasEnum samsung = MarcasEnum.SAMSUNG;
		System.out.println("Nome da Marca = "+hp.ordinal()); //ordinal Enum começa em zero
		System.out.println("Nome da Marca = "+samsung.ordinal());
		
		//percorrer todos os enuns.
		
		for(OpcoesMenu op : OpcoesMenu.values()) {
			System.out.println("Menu "+ op + " = " + op.getValor());
		}
		
		
		
		
	}
	
	public static void escolherOpcao(OpcoesMenu menu) {
		if(menu.equals(OpcoesMenu.ABRIR)) {
			System.out.println("Abrindo o arquivo");
		} else if(menu.equals(OpcoesMenu.SALVAR)) {
			System.out.println("Salvando o arquivo");
		}
	}
	
	public enum Cartas {
		J(11),Q(12),K(13),A(14);
		
		public int valorCarta;
		
		Cartas(int valorCarta) {
			this.valorCarta  = valorCarta;
		}
		
	}
	
	public enum OpcoesMenu {
		SALVAR(1), IMPRMIR(2), ABRIR(3), VISUALIZAR(4), FECHAR(5);
		
		private final int valor;
		
		private OpcoesMenu(int valor) {
			this.valor = valor;
		}
		public int getValor() {
			return valor;
		}
	}
	
	public enum MarcasEnum {
		AMAZON, DELL, HP, TOSHIBA, LG, SAMSUNG;
		}

}
	