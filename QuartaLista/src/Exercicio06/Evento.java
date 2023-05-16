package Exercicio06;

import java.util.ArrayList;

public class Evento {
	protected ArrayList<Ingresso> ingressos;
	protected int ingressosVendidos;
	public Evento(int ingressoN, int ingressosVip) {
		ingressos = new ArrayList<Ingresso>();
		for (int i = 0; i < ingressoN; i++) {
			ingressos.add(new Ingresso());
		}
		for (int i = 0; i < ingressosVip; i++) {
			ingressos.add(new IngressoVIP());
		}

	}

	public void venderIngresso(Ingresso ingresso) {
		for (int i = 0; i < ingressos.size(); i++) {
			if (ingresso.tipo == "vip"  && ingressos.get(i).tipo == "vip") {
				ingressos.remove(i);
				this.ingressosVendidos++;
			}
			if (ingresso.tipo == "padrao" && ingressos.get(i).tipo == "padrao") {
				ingressos.remove(i);
				this.ingressosVendidos++;
			}
			i = ingressos.size();
		}
	}
	
	public int computarValores() {
		int valorTotal = 0;
		for(Ingresso ingresso : ingressos) {
			valorTotal += ingresso.valor;
		}
		return valorTotal;
	}

}
