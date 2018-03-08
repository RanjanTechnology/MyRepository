package com.ocjp.javalangpackege;

final public class BookImmutable {
	private String str;

	public BookImmutable(String str) {
		this.str = str;
	}
	public BookImmutable modify(String str){
		if(this.str==str){
			return this;
		}else
			return new BookImmutable(str);
	}
}
