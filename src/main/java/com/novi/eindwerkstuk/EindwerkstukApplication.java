package com.novi.eindwerkstuk;

import com.novi.eindwerkstuk.model.*;
import com.novi.eindwerkstuk.repository.*;
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
		CustomerRepository customerRepository =
				configurableApplicationContext.getBean(CustomerRepository.class);
		APKRepository apkRepository =
				configurableApplicationContext.getBean(APKRepository.class);
		PartRepository partRepository =
				configurableApplicationContext.getBean(PartRepository.class);
		ActionRepository actionRepository =
				configurableApplicationContext.getBean(ActionRepository.class);

		Car car = new Car("test", "test", "test");
		carRepository.save(car);
		Customer customer = new Customer("henk", "van hooi", "test@hotmail.com", "apeldoorn", "0658987745");
		customerRepository.save(customer);
		APK apk = new APK("06-05-2021", "afgekeurd", "achterlamp", 45);
		apkRepository.save(apk);
		Part part = new Part("achterlamp", 20, "achterlamp", 20);
		partRepository.save(part);
		Action action = new Action("achterlamp vervangen", 40, "achterlamp vervangen", 40);
		actionRepository.save(action);
		Bon bon = new Bon(car, customer, apk, part, action);
		bonRepository.save(bon);
	}

}
