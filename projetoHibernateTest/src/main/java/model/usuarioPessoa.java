package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class usuarioPessoa {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id ;
	
	private String nome;
	private String email;
	private String login;
	private int idade;
	private String cpf;
	
	@OneToMany(mappedBy = "usuarioPessoa")
	private List<TelefoneUser>telefoneUsers;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	
	public List<TelefoneUser> getTelefoneUsers() {
		return telefoneUsers;
	}
	public void setTelefoneUsers(List<TelefoneUser> telefoneUsers) {
		this.telefoneUsers = telefoneUsers;
	}
	@Override
	public String toString() {
		return "usuarioPessoa [id=" + id + ", nome=" + nome + ", email=" + email + ", login=" + login + ", idade="
				+ idade + ", cpf=" + cpf + "]";
	}
	
	
	
	
}
