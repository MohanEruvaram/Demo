package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Studnet {
	@RequestMapping(value = "/testmain", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)

	public ResponseEntity<DefaultResponse> isvalid(@RequestBody ENcoresds coresde) {
		System.out.println(coresde.toString());
		return ResponseEntity.ok(new DefaultResponse().setIsvalid(coresde.getName().equalsIgnoreCase("Mohan"))
				.setRecord(coresde.getValue()));

	}

	@RequestMapping(value = "/usertest", produces = MediaType.APPLICATION_ATOM_XML_VALUE)
	public Studentmain callingService() {
		return Arrays.asList(new Studentmain(1,"Mohan","25"),new Studentmain(1,"Mohan","25"),new Studentmain(1,"Mohan","25"),new Studentmain(1,"Mohan","25")).get(0);

	}

}
