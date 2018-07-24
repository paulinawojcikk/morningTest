package pl.akademiakodu.tescik.dao;

import pl.akademiakodu.tescik.model.Quote;


import java.util.ArrayList;
import java.util.List;

public class QuoteStaticDao implements QuotesDao {

    List<Quote> quotes = new ArrayList<>();


    @Override
    public List<Quote> showAll() {
        return quotes;
    }

    @Override
    public void generateQuotes(Quote quote) {
        quotes.add(quote);
    }


}
