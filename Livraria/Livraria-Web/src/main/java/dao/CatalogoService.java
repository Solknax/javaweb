package dao;
import java.util.List;
import model.Livro;

public class CatalogoService {

	Livro livro = null;
	List<Livro> livros  = null;	
	
	public List<Livro> consultar(String titulo)
	{
		if(	titulo == null){titulo = " ";}
		System.out.println("Pesquisa: "+titulo);
		LivroDao dao = new LivroDao();
		livros = dao.consultar(titulo);
		
		if(livros.size() <= 0)
		{
			System.out.println("Livro não localizado");
		}		
		return	livros;
	}
	
	public Livro verLivro(Integer codigo)
	{
		LivroDao dao = new LivroDao();
		livro =  dao.consultar(codigo);
		return livro;
	 }
		
}
