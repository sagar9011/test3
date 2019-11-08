package com.example.StockNoteService;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {
		
	@GetMapping("/stockList")
    private String  getAllPersons() {
        return "Hello World";
    }

    @PostMapping("/StocksDetails")
	private List getAllStocksDetails() {
		
		List list = new ArrayList();
		
		
		return list;
	}
	
    @PostMapping("/topStockDetails")
  	private List getTopStockDetails() {
  		
  		List list = new ArrayList();
  		
  		
  		return list;
  	}
	
}
