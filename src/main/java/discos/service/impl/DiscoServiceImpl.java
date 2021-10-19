package discos.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import discos.dao.IDiscoDAO;
import discos.model.Disco;
import discos.service.IDiscoService;

@Service
public class DiscoServiceImpl implements IDiscoService {

	@Autowired
	private IDiscoDAO dao;	
	
	@Override
	public Disco registrar(Disco t) {
		return dao.save(t);
	}

	@Override
	public Disco modificar(Disco t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.deleteById(id);		
	}

	@Override
	public Optional<Disco> listarPorId(int id) {
		return dao.findById(id);
	}

	@Override
	public List<Disco> listar() {
		return dao.findAll();
	}

}
