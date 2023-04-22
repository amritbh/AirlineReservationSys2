package com.mpp.airlinereservationsys.utility;


import java.util.Map;

public  class ValidatorForInputField {
    public static void validateInputFields(Map<String, String> fields, int maxLength, boolean checkLength) throws Exception {
        for (Map.Entry<String, String> entry : fields.entrySet()) {
            String fieldName = entry.getKey();
            String fieldValue = entry.getValue();

            if (checkLength) {

            } else {
                if (fieldValue == null || fieldValue.isEmpty()) {
                    throw new Exception(fieldName + " is required.");
                }

            }
        }

    }
}
