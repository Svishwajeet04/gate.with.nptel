package com.vishwa.admin.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {

	@GetMapping("/admin/reports")
	public ResponseEntity<Object> getUnreadReports(){
		return null ;
	}

	@GetMapping("/admin/reports/highPriority")
	public ResponseEntity<Object> getHighPriorityUnreadReports(){
		return null;
	}

	@GetMapping("/admin/reports/{id}")
	public ResponseEntity<Object> getReportDataById(){
		return null;
	}

	@PatchMapping("/admin/reports/{id}/markAcknowledged")
	public ResponseEntity<Object> markAcknowledged(){
		return null;
	}

}
