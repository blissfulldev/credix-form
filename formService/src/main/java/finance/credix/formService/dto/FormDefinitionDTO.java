package finance.credix.formService.dto;

import java.util.HashSet;

public class FormDefinitionDTO {
	private String name;
	HashSet<FormFieldDTO> fields = new HashSet<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HashSet<FormFieldDTO> getFields() {
		return fields;
	}

	public void setFields(HashSet<FormFieldDTO> fields) {
		this.fields = fields;
	}

	@Override
	public String toString() {
		return "FormDefinitionDTO [name=" + name + ", fields=" + fields + "]";
	}

}
