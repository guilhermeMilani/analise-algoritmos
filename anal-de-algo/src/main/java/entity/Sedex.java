package entity;

public class Sedex implements TipoEntrega{

	@Override
	public double calcularFrete(double peso) throws Exception {
		if (peso <= 0.5) {
			return 12.50;
		}else if(peso <= 1) {
			return 20;
		}
		else {
			 double pesoSobra = peso - 1;
			 double valorAdicional = (pesoSobra / 0.1) * 1.5; 
			 double valorFinal = 46.50 + valorAdicional;	
			 return valorFinal;	 
		}
	}

}
