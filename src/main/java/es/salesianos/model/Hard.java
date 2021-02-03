package es.salesianos.model;

import org.springframework.context.annotation.Profile;

@Profile("hard")
public class Hard extends Dificulty {

	public Hard() {
		setTries(5);
	}

}
