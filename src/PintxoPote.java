class PintxoPote {

	private Pintxo pintxo;
	private Pote pote;
	private double precio;

	//set **********************************
	public void setPintxo(Pintxo dato){
		this.pintxo = dato;
	}
	public void setPote(Pote dato){
		this.pote = dato;
	}
	public void setPrecio(double dato){
		this.precio = dato;
	}
	//get ***********************************
	public Pintxo getPintxo(){
		return this.pintxo;
	}
	public Pote getPote(){
		return this.pote;
	}
	public double getPrecio(){
		return this.precio;
	}
} 