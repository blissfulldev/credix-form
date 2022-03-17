package finance.credix.formService.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import finance.credix.formService.exception.ResourceNotFoundException;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class BaseService<T> {
    @Autowired
    private JpaRepository<T, Long> baseRepository;
    @Autowired
    protected ModelMapper modelMapper;

    public T saveOrUpdate(T t) {
        return baseRepository.saveAndFlush(t);
    }

    public T get(Long id) {
        Optional<T> t = baseRepository.findById(id);
        return t.isPresent() ? t.get() : null;
    }

    public void delete(Long id) {
        T t = get(id);
        if (Objects.isNull(t)) {
            throw new ResourceNotFoundException(id, "Resource with %s id not found");
        }
        baseRepository.delete(t);
    }

    public List<T> getAll() {
        return baseRepository.findAll();
    }

    public List<T> findAll() {
        return baseRepository.findAll();
    }

    @Transactional
    public List<T> saveAll(Iterable<T> entities) {
        return baseRepository.saveAll(entities);
    }

    public void delete(T t) {
        baseRepository.delete(t);
    }

    public void checkExceptionFor(Object obj, String message, Object... var) {
        if (Objects.isNull(obj)) {
            throw new ResourceNotFoundException(String.format(message, var));
        }
    }

    public ModelMapper getModelMapper() {
        return modelMapper;
    }

    public void deleteAll(Iterable<? extends T> entities) {
        baseRepository.deleteAll(entities);
    }
}
