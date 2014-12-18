class Pintxo {
	private int id;
	private String nombre;
	private String[] ingredientes;
	private int tipo; // 1: Basico 2:Selecto

	//set ************************
	public void setId(int dato){
		this.id = dato;
	}
	public void setNombre(String dato){
		this.nombre = dato;
	}
	public void setIngredientes(String[] dato){
		this.ingredientes = dato;
	}
	public void setTipo(int dato){
		this.tipo = dato;
	}
	//get *********************+

	public int getId(){
		return this.id;	
	}
	public String getNombre(){
		return this.nombre;
	}
	public String[] getIngredientes(){
		return this.ingredientes;
	}
	public int getTipo(){
		return this.tipo;
	}

//1: Tortilla patata, ...
//2: Foie,...

}