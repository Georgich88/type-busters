package io.typebusters.exercises.service.languages;

import io.typebusters.exercises.model.languages.ProgrammingLanguage;
import io.typebusters.exercises.repositories.languages.ProgrammingLanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProgrammingLanguageService {

    @Autowired
    private ProgrammingLanguageRepository programmingLanguageRepository;

    public List<ProgrammingLanguage> saveAll(List<ProgrammingLanguage> subjects) {
        return programmingLanguageRepository.saveAll(subjects);
    }

    public ProgrammingLanguage save(ProgrammingLanguage subject) {
        return programmingLanguageRepository.save(subject);
    }

    public List<ProgrammingLanguage> findAll() {
        List<ProgrammingLanguage> subjects = programmingLanguageRepository.findAll();
        return subjects;
    }

    public ProgrammingLanguage findById(String id) {
        return programmingLanguageRepository.findById(id).orElseThrow();
    }

    @Transactional
    public void deleteAll(List<ProgrammingLanguage> subjects) {
        programmingLanguageRepository.deleteAll(subjects);
    }

    @Transactional
    public void deleteById(String id) {
        programmingLanguageRepository.deleteById(id);
    }

}
