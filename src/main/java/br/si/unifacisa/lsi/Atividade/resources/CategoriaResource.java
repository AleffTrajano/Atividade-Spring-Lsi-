package br.si.unifacisa.lsi.Atividade.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categoria")
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public String lista() {
		return "Rest funcionando";
	}

}
