package threeway.projeto.lab2;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@SuppressWarnings("deprecation")
@ManagedBean
@ViewScoped
public class HelloWorldBean implements Serializable{

private static final long serialVersionUID = 6949827676782977015L;

private String nome;

public String getNome() {
	return nome;
}

public void setNome(String nome){	
	this.nome = nome;
}
	
}
