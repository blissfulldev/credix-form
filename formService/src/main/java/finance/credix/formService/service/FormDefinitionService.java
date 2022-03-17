package finance.credix.formService.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import finance.credix.formService.dto.FormDefinitionDTO;
import finance.credix.formService.model.FormDefinition;
import finance.credix.formService.repository.FormDefinitionRepository;
import finance.credix.formService.response.FormDefinitionResponse;

@Service
public class FormDefinitionService extends BaseService<FormDefinition> {
	private final FormDefinitionRepository formDefinitionRepository;
	private final ModelMapper modelMapper;

	public FormDefinitionService(FormDefinitionRepository formDefinitionRepository, ModelMapper modelMapper) {
		this.formDefinitionRepository = formDefinitionRepository;
		this.modelMapper = modelMapper;
	}

	public FormDefinitionResponse createForm(FormDefinitionDTO definition) {
		FormDefinition formDefinition = modelMapper.map(definition, FormDefinition.class);
		formDefinition = saveOrUpdate(formDefinition);
		return modelMapper.map(definition, FormDefinitionResponse.class);
	}

	public FormDefinition findById(long id) {
		return findById(id);
	}

}
