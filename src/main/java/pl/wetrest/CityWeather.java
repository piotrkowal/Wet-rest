package pl.wetrest;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

public class CityWeather implements Serializable {
    @Getter
    @Setter
    private long id;

    @Getter
    @Setter
    private String name;


    // standard getters and setters
}
