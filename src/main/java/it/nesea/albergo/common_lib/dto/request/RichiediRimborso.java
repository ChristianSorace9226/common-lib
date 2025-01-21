package it.nesea.albergo.common_lib.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RichiediRimborso implements Serializable {
    @Serial
    private static final long serialVersionUID = -7744186859067756206L;

    @NotNull(message = "deve esserci l'importo rimborsato")
    BigDecimal importoRimborso;

    @NotNull(message = "deve essere presente un id prenotazione")
    Integer idPrenotazione;



}
