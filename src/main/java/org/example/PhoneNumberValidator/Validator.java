package org.example.PhoneNumberValidator;

import java.util.regex.Pattern;

public class Validator {
   static final Pattern VALIDATOR = Pattern.compile(
            "^\\d{3}-\\d{3}-\\d{4}$|^(\\d{1,3})\\s(\\d{3})\\s(\\d{3,4})$"
    );
}
