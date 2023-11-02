package org.app.monopatin.entities.DTO;
import lombok.*;

import java.sql.Date;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TarifaDTO {
    private Date fecha_creacion;
    private Double tarifa;
    private Double porc_recargo;
    private Date fecha_caducacion;

    public TarifaDTO(Double tarifa, Double porc_recargo) {
        this.fecha_creacion = setFechaCreacion();
        this.tarifa = tarifa;
        this.porc_recargo = porc_recargo;
        this.fecha_caducacion = null;
    }
    public TarifaDTO(Double tarifa, Double porc_recargo, Date fecha_creacion, Date fecha_caducacion) {
        this.fecha_creacion = fecha_creacion;
        this.tarifa = tarifa;
        this.porc_recargo = porc_recargo;
        this.fecha_caducacion = fecha_caducacion;
    }

    public Date setFechaCreacion() {
       long currentTimeMillis = System.currentTimeMillis();

       // Crea una instancia de java.sql.Date a partir de los milisegundos actuales
       return new Date(currentTimeMillis);

    }
}