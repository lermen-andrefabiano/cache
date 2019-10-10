package com.ehcache.ehcache;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/number", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Log
@Slf4j
public class NumberController {

    @Autowired
    private NumberService numberService;

    @GetMapping(path = "/square/{number}")
    public String getSquare(@PathVariable Long number) {
        log.info(String.format("call numberService to square %s", number));
        return String.format("{square: %s}", numberService.square(number));
    }
}