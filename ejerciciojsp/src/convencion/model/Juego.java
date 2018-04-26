package convencion.model;

import java.io.Serializable;

public class Juego implements Serializable {
	
	private String nickName;
	private int nivel;
	private int puntaje;
	
	
	
	
	public Juego(){
		
	}
	
	public Juego(String nickName, int nivel, int puntaje) {
		super();
		this.nickName = nickName;
		this.nivel = nivel;
		this.puntaje = puntaje;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
	

}
