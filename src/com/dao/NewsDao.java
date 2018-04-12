package com.dao;

import java.sql.SQLException;
import java.util.*;

import com.db.DBManager;

public class NewsDao {

	private  List<Map<String, String>> data = new ArrayList<Map<String,String>>();
	public  ArrayList<News> newsList ; 

	public NewsDao() throws SQLException {
	
		// TODO Auto-generated constructor stub
		DBManager dbManager = new DBManager();
		String sql = "select * from news";
		dbManager.loadDriver();
		this.data = dbManager.query(sql);
		newsList = new ArrayList<News>();
		newsList = getNewsList();
		
	}
	
	
	public  ArrayList<News> getNewsList() {

	
		for(int i=0;i<data.size();i++){
			News news = new News();
			Map<String, String> item = data.get(i);
			news.setTitle(item.get("title"));
			news.setUrl(item.get("url"));
			news.setPubDate(item.get("pubDate"));
			news.setListImage(item.get("listImage"));
			//System.out.println(news.toString());
			newsList.add(news);
		}
		return newsList;
	}
	

}
