package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CommentServlet
 */
@WebServlet("/CommentServlet")
public class CommentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;Charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("[{\"newsId\":\"213222\",\"commentId\":\"233222\",\"userName\":\"��Ҫ�ɵĺ�ţ\",\"userImage\":\"http://img3.imgtn.bdimg.com/it/u=1886710691,71471626&fm=26&gp=0.jpg\",\"commentTime\":\"2017-03-08\",\"userComment\":\"����˵Щʲô������������˹���\",\"upvoteNumber\":\"3\"},{\"newsId\":\"213222\",\"commentId\":\"233223\",\"userName\":\"ϲ����è���㰡\",\"userImage\":\"http://img3.imgtn.bdimg.com/it/u=1886710691,71471626&fm=26&gp=0.jpg\",\"commentTime\":\"2017-03-08\",\"userComment\":\"����˵Щʲô������������˹���\",\"upvoteNumber\":\"3\"}]");
	}

}
