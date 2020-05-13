package funcional;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciciosEmails {


    public static void main(String[] args) {

        List<String> listaEmails = Arrays.asList("imeedendorpe1@usa.gov","dbattram2@google.ru","bvarden3@jigsy.com","bmatthias4@sciencedaily.com","cdarnell5@hugedomains.com","lflattman6@livejournal.com","mlippard7@cornell.edu","lbrome8@google.es","dmatresse4@google.it","smayall9@soup.io","cpenberthya@ask.com","msandeson0@google.com","apinnijar1@github.io","rziehms2@aboutads.info","jjakubowsky3@privacy.gov.au","dmatresse4@google.it","cdaniells5@tiny.cc","carnaudi6@smh.com.au","mhumes7@tamu.edu","cdullard8@ycombinator.com","ibriztman9@craigslist.org","znewsteada@constantcontact.com","hdunkerlyb@meetup.com","cstanelandc@e-recht24.de","vhartnupd@xrea.com","pinnote@soup.io","dgippsf@google.com","sharvettg@amazon.de","aroxburghh@google.fr","rsidnalli@biglobe.ne.jp","dmuntj@nytimes.com");

        //System.out.println(listaEmails);
        //listaEmails.forEach( email -> System.out.println(email.split("@")[0]));

        String emailsSeparadosPorVirgula = listaEmails.stream()

       // listaEmails.stream()
        .map( email -> email.split("@")[0])
        .distinct()
        .collect(Collectors.joining(", "));

        System.out.println(emailsSeparadosPorVirgula);

    }
}
