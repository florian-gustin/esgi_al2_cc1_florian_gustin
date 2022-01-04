package com.amazen._core.value_objects;

import com.amazen._core.interfaces.ValidatorEngine;
import org.apache.commons.text.StringEscapeUtils;

public class PasswordValueObject extends ValueObjectAbstract<String> {
    public PasswordValueObject(ValidatorEngine<String> validator, String value) {
        super(validator, StringEscapeUtils.escapeHtml4(value));
    }
}