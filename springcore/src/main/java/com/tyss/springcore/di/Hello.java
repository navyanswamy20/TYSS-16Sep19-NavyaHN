package com.tyss.springcore.di;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;
@Component("hello")
public class Hello {
	private String msg;

	private Map<String, Integer> map;
	public Map<String, Integer> getMap() {
		return map;
	}
	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@PostConstruct // after constructing the object
	public void init() {
		System.out.println("init() executing from hello");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy() executing from Hello");
	}
}
