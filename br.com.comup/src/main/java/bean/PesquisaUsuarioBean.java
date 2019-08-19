package bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.UsuarioDao;
import model.Usuario;

@ManagedBean
@ViewScoped
public class PesquisaUsuarioBean {

	private Usuario usuario;
	
	private UsuarioDao usuarioDao;
	
	private List<Usuario> usuarios;
	
	public void inicializar() {
		
		usuario = new Usuario();
		usuarioDao = new UsuarioDao();
		
		usuarios = usuarioDao.listar();
	}
	
	public void excluir() {
		usuarioDao.deletar(usuario);
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	
}
