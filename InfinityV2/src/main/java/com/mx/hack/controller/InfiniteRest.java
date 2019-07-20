package com.mx.hack.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mx.hack.bean.Cliente;

@Controller
@RequestMapping("/infinity")
public class InfiniteRest {

	@RequestMapping(value = "/getCliente/{numero}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Cliente getCliente(@PathVariable("numero") int numero) {
		Cliente c = new Cliente();
		switch (numero) {
		case 0:
			c.setClientType("new");
			c.setProspector("0");
			c.setSocialNet("approved");
			c.setSegment("null");
			break;
		case 1:
			c.setClientType("new");
			c.setProspector("0");
			c.setSocialNet("rejected");
			c.setSegment("null");
			break;
		case 2:
			c.setClientType("new");
			c.setProspector("1");
			c.setSocialNet("approved");
			c.setSegment("normal");
			break;
		case 3:
			c.setClientType("new");
			c.setProspector("2");
			c.setSocialNet("approved");
			c.setSegment("advance");
			break;
		case 4:
			c.setClientType("new");
			c.setProspector("3");
			c.setSocialNet("rejected");
			c.setSegment("null");
			break;
		case 5:
			c.setClientType("existing");
			c.setProspector("1");
			c.setSocialNet("approved");
			c.setSegment("premier");
			break;
		case 6:
			c.setClientType("existing");
			c.setProspector("2");
			c.setSocialNet("approved");
			c.setSegment("advance");
			break;
		case 7:
			c.setClientType("existing");
			c.setProspector("3");
			c.setSocialNet("rejected");
			c.setSegment("normal");
			break;

		}
		return c;
	}
}