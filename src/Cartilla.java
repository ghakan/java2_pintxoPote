class Cartilla {
private boolean[] sellos; //array de 10, para guardar los sellos, cada, item sera un bar

//metodo sellar
	public void setSellos(boolean[] dato){
		/*Cuando se llega hay 6 sellos, los siguientes pintxo potes, 
		tienen un descuento del %25. Cuando lleguen a 8 sellos, 
		los siguientes pintxo potes tienes un descuento del %50. 
		Si completan toda la cartilla, los siguientes pintxos gratis.*/
		this.sellos = dato; 
	}
//metodo devolver dto correspondiente
	public boolean[] getSellos(){
		return this.sellos;
	}

}