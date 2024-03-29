package com.project.sub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.project.sub.entity.Employee;
import com.project.sub.entity.Transport;
import com.project.sub.exception.ProjectNotFoundException;
import com.project.sub.repository.EmployeeRepository;
import com.project.sub.repository.TransportRepository;

@Controller

public class EmployeeController {
	//employee
	@Autowired
	private EmployeeRepository employeeRepository;
	

	@GetMapping("/employee")
	public String showEmployee(Model model) {
		model.addAttribute("employee",employeeRepository.findAll());
		return "employee";
	}
	@GetMapping("/employee/add")
	public String showfrom(Model model) {
		model.addAttribute("employee", new Employee());
		return "index";
	}
	@PostMapping("/employee/add")
	public String submitfrom(@ModelAttribute("employee") Employee employee) {
		employeeRepository.save(employee);

		return "redirect:/employee";
		}
    @GetMapping("/employee/edit/{id}")
    public String editEmployee(@PathVariable("id") Long id, Model model) {
        Employee employee = employeeRepository.findById(id).orElseThrow(()->new ProjectNotFoundException(id));

        model.addAttribute("employee", employee);
        return "edit";
    }
    
    @PostMapping("/employee/update/{id}")
    public String updateEmployee(@PathVariable("id") Long id, @ModelAttribute("employee") Employee employee, Model model) {
        employeeRepository.save(employee);
        return "redirect:/employee";
    }
    
    @GetMapping("/employee/delete/{id}")
    public String deleteEmployee(@PathVariable("id") Long id, Model model) {
        Employee employee = employeeRepository.findById(id).orElseThrow(()->new ProjectNotFoundException(id));
               
        employeeRepository.delete(employee);
        return "redirect:/employee";
    }
//transport
    @Autowired
    private TransportRepository transportRepository;
    
	@GetMapping("/transport")
	public String showTransport(Model model) {
		model.addAttribute("tran",transportRepository.findAll());
		return "transport";
	}

	@GetMapping("/transport/add")
	public String showTransportfrom(Model model) {
		model.addAttribute("transport", new Transport());
		return "addTransport";
	}
	@PostMapping("/transport/add")
	public String submitTransportfrom(@ModelAttribute("transport") Transport transport) {
		transportRepository.save(transport);

		return "redirect:/transport";
		}
	@GetMapping("/transport/edit/{id}")
    public String editTransport(@PathVariable("id") Long id, Model model) {
        Transport transport = transportRepository.findById(id).orElseThrow(()->new ProjectNotFoundException(id));

        model.addAttribute("transport", transport);
        return "editTransport";
    }
    
    @PostMapping("/transport/update/{id}")
    public String updateTransport(@PathVariable("id") Long id, @ModelAttribute("transport") Transport transport, Model model) {
        transportRepository.save(transport);
        return "redirect:/transport";
    }
    
    @GetMapping("/transport/delete/{id}")
    public String deleteTransport(@PathVariable("id") Long id, Model model) {
        Transport transport = transportRepository.findById(id).orElseThrow(()->new ProjectNotFoundException(id));
               
        transportRepository.delete(transport);
        return "redirect:/transport";
    }
}
