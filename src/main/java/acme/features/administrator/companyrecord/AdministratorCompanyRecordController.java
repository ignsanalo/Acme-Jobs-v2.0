
package acme.features.administrator.companyrecord;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.companyrecords.Companyrecord;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Administrator;

@Controller
@RequestMapping("/administrator/companyrecord/")
public class AdministratorCompanyRecordController extends AbstractController<Administrator, Companyrecord> {

	// Internal state ---------------------------------------------------------

	@Autowired
	private AdministratorCompanyRecordListService	listService;

	@Autowired
	private AdministratorCompanyRecordShowService	showService;

	@Autowired
	private AdministratorCompanyRecordCreateService	createService;

	@Autowired
	private AdministratorCompanyRecordUpdateService	updateService;

	@Autowired
	private AdministratorCompanyRecordDeleteService	deleteService;


	// Constructors -----------------------------------------------------------

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.SHOW, this.showService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
		super.addBasicCommand(BasicCommand.UPDATE, this.updateService);
		super.addBasicCommand(BasicCommand.DELETE, this.deleteService);
	}
}
