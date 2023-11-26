package es.televoip.repository;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import es.televoip.wsdl.Country;
import es.televoip.wsdl.Currency;

@Component
public class CountryRepository {

	private static final Map<String, Country> countries = new HashMap<>();

	@PostConstruct
	public void initData() {
		// Los países que ya tienes
		addCountry("Spain", "Madrid", Currency.EUR, 46704314);
		addCountry("Poland", "Warsaw", Currency.PLN, 38186860);
		addCountry("United Kingdom", "London", Currency.GBP, 63705000);

		// Añadiendo 17 países más
		addCountry("France", "Paris", Currency.EUR, 67390000);
		addCountry("Germany", "Berlin", Currency.EUR, 83149300);
		addCountry("Italy", "Rome", Currency.EUR, 60360000);
		addCountry("Portugal", "Lisbon", Currency.EUR, 10280000);
		addCountry("Greece", "Athens", Currency.EUR, 10720000);
		addCountry("Canada", "Ottawa", Currency.CAD, 38008005);
		addCountry("United States", "Washington D.C.", Currency.USD, 331893745);
		addCountry("Mexico", "Mexico City", Currency.MXN, 128932753);
		addCountry("Brazil", "Brasilia", Currency.BRL, 213993437);
		addCountry("Argentina", "Buenos Aires", Currency.ARS, 45376763);
		addCountry("Japan", "Tokyo", Currency.JPY, 125584838);
		addCountry("South Korea", "Seoul", Currency.KRW, 51780579);
		addCountry("China", "Beijing", Currency.CNY, 1402112000);
		addCountry("India", "New Delhi", Currency.INR, 1380004385);
		addCountry("Australia", "Canberra", Currency.AUD, 25687041);
		addCountry("South Africa", "Pretoria", Currency.ZAR, 59308690);
		addCountry("Russia", "Moscow", Currency.RUB, 146171015);
		addCountry("Egypt", "Cairo", Currency.EGP, 102334403);
	}

	private void addCountry(String name, String capital, Currency currency, int population) {
		Country country = new Country();
		country.setName(name);
		country.setCapital(capital);
		country.setCurrency(currency);
		country.setPopulation(population);
		countries.put(name, country);
	}

	public Country findCountry(String name) {
		Assert.notNull(name, "The country's name must not be null");
		// Convertir la entrada a minúsculas (o mayúsculas) para la comparación
		String lowerCaseName = name.toLowerCase().trim();

		// Buscar en el mapa con una comparación insensible a mayúsculas y minúsculas
		return countries.values().stream().filter(country -> country.getName().toLowerCase().equals(lowerCaseName))
				.findFirst().orElse(null); // O manejar de otra manera si el país no se encuentra
	}

}
