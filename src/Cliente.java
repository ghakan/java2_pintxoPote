class Cliente {

	private int id;
	private String nombre; //Guardar Nombre Apellidos
	private Cartilla cartilla;

	//set **************************
	public void setId(int dato){
		this.id = dato;
	}
	public void setNombre(String dato){
		this.nombre = dato;
	}
	public void setCartilla(Cartilla dato){
		this.cartilla = dato;
	}
	//get **************************
	public int getId(){
		return this.id;
	}
	public String getNombre(){
		return this.nombre;
	}
	public Cartilla getCartilla(){
		return this.cartilla;
	}
}