package htw.berlin.addressbook.address;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.APRIL;
import static java.util.Calendar.JANUARY;

@Configuration
public class AddressConfig {

    @Bean
    CommandLineRunner commandLineRunner(AddressRepository repository){
        return args -> {
            Address max_meier = new Address(
                    1L,
                    "Max Meier",
                    "max.meier@gmail.com",
                    "Hauptstraße 45 12345 Berlin"
            );

            Address paul_franken = new Address(
                    2L,
                    "Paul Franken",
                    "paul.Franken@gmail.com",
                    "Bundesstraße 13 12341 Berlin"
            );

            Address carl_siebers = new Address(
                    3L,
                    "Carl Siebers",
                    "Carl.Siebers@gmail.com",
                    "Jansenstraße 99 12341 Berlin"
            );

            repository.saveAll(
                    List.of(max_meier, paul_franken, carl_siebers)
            );

        };
    }
}
