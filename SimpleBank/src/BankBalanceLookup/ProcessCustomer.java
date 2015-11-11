package BankBalanceLookup;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class ProcessCustomer
 */
@WebServlet("/ProcessCustomer")
public class ProcessCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessCustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Double balance=0.0;
		String id= request.getParameter("id");
		String Name="";
		
		CustomerSimpleMap CSM= new CustomerSimpleMap();
		Customer cust=CSM.findCustomer(id);
		if(cust!=null)
		{
		balance=cust.getBalance();
		Name=cust.getName();
		}
		System.out.println(balance);
		HttpSession session = request.getSession();
		session.setAttribute("id", id);
		session.setAttribute("Balance", balance.toString());
		session.setAttribute("Name", Name);
		double limit=10000;
		
		 if( cust==null)
		    {
			 PrintWriter out = response.getWriter();
			 out.println("<script type=\"text/javascript\">");
			   out.println("alert('Wrong ID, Re-enter');");
			   out.println("location='Index.html';");
			   out.println("</script>");
			 
		    }
		    else if (balance < 0 && balance<limit)
		    {
		    	RequestDispatcher rd = request.getRequestDispatcher("NegBalance.jsp");
		    	
	            rd.forward(request, response);
		    }
		   /* else if (balance>limit)
		    {
		    	PrintWriter out = response.getWriter();
				 out.println("<script type=\"text/javascript\">");
				   out.println("alert('Balance is mot ');");
				   out.println("location='Indes.html';");
				   out.println("</script>");
		    }*/
		 
		    else 
		    { 
		    	RequestDispatcher rd = request.getRequestDispatcher("RegBalance.jsp");
	    	rd.forward(request, response);
		    	
		    }

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
