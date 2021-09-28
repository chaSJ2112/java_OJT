package com.barunsw.ojt.sample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan(basePackageClasses = SamplecontentApplication.class)
public class SamplecontentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamplecontentApplication.class, args);
	}
}
