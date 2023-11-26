package es.televoip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSoapServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSoapServiceApplication.class, args);
	}

	/*
	 * Para SOAP importar de esta dirección: http://localhost:8080/ws/countries.wsdl
	 * 
	 * Debes introducir capitales en inglés:  Spain, France, Argentina, ..
	 */

}
