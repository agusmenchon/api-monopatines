package org.app.paradas.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Parada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private long latitud;
    @Column
    private long altitud;

    public Parada(Long id, long latitud, long altitud) {
        this.id = id;
        this.latitud = latitud;
        this.altitud = altitud;
    }

    public Parada() {
    }
}