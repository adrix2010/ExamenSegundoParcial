

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**tterns = {"/ServletMenu"})
public class ServletTriangulo
 *
 * @author Alumno
 */
@WebServlet(urlPatterns = {"/ServletTriangulo"})
public class ServletTriangulo extends HttpServlet {
     int base,altura,lado,areaT,perimetroT;

    public void doPost(HttpServletRequest peticion, HttpServletResponse respuesta)
            throws ServletException, IOException {
        base= Integer.parseInt(peticion.getParameter("base"));
        altura = Integer.parseInt(peticion.getParameter("altura"));
        lado = Integer.parseInt(peticion.getParameter("lado"));
        areaT= (base * altura)/2;
        perimetroT = lado * 3;
        PrintWriter disparador = new PrintWriter(respuesta.getOutputStream());
        disparador.println("<html>");
        disparador.println("<head><title>Triangulo</head>>/head>");
        disparador.println("<h1>Triangulo<H1>");
        disparador.println("<p><center>"+ "tu area es de " + areaT + "</center></p>");
        disparador.println("<br/>");
        disparador.println("<br/>");
        disparador.println("<p><center>"+ "tu perimetro  es de " + perimetroT + "</center></p>");
        disparador.println("<br/>");
        disparador.println("<br/>");
        disparador.println("</body></html>");
        disparador.close();
    }
}
