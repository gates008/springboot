package com.imooc.mapper;
/**
* @author 作者
* @version 创建时间：2019年1月3日 上午11:49:57
* 类说明
*/
public class Happiness {
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	private Long id;
    private String city;
    private Integer num;

}