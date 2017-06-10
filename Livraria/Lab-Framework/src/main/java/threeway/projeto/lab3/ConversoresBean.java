package threeway.projeto.lab3;

import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;


@SuppressWarnings("deprecation")
@ManagedBean(name="conversoresBean")
@ViewScoped

public class ConversoresBean implements Serializable{
	
	private	static final long serialVersionUID = -900381764696451448L;	
	private Date dataNascimento;	
	private Integer peso;	
	private String celsiusToFahrenheit;
	
	public Date getDataNascimento() {
		return	dataNascimento;
	}
	
}
