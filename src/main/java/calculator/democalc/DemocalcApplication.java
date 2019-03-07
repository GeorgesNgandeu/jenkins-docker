package calculator.democalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class DemocalcApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemocalcApplication.class, args);
	}

}

@Service
public class Calculator {
	int sum(int a, int b) {
		return a + b;
	}
}