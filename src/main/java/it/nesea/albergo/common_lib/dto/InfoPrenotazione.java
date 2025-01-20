package it.nesea.albergo.common_lib.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class InfoPrenotazione implements Serializable {

    @Serial
    private static final long serialVersionUID = 1565774617114581004L;

    Integer idUtente;
    BigDecimal prezzoTotale;
    Integer idMetodoPagamento;
    LocalDate checkIn;

}
