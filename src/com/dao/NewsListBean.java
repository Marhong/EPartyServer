package com.dao;
import java.sql.SQLException;
import java.util.ArrayList;


public class NewsListBean {
	private static ArrayList<News> newsList; 

	public ArrayList<News> getNews() throws SQLException{
		NewsDao newsDao = new NewsDao();
		newsList = newsDao.newsList;
		return newsList;
	}
}
