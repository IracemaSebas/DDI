package es.salesianos.controller;

import java.util.Random;
import java.util.logging.LogManager;

import org.apache.commons.logging.Log;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import es.salesianos.model.Dificulty;
import es.salesianos.model.WorldList;

@Controller
public class HangleController {

	private static Logger log = LogManager.addLogger(HangleController.class);
	@Autowired
	WorldList Worldlist;

	@Autowired
	Dificulty dificulty;

	String correctAnswer;
	Integer tries;
	String userInput;
	String feedback;

	@GetMapping(path = "/")
	public String index() {
		return "index";
	}

	@GetMapping(path = "yielRandomSolutionWorld")
	public String generateAnswer() {

		int rnd = new Random().nextInt(Worldlist.getWorldList().size());
		correctAnswer = Worldlist.getWorldList().get(rnd);
		tries = dificulty.getTries();
		log.debug("La respuesta a encontrar es: " + correctAnswer);
		return "index";
	}

	@PostMapping
	public void checkAnswer(String userInput) {
		if (userInput.equalsIgnoreCase(correctAnswer)) {
			Log.info("Has ganado");
			feedback = "Lo has logrado! Has acertado la palabra";

		} else {

			int rnd = new Random().nextInt(correctAnswer.length());
			Log.info("pista: " + correctAnswer.charAt(rnd));
			feedback = String.valueOf(correctAnswer.charAt(rnd));

		}

	}

}
