/**
 * 
 */
package com.springio.basic.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author ardhani
 *
 */
@Controller
@RequestMapping("/")
public class PizzaController {

	@RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> heyPizza( ) {
         return new ResponseEntity<String>("Hey!! I'm here", HttpStatus.OK);
    }
}
