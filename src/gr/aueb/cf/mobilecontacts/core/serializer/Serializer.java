package gr.aueb.cf.mobilecontacts.core.serializer;

import gr.aueb.cf.mobilecontacts.dto.MobileContactReadOnlyDTO;

public class Serializer {

    /**
     * No instances of this class should be available.
     */
    private Serializer() {

    }

    public static String serializeDTO(MobileContactReadOnlyDTO readOnlyDTO) {
        return "ID: " + readOnlyDTO.getId() + " Name: " + readOnlyDTO.getFirstname()
        + " Lastname: " + readOnlyDTO.getLastname() + " Phone Number: " + readOnlyDTO.getPhoneNumber();
    }
}
