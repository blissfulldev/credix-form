package finance.credix.formService.service;

import java.util.List;

import finance.credix.formService.model.FormAnswer;
import finance.credix.formService.model.FormDefinition;
import finance.credix.formService.repository.FormAnswerRepository;
import finance.credix.formService.response.FormDefinitionResponse;

public class FormAnswerService extends BaseService<FormAnswer>{
	private final FormAnswerRepository formAnswerRepository;
	private final FormDefinitionService formDefinitionService;
    public FormAnswerService(FormAnswerRepository formAnswerRepository, FormDefinitionService formDefinitionService) {
        this.formAnswerRepository = formAnswerRepository;
        this.formDefinitionService = formDefinitionService;
    }
    
    public FormDefinitionResponse CreateAnswer(FormAnswer answer) {
    	answer = saveOrUpdate(answer);
        return modelMapper.map(answer, FormDefinitionResponse.class);
    }
    
    public List<FormAnswer> getFormEntries(long id) {
    	FormDefinition formDefinition = formDefinitionService.findById(id);
    	List<FormAnswer> answers = formAnswerRepository.findAllByForm(formDefinition);
		return answers;
    }
}
