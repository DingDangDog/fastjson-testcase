package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author DDD
 * @date 2022/6/10 13:50
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResultObject<T> {
    private Integer code;
    private T object;
}
