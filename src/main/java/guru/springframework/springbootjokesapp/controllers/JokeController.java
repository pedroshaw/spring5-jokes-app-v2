package guru.springframework.springbootjokesapp.controllers;

import guru.springframework.springbootjokesapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User: p_sha
 * Date: Wed 17 Mar 2021
 */
@Controller
public class JokeController {

    private final JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    // The args allow a trailing slash or nothing at all
    @RequestMapping({"/",""})
    public String showJoke(Model model) {

        model.addAttribute("joke", jokeService.getJoke());

        return "index";
    }


}
