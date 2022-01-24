package springhibernate.app.entity;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
	
	private String nome;
    @Indexed(unique = true)
    private String email;
    private String tel;
    
	public User() {
		
	}	
	
	public User(String nome, String email, String tel) {
		this.nome = nome;
		this.email = email;
		this.tel = tel;
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}  
}
