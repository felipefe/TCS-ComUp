package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import dao.UsuarioDao;
import model.Usuario;
import util.FacesUtil;

@ManagedBean
@SessionScoped
public class LoginBean {

	private String login;
	
	private String senha;
	
	private UsuarioDao usuarioDao;
	
	public LoginBean() {
		usuarioDao = new UsuarioDao();
	}
	
	public String efetuarLogin() {
	
		Usuario usuario = usuarioDao.verificaLogin(login, senha);
		
		if(usuario == null) {
			FacesUtil.addErrorMenssage("Usuário ou senha inválidos!");
			
		}else if(usuario.isAtivo()) {
			
			HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
			
			session.setAttribute("usuarioLogado", usuario);
			
			
			return "/usuarios/cadastro-usuario?faces-redirect=true";
				
		}else {
			FacesUtil.addErrorMenssage("Usuário desativado!");
		}
		return "login";
//		return "login?faces-redirect=true";
		

		
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
