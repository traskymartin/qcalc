package com.crio.qcalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		SpringApplication.run(QcalcApplication.class, args);
		StandardCalculator cal=new StandardCalculator();
		cal.add(1,5);
		System.out.println(cal.getResult());
	}

}
