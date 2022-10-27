package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	private List<ProgrammingLanguage> languages;

	public InMemoryLanguageRepository() {
		languages = new ArrayList<ProgrammingLanguage>();
		languages.add(new ProgrammingLanguage(1, "JAVA"));
		languages.add(new ProgrammingLanguage(2, "C#"));
		languages.add(new ProgrammingLanguage(3, "Python"));

	}

	private ProgrammingLanguage validateLanguage(int plID) {
		ProgrammingLanguage pl = null;
		for (ProgrammingLanguage programmingLanguage : languages) {
			if (programmingLanguage.getPlID() == plID) {
				pl = programmingLanguage;
				break;
			}
		}
		return pl;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		// TODO Auto-generated method stub
		this.languages.add(programmingLanguage);

	}

	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {
		// TODO Auto-generated method stub
		languages.remove(programmingLanguage.getPlID());
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		// TODO Auto-generated method stub
		for (ProgrammingLanguage language : languages) {
			if (language.getPlID() == programmingLanguage.getPlID()) {
				language.setPlName(programmingLanguage.getPlName());
			}
		}
	}

	@Override
	public ProgrammingLanguage getByID(int plID) {
		// TODO Auto-generated method stub
		return this.validateLanguage(plID);
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		// TODO Auto-generated method stub
		return languages;
	}

}
