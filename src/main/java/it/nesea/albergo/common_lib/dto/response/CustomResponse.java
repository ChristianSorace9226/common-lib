package it.nesea.albergo.common_lib.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomResponse<T> implements Serializable {

    @Serial
    private static final long serialVersionUID = 7646631177953932401L;

    T response;
    List<String> errorMessage;

    public static <T> CustomResponse<T> success(T response) {
        return new CustomResponse<>(response, new ArrayList<>());
    }

    public static <T> CustomResponse<T> error(List<String> errorMessage) {
        return new CustomResponse<>(null, errorMessage);
    }
}

