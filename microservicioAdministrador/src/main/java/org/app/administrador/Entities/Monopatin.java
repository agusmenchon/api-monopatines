package org.app.administrador.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


public class Monopatin implements Serializable {
    private Long id;
    private boolean enMantenimiento;

    public Monopatin(Long id, boolean enMantenimiento) {
        this.id = id;
        this.enMantenimiento = enMantenimiento;
    }

    public Long getId() {
        return id;
    }

    public boolean isEnMantenimiento() {
        return enMantenimiento;
    }

    public void setEnMantenimiento(boolean enMantenimiento) {
        this.enMantenimiento = enMantenimiento;
    }
}