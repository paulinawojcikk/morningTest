package pl.akademiakodu.tescik;

//import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.akademiakodu.tescik.dao.QuoteStaticDao;
import pl.akademiakodu.tescik.dao.QuotesDao;
import pl.akademiakodu.tescik.model.Quote;

import java.util.List;

@Controller
public class QuotesController {

    private QuotesDao ChuckNorris = new QuoteStaticDao();

@GetMapping ("/")
public String generateQuotes () {
    return "add";
}

@GetMapping ("/add")
    public String show (@ModelAttribute Quote quote, ModelMap modelMap) {
    ChuckNorris.generateQuotes(quote);
    return "show";
}

@GetMapping ("/all")
    public String show (ModelMap modelMap) {
    modelMap.put("quotes",ChuckNorris.showAll());
    return "all";
}

}
