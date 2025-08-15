package entity;

public class Pac implements TipoEntrega{

	@Override
	public double calcularFrete(double peso) throws Exception {
		if (peso < 1) {
			return 10;
		}
		else if(peso < 2){
			return 15;
		}
		else {
			throw new Exception("");
		}
	}

}
