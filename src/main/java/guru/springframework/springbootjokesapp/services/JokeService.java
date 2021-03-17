package guru.springframework.springbootjokesapp.services;

import org.springframework.stereotype.Service;

/**
 * User: p_sha
 * Date: Wed 17 Mar 2021
 */
@Service
public interface JokeService {
    String getJoke();
}
