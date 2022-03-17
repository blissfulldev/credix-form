package finance.credix.formService.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import finance.credix.formService.dto.FormDefinitionDTO;
import finance.credix.formService.model.FormAnswer;
import finance.credix.formService.model.FormDefinition;
import finance.credix.formService.service.FormDefinitionService;

@RestController
@RequestMapping("api/forms")
public class FormController {
	private final FormDefinitionService formDefinitionService;

	public FormController(FormDefinitionService formDefinitionService) {
		this.formDefinitionService = formDefinitionService;
	}

	@PostMapping("/definitions")
	public FormDefinition getBook(@RequestBody FormDefinitionDTO definition) {
		System.out.println("Form definition is " + definition.toString());
		formDefinitionService.createForm(definition);
		return null;
	}

	@PostMapping("/{form_id}/entries")
	public FormAnswer createEntry(@PathVariable int form_id, @RequestBody FormAnswer answer) {
		return null;
	}

	@GetMapping("/{form_id}/entries")
	public List<FormAnswer> getEntries(@PathVariable int form_id) {
		return null;
	}

}
