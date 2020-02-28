package com.example;

import java.util.List;

public class Article {

	private Integer id;
	private String name;
	private String content;

	@Override
	public String toString() {
		return "Article [id=" + id + ", name=" + name + ", content=" + content + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
