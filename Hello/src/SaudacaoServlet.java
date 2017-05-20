import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaudacaoServlet
 */
@WebServlet("/SaudacaoServlet")
public class SaudacaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SaudacaoServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();	
		out.println("<html>" + "<head><title>Hello</title></head>");
		
		out.println("<body bgcolor=\"#ffffff\">" + "<h2>Olá, meu nome é Servlet.Meu hobby é Futebol. Qual é o seu nome e Hobby?</h2>"
				+ "<form method=\"get\">" + "<input type=\"text\" name=\"nome\" size=\"25\">" + "<p></p>"
				+ "<form method=\"get\">" + "<input type=\"text\" name=\"hobby\" size=\"25\">" + "<p></p>"				
				+ "<input type=\"submit\" value=\"Enviar\">" + "<input type=\"reset\" value=\"Resetar\">" + "</form>");
		
		String nome = request.getParameter("nome");
		String hobby = request.getParameter("hobby");
		
		if ((nome != null) && (nome.length() > 0)) {
			out.println("<h2>Olá, " + nome + "!, meu hobby é " + hobby + ".");
		}
		out.println("</body></html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
