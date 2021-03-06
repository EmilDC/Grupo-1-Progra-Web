package pe.edu.upc.ServiceImpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.Dao.IpropietarioDao;
import pe.edu.upc.Entities.Propietario;
import pe.edu.upc.Service.IPropietarioService;

@Named
@RequestScoped
public class PropietarioService implements IPropietarioService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IpropietarioDao prDao;

	@Override
	public void insert(Propietario pr) throws Exception {
		// TODO Auto-generated method stub
		prDao.insert(pr);
	}

	@Override
	public List<Propietario> list() throws Exception {
		// TODO Auto-generated method stub
		return prDao.list();
	}

	@Override
	public void eliminar(int cpropietario) throws Exception {
		// TODO Auto-generated method stub
		prDao.eliminar(cpropietario);
	}

	@Override
	public void modificar(Propietario pr) throws Exception {
		// TODO Auto-generated method stub
		prDao.modificar(pr);
	}

	@Override
	public List<Propietario> buscarpornombre(Propietario pr) throws Exception {
		// TODO Auto-generated method stub
		return prDao.buscarpornombre(pr);
	}

}
