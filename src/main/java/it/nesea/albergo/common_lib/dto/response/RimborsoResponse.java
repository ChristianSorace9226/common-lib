package it.nesea.albergo.common_lib.dto.response;

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
public class RimborsoResponse implements Serializable {
    @Serial
    private static final long serialVersionUID = 2966110406284061084L;

    Boolean esitoRimborso; //todo: due condizioni: true)Andato a buon fine / false)Non e andato a buon fine
    BigDecimal creditoRimborsato;

}
