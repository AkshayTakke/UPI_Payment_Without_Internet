package upi_payment_without_internet.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UPIPaymentApplication {

	public static void main(String[] args) {
		System.out.println("********************* Application Starting **********************");
		SpringApplication.run(UPIPaymentApplication.class, args);
	}

}
