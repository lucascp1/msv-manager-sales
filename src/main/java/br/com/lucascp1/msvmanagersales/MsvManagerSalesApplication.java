package br.com.lucascp1.msvmanagersales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsvManagerSalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsvManagerSalesApplication.class, args);
	}

}
