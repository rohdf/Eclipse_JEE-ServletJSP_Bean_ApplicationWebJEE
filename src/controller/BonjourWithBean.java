package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.BonjourBean;

public class BonjourWithBean extends HttpServlet {
 private static final long serialVersionUID = 1L;

 /**
  * Default constructor.
  */
 public BonjourWithBean() {

 }

 /**
  * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
  *      response)
  */
 protected void doGet(HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException {

  response.setContentType("text/html");

  String nom = request.getParameter("nom");

  BonjourBean bonjourBean = new BonjourBean();

  bonjourBean.setNom(nom);

  // sauvegarde le bean dans la request
  request.setAttribute("bonjour", bonjourBean);

  // you now can forward to some view
  request.getRequestDispatcher("/view/ViewBonjourWithBean.jsp").forward(request, response);

 }

}