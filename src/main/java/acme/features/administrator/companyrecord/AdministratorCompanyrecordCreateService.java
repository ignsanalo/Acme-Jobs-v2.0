
package acme.features.administrator.companyrecord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.companyrecords.Companyrecord;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Administrator;
import acme.framework.services.AbstractCreateService;

@Service
public class AdministratorCompanyrecordCreateService implements AbstractCreateService<Administrator, Companyrecord> {

	@Autowired
	AdministratorCompanyrecordRepository repository;


	@Override
	public boolean authorise(final Request<Companyrecord> request) {
		assert request != null;

		return true;
	}

	@Override
	public void bind(final Request<Companyrecord> request, final Companyrecord entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public void unbind(final Request<Companyrecord> request, final Companyrecord entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "name", "sector", "ceo", "description", "web", "phone", "email", "incorporated", "stars");
	}

	@Override
	public Companyrecord instantiate(final Request<Companyrecord> request) {
		Companyrecord result;

		result = new Companyrecord();

		return result;
	}

	@Override
	public void validate(final Request<Companyrecord> request, final Companyrecord entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;
	}

	@Override
	public void create(final Request<Companyrecord> request, final Companyrecord entity) {

		this.repository.save(entity);
	}
}
