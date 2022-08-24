package com.propperties.ejercicio5;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class MisPropiedades {
    @Value("${greeting}")
    private String greeting;

    @Value("${my.number}")
    private int myNumber;

    @Value("${new.property:new.property no tiene valor}")
    private String newProperty;

}
