package com.novi.eindwerkstuk;

import com.novi.eindwerkstuk.model.Bon;
import com.novi.eindwerkstuk.model.Car;
import com.novi.eindwerkstuk.repository.BonRepository;
import com.novi.eindwerkstuk.repository.CarRepository;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EindwerkstukApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(EindwerkstukApplication.class, args);
		CarRepository carRepository =
				configurableApplicationContext.getBean(CarRepository.class);
		BonRepository bonRepository =
				configurableApplicationContext.getBean(BonRepository.class);

		Car car = new Car("test", "test", "test", "test");
		carRepository.save(car);
		Bon bon = new Bon(car);
		bonRepository.save(bon);
	}

}
