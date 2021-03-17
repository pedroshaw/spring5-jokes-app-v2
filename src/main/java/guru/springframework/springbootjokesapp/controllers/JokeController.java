package guru.springframework.springbootjokesapp.controllers;

import guru.springframework.springbootjokesapp.services.JokeService;
import org.springframework.ui.Model;

/**
 * User: p_sha
 * Date: Wed 17 Mar 2021
 */
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    public String showJoke(Model model) {

        model.addAttribute("joke", jokeService.getJoke());

        return "";
    }


}
