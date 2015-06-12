package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/step09/test05")
public class Test05Servlet extends HttpServlet {
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    // POST 요청으로 들어오는 한글 파라미터 값은 다음과 같이
    // getParameter()를 최초로 호출하기 전에 문자셋을 지정해야 한다.
    req.setCharacterEncoding("UTF-8");
    String name = req.getParameter("name");
    String age = req.getParameter("age");
    
    resp.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = resp.getWriter();
    out.println("name:" + name);
    out.println("age:" + age);
    
  }
}













