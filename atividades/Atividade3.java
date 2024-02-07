package atividades;

public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variáveis
		float salarioBruto = 2000f;
		float adicionalNoturno = 500f;
		float horasExtra = 100f;
		float descontos = 200f;
		
		//Calculando o salário líquido
		float salarioLiquido = ((salarioBruto + adicionalNoturno + (horasExtra * 5)) - descontos);
		
		//Saída
		System.out.println("O salário líquido equivale a: " + salarioLiquido);

	}

}
