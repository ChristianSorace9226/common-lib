package it.nesea.albergo.common_lib.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckDateStart implements Serializable {

    @Serial
    private static final long serialVersionUID = -6275029961994430957L;
    String numeroCamera;
    LocalDateTime dataCheckIn;
}
