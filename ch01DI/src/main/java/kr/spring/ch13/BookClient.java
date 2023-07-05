package kr.spring.ch13;

import java.util.Properties;

public class BookClient {
	//프로퍼티는 키와 벨류의 타입이 고정되어있음 
	//<String,String>
	private Properties prop;

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	@Override
	public String toString() {
		return "BookClient [prop=" + prop + "]";
	}
	
	
	
}
