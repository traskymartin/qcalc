package com.crio.qcalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		SpringApplication.run(QcalcApplication.class, args);
		StandardCalculator cal=new StandardCalculator();
		cal.add(Double.MAX_VALUE,Double.MAX_VALUE);
		System.out.println(cal.getResult());
	}

}
