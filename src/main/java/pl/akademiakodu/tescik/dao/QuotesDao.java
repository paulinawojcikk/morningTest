package pl.akademiakodu.tescik.dao;

import pl.akademiakodu.tescik.model.Quote;

import java.util.List;

public interface QuotesDao {

List<Quote> showAll();
void generateQuotes (Quote quote);

}
