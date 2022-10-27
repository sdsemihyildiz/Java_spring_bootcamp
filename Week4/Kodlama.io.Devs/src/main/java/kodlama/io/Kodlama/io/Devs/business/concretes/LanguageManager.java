package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;

	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	private boolean isEmpty(ProgrammingLanguage programmingLanguage) {
		if (programmingLanguage.getPlName().isEmpty()) {
			return true;
		}
		return false;
	}

	private boolean isRepeat(ProgrammingLanguage programmingLanguage) {
		List<ProgrammingLanguage> languages = languageRepository.getAll();
		for (ProgrammingLanguage pLanguage : languages) {
			if (programmingLanguage.getPlName().equalsIgnoreCase(pLanguage.getPlName())) {
				return true;
			}

		}
		return false;
	}

	private boolean isValid(ProgrammingLanguage programmingLanguage) throws Exception {
		if (isEmpty(programmingLanguage)) {
			throw new Exception("Programming language cannot be empty.");
		}
		if (isRepeat(programmingLanguage)) {
			throw new Exception(
					programmingLanguage.getPlName() + " already exist. Programming language cannot be repeated.");
		}
		return true;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		try {
			if (this.isValid(programmingLanguage)) {
				this.languageRepository.add(programmingLanguage);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {
		try {
			if (this.isValid(programmingLanguage)) {
				this.languageRepository.delete(programmingLanguage);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		try {
			if (this.isValid(programmingLanguage)) {
				this.languageRepository.update(programmingLanguage);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Override
	public ProgrammingLanguage getByID(int plID) {

		return this.languageRepository.getByID(plID);
	}

	@Override
	public List<ProgrammingLanguage> getAll() {

		return languageRepository.getAll();
	}

}
