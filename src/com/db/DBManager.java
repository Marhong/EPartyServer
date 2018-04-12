package com.db;
import java.util.*;

import com.sun.org.apache.bcel.internal.generic.Select;

import java.sql.*;

public class DBManager {
	//���ݿ��ַ
	private static String URL = "jdbc:postgresql:marhong";
	//���ݿ��¼���˺ź�����
	private static String USERNAME="wangbin";
	private static String PASSWORD="123456";
	//Jdbc��������
	private  Connection connection = null;
	private  Statement ps;
	private    ResultSet rs;
	private static String DRIVER = "org.postgresql.Driver";


	public  void loadDriver() throws SQLException{
			
			try{
				//������������
				Class.forName(DRIVER);
				//��������
				connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
				
			}catch(ClassNotFoundException e){
				e.printStackTrace();
				
				
			}catch(SQLException e){
				e.printStackTrace();
				
				
			}
		}


		public  List<Map<String, String>> query(String sql) throws SQLException{
			List<Map<String,String>> records = new ArrayList<Map<String,String>>();
			ps = connection.createStatement();
			rs = ps.executeQuery(sql);
			while(rs.next()){
				Map<String,String> record = new HashMap<String,String>();
				record.put("title", rs.getString("title"));
				record.put("pubDate", rs.getString("pubDate"));
				record.put("url", rs.getString("url"));
				record.put("listImage", rs.getString("listImage"));
				records.add(record);
			}
			
			return records;
		}
}

