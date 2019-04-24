package vlada.springframework.didemo.services;


import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Engleski primarni \n";
    }

    @Override
    public String getSerbianGreeting() {
        return "Srpski primarni \n";
    }

    @Override
    public String getGermanGreeting() {
        return "Nemacki primarni \n";
    }

}
