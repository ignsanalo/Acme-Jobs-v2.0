/*
 * AuthenticatedAnnouncementUpdateService.java
 *
 * Copyright (c) 2019 Rafael Corchuelo.
 *
 * In keeping with the traditional purpose of furthering education and research, it is
 * the policy of the copyright owner to permit non-commercial use and redistribution of
 * this software. It has been tested carefully, but it is not guaranteed for any particular
 * purposes. The copyright owner does not offer any warranties or representations, nor do
 * they accept any liabilities with respect to them.
 */

package acme.features.authenticated.challenge;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.challenges.Challenge;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractListService;

@Service
public class AuthenticatedChallengeListService implements AbstractListService<Authenticated, Challenge> {

	// Internal state ---------------------------------------------------------

	@Autowired
	private AuthenticatedChallengeRepository repository;


	// AbstractUpdateService<Authenticated, Announcement> interface -----------------

	@Override
	public boolean authorise(final Request<Challenge> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<Challenge> request, final Challenge entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title", "deadline");
	}

	@Override
	public Collection<Challenge> findMany(final Request<Challenge> request) {

		assert request != null;

		Collection<Challenge> result;
		Date c = Calendar.getInstance().getTime();

		result = this.repository.findManyAll(c);

		return result;

	}
}
