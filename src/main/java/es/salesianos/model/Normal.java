package es.salesianos.model;

import org.springframework.context.annotation.Profile;

@Profile("normal")
public class Normal extends Dificulty {

	public Normal() {
		setTries(10);

	}

}
