package discos;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import discos.dao.IUsuarioDAO;
import discos.model.Usuario;

@SpringBootTest
class DiscosApplicationTests {

	@Autowired
	private IUsuarioDAO dao;
	
	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void crearUsuario() {
	
		Usuario us = new Usuario();
		us.setIdUsuario(1);
		us.setUsername("duetodavid");
		us.setPassword(bcrypt.encode("DuetoD4vid"));
		us.setEnabled(true);
		
		Usuario retorno = dao.save(us);		
		
		assertTrue(retorno.getPassword().equalsIgnoreCase(us.getPassword()));
	}

}
