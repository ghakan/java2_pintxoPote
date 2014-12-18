import java.util.ArrayList;

class Bar {
	private int id;
	private String nombre;
	private String direccion;
	private ArrayList<Pintxo> pintxos;
	private ArrayList<Pote> potes;

	//set ******************************
	public void setId(int dato){
		this.id = dato;
	}
	public void setNombre(String dato){
		this.nombre = dato;
	}
	public void setDireccion(String dato){
		this.direccion = dato;
	}
	public void setPintxos(ArrayList<Pintxo> dato){
		this.pintxos = dato;
	}
	public void setPotes(ArrayList<Pote> dato){
		this.potes = dato;
	}
	//get *****************************
	public int getId(){
		return this.id;
	}
	public String getNombre(){
		return this.nombre;
	}
	public String getDireccion(){
		return this.direccion;
	}
	public ArrayList<Pintxo> getPintxos(){
		return this.pintxos;
	}
	public ArrayList<Pote> getPote(){
		return this.potes;
	}

}