package finance.credix.formService.dto;

public class FormFieldDTO {
	private String label;
	private String dataType;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	@Override
	public String toString() {
		return "FormFieldDTO [label=" + label + ", dataType=" + dataType + "]";
	}

}
