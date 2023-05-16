package Exercicio06;

public class Main {

	public static void main(String[] args) {
		Ingresso ingresso = new Ingresso();
		Ingresso ingressovip = new IngressoVIP();
		System.out.println(ingresso.toString());
		System.out.println(ingressovip.toString());
		Evento evento = new Evento(10,5);
		System.out.println(evento.computarValores());
		evento.venderIngresso(ingresso);
		System.out.println(evento.ingressosVendidos);
	}

}
