package one.digitalinovation.personapi.utils;

import one.digitalinovation.personapi.dto.request.PhoneDTO;
import one.digitalinovation.personapi.entities.Phone;
import one.digitalinovation.personapi.enums.PhoneType;

public class PhoneUtils {

    private static final long PHONE_ID = 1l;
    private static final String PHONE_NUMBER = "9999999-9999";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;




    public static PhoneDTO createFakeDTO(){
        return PhoneDTO.builder()
                .id(PHONE_ID)
                .phone(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

    public static Phone createFakeEntity(){
        return Phone.builder()
                .id(PHONE_ID)
                .phone(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

}
