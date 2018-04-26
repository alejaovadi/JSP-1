package convencion.dao;

import java.sql.SQLException;

import convencion.model.Juego;
import convencion.util.Conexion;

public class JuegoDaoMySQL implements JuegoDao {
	private Conexion cn;

	@Override
	public Juego obtener(String nick) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertar(Juego juego) {
		// TODO Auto-generated method stub
		try {
			String consulta = "INSERT INTO juego (nick, nivel, puntaje) VALUES  ('"+juego.getNickName()+"', "+ 
		 			"'" +juego.getNivel()+"','" + juego.getPuntaje()+"')";
			System.out.println(consulta);
 		   cn.insert(consulta);

 		    
 		  } catch (SQLException e) {
 		            System.out.println(e.getMessage());
 		   //JOptionPane.showMessageDialog(null, "No se Registro la persona");
 		  }
		
	}

	@Override
	public void actualizar(Juego juego) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Juego juego) {
		// TODO Auto-generated method stub
		
	}

}
