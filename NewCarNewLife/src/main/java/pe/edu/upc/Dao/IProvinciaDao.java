package pe.edu.upc.Dao;

import java.util.List;

import pe.edu.upc.Entities.Provincia;

public interface IProvinciaDao {

	public void insert(Provincia p);

	List<Provincia> list();

}
