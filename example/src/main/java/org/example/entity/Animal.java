package org.example.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author DDD
 * @date 2022/6/10 13:34
 */
@Getter
@Setter
public class Animal {
    @JsonProperty("xm")
    private String name;
    @JsonProperty("nl")
    private Integer age;
}
