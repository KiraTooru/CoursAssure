package com.urbanisation_si.microservices_assure;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("urbanisation-si.clairprev")

public class ApplicationPropertiesConfiguration {
    public int getLimiteNombreAssure() {
        return limiteNombreAssure;
    }

    public void setLimiteNombreAssure(int limiteNombreAssure) {
        this.limiteNombreAssure = limiteNombreAssure;
    }

    private int limiteNombreAssure;
}
