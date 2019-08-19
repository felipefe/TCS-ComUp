package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.UsuarioDao;
import model.Perfil;
import model.Usuario;
import util.FacesUtil;

@ManagedBean
@ViewScoped
public class CadastroUsuarioBean {

	private Usuario usuario;
	
	private Perfil perfis[] = Perfil.values() ;
	
	private UsuarioDao usuarioDao;
	
	public void inicializar() {
		
		usuario = new Usuario();
		
		usuarioDao = new UsuarioDao();
	}
	
	public void salvar() {
		
		usuario = usuarioDao.salvar(usuario);
		
		if(usuario != null) {
			FacesUtil.addInfoMenssage("Cadastrado com sucesso");			
			usuario = new Usuario();
		}else {
			FacesUtil.addErrorMenssage("Erro ao salvar");
		}
		
	}	
		
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Perfil[] getPerfis() {
		return perfis;
	}
			
}
