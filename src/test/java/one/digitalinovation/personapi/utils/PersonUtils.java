package one.digitalinovation.personapi.utils;

import one.digitalinovation.personapi.dto.request.PersonDTO;
import one.digitalinovation.personapi.entities.Person;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {

    private static final String FIST_NAME = "Matheus";
    private static final String LAST_NAME = "Lucas";
    private static final String CPF_NUMBER = "111.111.111-11";
    private static final long PERSON_ID = 1l;
    private static final LocalDate BIRTH_DATE = LocalDate.of(2015, 05, 30);

    public static PersonDTO createFakeDTO(){
        return PersonDTO.builder()
                .id(PERSON_ID)
                .firstname(FIST_NAME)
                .lastname(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate("30-05-2015")
                .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();
    }

    public static Person createFakeEntity(){
        Person.builder()
                .id(PERSON_ID)
                .firstname(FIST_NAME)
                .lastname(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate(BIRTH_DATE)
                .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
    }


}
