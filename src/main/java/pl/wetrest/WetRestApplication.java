package pl.wetrest;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.Serializable;
import java.net.URI;

@SpringBootApplication
public class WetRestApplication implements CommandLineRunner {
	private static Logger LOG = LoggerFactory.getLogger(WetRestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(WetRestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		URI url = new URI("https://api.openweathermap.org/data/2.5/weather?q=chicago&appid=9af3f8dde1e75aaa7e328d8483ff9a74");
		RestTemplate restTemplate = new RestTemplate();

		CityWeather response = restTemplate.getForObject(url, CityWeather.class);


		System.out.println(response.getName());
		System.out.println(response.getId());
		}



}

