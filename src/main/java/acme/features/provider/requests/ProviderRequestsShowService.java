
package acme.features.provider.requests;

/*
 * ProviderRequestsShow.java
 *
 * Copyright (c) 2019 Rafael Corchuelo.
 *
 * In keeping with the traditional purpose of furthering education and research, it is
 * the policy of the copyright owner to permit non-commercial use and redistribution of
 * this software. It has been tested carefully, but it is not guaranteed for any particular
 * purposes. The copyright owner does not offer any warranties or representations, nor do
 * they accept any liabilities with respect to them.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.requests.Requests;
import acme.entities.roles.Provider;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.services.AbstractShowService;

@Service
public class ProviderRequestsShowService implements AbstractShowService<Provider, Requests> {

	// Internal state ---------------------------------------------------------

	@Autowired
	private ProviderRequestsRepository repository;

	// AbstractCreateService<Provider, Requests> ---------------------------


	@Override
	public boolean authorise(final Request<Requests> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<Requests> request, final Requests entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title", "moment", "deadline", "text", "reward", "ticker");
	}

	@Override
	public Requests findOne(final Request<Requests> request) {
		assert request != null;

		Requests result;
		int id;

		id = request.getModel().getInteger("id");
		result = this.repository.findOneById(id);

		return result;
	}

}
