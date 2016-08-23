/*
 * Copyright (c) 2016, Spiideo
 */

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Raniz
 * @since 2016-08-23.
 */
public class ManualObject {

    private String s;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer i;

    public ManualObject() {}

    public ManualObject(final String s, final Integer i) {
        this.s = s;
        this.i = i;
    }

    public String getS() {
        return s;
    }

    public void setS(final String s) {
        this.s = s;
    }

    public Integer getI() {
        return i;
    }

    public void setI(final Integer i) {
        this.i = i;
    }
}
