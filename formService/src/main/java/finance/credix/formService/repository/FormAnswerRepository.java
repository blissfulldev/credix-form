package finance.credix.formService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import finance.credix.formService.model.FormAnswer;
import finance.credix.formService.model.FormDefinition;

@Repository
public interface FormAnswerRepository extends JpaRepository<FormAnswer, Long> {
	List<FormAnswer> findAllByForm(FormDefinition form);
}
