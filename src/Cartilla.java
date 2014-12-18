class Cartilla {
private boolean[] sellos; //array de 10, para guardar los sellos, cada, item sera un bar

//metodo sellar
	public void setSellos(boolean[] dato){
		this.sellos = dato;
	}
//metodo devolver dto correspondiente
	public boolean[] getSellos(){
		return this.sellos;
	}

}