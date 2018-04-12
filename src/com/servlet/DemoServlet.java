package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.News;
import com.dao.NewsDao;
import com.dao.NewsListBean;
import com.db.DBManager;

import jdk.nashorn.internal.parser.JSONParser;
import net.sf.json.util.JSONStringer;

/**
 * Servlet implementation class FirstSerclet
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private NewsListBean data = new NewsListBean();
    private ArrayList<News> newsList = new ArrayList<News>();
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		//String userName = request.getParameter("userName");
		response.setContentType("text/html;Charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("[{\"type\":\"0\",\"newsId\":\"213222\",\"title\":\"17岁高考生华山旅游身亡留言:吾去也，莫寻骸\",\"url\":\"http://10.22.60.179:8088/NewsClient/NewFile.jsp\",\"pubDate\":\"2017-03-08\",\"listImage\":\"http://img.mp.itc.cn/upload/20170130/4f8991870b0a4a6997f95a2dca8f2c61_th.jpeg\"},{\"type\":\"2\",\"newsId\":\"213234542\",\"title\":\"发过议会选举结束，马克龙阵营大获全胜\",\"url\":\"http://10.22.60.179:8088/NewsClient/NewFile.jsp\",\"pubDate\":\"2017-03-08\",\"listImage\":\"http://img.mp.itc.cn/upload/20170130/4f8991870b0a4a6997f95a2dca8f2c61_th.jpeg\"},{\"type\":\"0\",\"newsId\":\"213234542\",\"title\":\"发过议会选举结束，马克龙阵营大获全胜\",\"url\":\"http://10.22.60.179:8088/NewsClient/NewFile.jsp\",\"pubDate\":\"2017-03-08\",\"listImage\":\"http://img.mp.itc.cn/upload/20170130/4f8991870b0a4a6997f95a2dca8f2c61_th.jpeg\"}]");
//		try{
//			
//				NewsDao nd = new NewsDao();
//				if(nd.newsList == null){
//				out.print("there is a error");}
//				else{
//					out.println(nd.newsList.toString());
//				}
//		
////			String message ="";
//////			JSONParser
////			
////			JSONStringer stringer = new JSONStringer();
////			
////			
////			stringer.array();
////			for(int i=0;i<newsList.size();i++){
////				stringer.object();
////				stringer.key("title");
////				stringer.value(newsList.get(i).getTitle());
////				stringer.key("url");
////				stringer.value(newsList.get(i).getUrl());
////				stringer.key("pubDate");
////				stringer.value(newsList.get(i).getPubDate());
////				stringer.key("listImage");
////				stringer.value(newsList.get(i).getListImage());
////				stringer.endObject();
////			}
////			stringer.endArray();
////			
////			message = stringer.toString();
////		//String message =  user.run();
////		response.setContentType("text/html;Charset=utf-8");
////		
////		out.println(message);
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//		request.setAttribute("message", message);
//		request.getRequestDispatcher("/SecondServlet").forward(request, response);
	}
	
	public void destroy(){
		System.out.println("调用destroy()方法");
	}

}
