package guru.springframework.springbootjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * User: p_sha
 * Date: Wed 17 Mar 2021
 */
public class JokeServiceImpl implements JokeService{

    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    private final ChuckNorrisQuotes chuckNorrisQuotes;



    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
