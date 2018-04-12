package com.dao;


public class News {

	private String title;
	private String pubDate;
	private String url;
	private String listImage;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getListImage() {
		return listImage;
	}

	public void setListImage(String listImage) {
		this.listImage = listImage;
	}

	@Override
	public String toString() {
		return "News [title=" + title + ", pubDate=" + pubDate + ", url=" + url + ", listImage=" + listImage + "]";
	}

}
