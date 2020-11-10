package projeto;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.preojeto.model.models.Usuario;
import com.preojeto.model.service.UsuarioService;

public class UsuarioTest {
	
	@Test
	public void salvarUsuarioBancoDadosTest() {
		
		Usuario usuario = new Usuario();
		
		//usuario.setId(1);
		usuario.setUsername("roberto carlos da silva");
		usuario.setPassword("123456");
		usuario.setEmail("roberto@carlos.silva.com.br");
		usuario.setAtivo(false);
		usuario.setAdmin(false);
		
		
		UsuarioService usuarioService = new UsuarioService();
		
		usuarioService.save(usuario);
		
		System.out.println("Gravando usuario no banco de dados");
		
		assertTrue(true);
		
		
		
		
		
	}
	
}
