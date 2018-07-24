package pl.akademiakodu.tescik.model;

import java.util.ArrayList;
import java.util.List;

public class Quote {

    List<String> quote = new ArrayList<>();

    public Quote(List<String> quote) {
        this.quote = quote;
    }

    public List<String> getQuote() {
        return quote;
    }

    public void setQuote(List<String> quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "quote=" + quote +
                '}';
    }
}
