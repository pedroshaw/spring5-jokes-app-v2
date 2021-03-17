package guru.springframework.springbootjokesapp.controllers;

import guru.springframework.springbootjokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User: p_sha
 * Date: Wed 17 Mar 2021
 */
@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model) {

        model.addAttribute("joke", jokeService.getJoke());

        return "index";
    }


}
