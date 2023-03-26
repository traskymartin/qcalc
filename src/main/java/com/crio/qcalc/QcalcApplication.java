package com.crio.qcalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		SpringApplication.run(QcalcApplication.class, args);
		StandardCalculator cal=new StandardCalculator();
		//cal.multiply(Double.MAX_VALUE, Double.MAX_VALUE);
		//cal.add(1,1.1);
		System.out.println(cal.getResult());
		LogicCalculator calc = new LogicCalculator();
		calc.OR(8, 6);
		calc.printResult();
		ScientificCalculator s=new ScientificCalculator();
		s.square(Double.MAX_VALUE);

	}

}
