/*
 * Copyright (c) 2016, Spiideo
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Raniz
 * @since 2016-08-23.
 */
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class LombokObject {

    private String s;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer i;
}
