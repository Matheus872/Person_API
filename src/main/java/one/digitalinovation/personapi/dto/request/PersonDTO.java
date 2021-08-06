package one.digitalinovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinovation.personapi.entity.Phone;
import java.time.LocalDate;
import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private Long id;

    @NotEmpty
    @Size(min = 3, max = 100)
    private String firstname;

    @NotEmpty
    @Size(min = 3, max = 100)
    private String lastname;

    @NotEmpty
    @CPF
    private String cpf;

    private LocalDate birthDate;

    @Valid
    @NotEmpty
    private List<Phone> phones;

}
