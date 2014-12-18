import java.util.ArrayList;
class Cuenta{

	private ArrayList<PintxoPote> cuenta;

	//metodos getter/setter
	public void setCuenta(ArrayList<PintxoPote> dato){
		this.cuenta = dato;
	}
	// metodo imprimir en pantalla
	public ArrayList<PintxoPote> getCuenta(){
		return this.cuenta;
	}

}