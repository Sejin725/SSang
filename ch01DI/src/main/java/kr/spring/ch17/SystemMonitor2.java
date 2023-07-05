package kr.spring.ch17;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SystemMonitor2 {
	@Autowired
	//@Qualifier를 이용한 자동 설정 제한
	@Qualifier("main")
	private Recoder recoder;

	public Recoder getRecoder() {
		return recoder;
	}
	
	public void setRecoder(Recoder recoder) {
		this.recoder = recoder;
	}
	
}
