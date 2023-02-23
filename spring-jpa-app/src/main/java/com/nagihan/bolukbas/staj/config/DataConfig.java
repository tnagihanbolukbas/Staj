package com.nagihan.bolukbas.staj.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@Data
@ComponentScan
public class DataConfig {
	@Value("${data.url}")
	private String url;
	@Value("${size}")
	private int size;
	@Value("${username}")
	private String username;
	@Value("${password}")
	private int password;

	@Bean
	public DataConfig dataConfig() {
		DataConfig dc = new DataConfig();
		dc.SetUrl(url);
		dc.SetSize(size);
		dc.SetUsername(username);
		dc.SetPasword(password);
		return dc;

	}

	private void SetPasword(int password) {
		// TODO Auto-generated method stub

	}

	private void SetUsername(String username) {
		// TODO Auto-generated method stub

	}

	private void SetSize(int size) {
		// TODO Auto-generated method stub

	}

	private void SetUrl(String url) {
		// TODO Auto-generated method stub

	}

}
