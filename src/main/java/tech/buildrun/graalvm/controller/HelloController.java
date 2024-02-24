package tech.buildrun.graalvm.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestController
public class HelloController {

    @GetMapping
    public ResponseEntity<String> helloWorld(@RequestParam("class") String argClazz) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<?> clazz = Class.forName("tech.buildrun.graalvm.controller." + argClazz);

        // Get the method by name
        Method method = clazz.getDeclaredMethod("say");

        Object instance = clazz.getDeclaredConstructor().newInstance();

        return ResponseEntity.ok(String.valueOf(method.invoke(instance)));
    }

}
