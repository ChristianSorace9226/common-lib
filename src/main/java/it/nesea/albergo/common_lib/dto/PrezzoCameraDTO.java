package it.nesea.albergo.common_lib.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrezzoCameraDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 3916634733009689102L;

    private Integer idTipo;
    private BigDecimal prezzoTotale;
    private List<BigDecimal> prezziAPersona;
    private Integer numeroOccupanti;

}

