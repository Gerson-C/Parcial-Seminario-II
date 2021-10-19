package discos.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import discos.model.Disco;
import discos.service.IDiscoService;

@RestController
@RequestMapping("/ver_disco")
public class VerDiscosController {
	@Autowired
	private IDiscoService service;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE) public
	 ResponseEntity<List<Disco>> listar(){ 
		return new ResponseEntity<List<Disco>>(service.listar(), HttpStatus.OK); 
	 }
}
