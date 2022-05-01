import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Calculator extends HttpServlet{

        private static final long serialVersionUID = 1L;
        private Calculation cal;

        public void init() throws ServletException {
            cal = new Calculation();
        }

        public void doGet(HttpServletRequest request,
                          HttpServletResponse response)
                throws ServletException, IOException {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            String docType =
                    "<!DOCTYPE HTML>\n";
            String title = "Celsius to Fahrenheit";
            out.println(docType +
                    "<HTML>\n" +
                    "<HEAD><TITLE>" + title + "</TITLE>" +
                    "<LINK REL=STYLESHEET HREF=\"styles.css\">" +
                    "</HEAD>\n" +
                    "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                    "<H1>" + title + "</H1>\n" +
                    "  <P>Celcius " +
                    request.getParameter(Double.toString(celcius)) + "\n" +
                    "  <P>Fahrenheit: " +
                    Double.toString(cal.getFahrenheit(request.getParameter(Double.toString(celcius)))) +
                    "</BODY></HTML>");
        }


    }

