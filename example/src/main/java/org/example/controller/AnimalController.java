package org.example.controller;

import com.alibaba.fastjson.JSONObject;
import org.example.entity.Animal;
import org.example.entity.ResultObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DDD
 * @date 2022/6/10 13:35
 */
@RestController
@RequestMapping("/animal")
public class AnimalController {

    @GetMapping("/getOne")
    public ResultObject<List<Animal>> getOne() {
        Animal animal = JSONObject.parseObject("{\"name\":\"哈士奇\", \"age\":10}", Animal.class);

//        Animal animal = new Animal();
//        animal.setAge(10);
//        animal.setName("哈士奇");
        List<Animal> animals = new ArrayList<>();
        animals.add(animal);
        return new ResultObject<>(200, animals);
    }
}
