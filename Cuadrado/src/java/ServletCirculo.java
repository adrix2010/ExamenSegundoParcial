
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**

 * @author mOLINERO MUÑOZ
 */
@WebServlet(urlPatterns = {"/ServletCirculo"})
public class ServletCirculo extends HttpServlet {
     int radio,areaC,perimetroC;

    public void doPost(HttpServletRequest peticion, HttpServletResponse respuesta)
            throws ServletException, IOException {
        radio = Integer.parseInt(peticion.getParameter("radio"));
       
        areaC= (int) (Math.PI*(radio*radio));
       perimetroC = (int) (Math.PI * (radio*2));
        PrintWriter disparador = new PrintWriter(respuesta.getOutputStream());
        disparador.println("<html>");
        disparador.println("<head><title>Triangulo</head>>/head>");
        disparador.println("<h1>Triangulo<H1>");
        disparador.println("<p><center>"+ "tu area es de " + areaC + "</center></p>");
        disparador.println("<br/>");
        disparador.println("<br/>");
        disparador.println("<p><center>"+ "tu perimetro  es de " + perimetroC + "</center></p>");
        disparador.println("<br/>");
        disparador.println("<br/>");
        disparador.println("</body></html>");
        disparador.close();
    }
}
