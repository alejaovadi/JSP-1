package convencion.dao;

import convencion.model.Juego;
import convencion.model.Participante;

public interface JuegoDao {
	
	public Juego obtener(String nick);
	public void insertar(Juego juego);
	public void actualizar(Juego juego);
	public void eliminar(Juego juego);

}
