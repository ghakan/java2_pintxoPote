class Pote {
	private int id;
	private String nombre;
	private int tipo; //1: Basico 2: Selecto

	//1: Agua, zurito, vino del año
	//2: Caña, refrescos, vino crianza
	// set ********************************
	public void setId(int dato){
		this.id = dato;
	}
	public void setNombre(String dato){
		this.nombre = dato;
	}
	public void setTipo(int dato){
		this.tipo = dato;
	}
	//get *********************************+
	public int getId(){
		return this.id;
	}
	public String getNombre(){
		return this.nombre;
	}
	public int getTipo(){
		return this.tipo;
	}

}