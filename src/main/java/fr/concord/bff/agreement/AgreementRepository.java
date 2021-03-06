package fr.concord.bff.agreement;

import fr.concord.bff.agreement.model.Agreement;
import fr.concord.bff.user.model.User;
import io.crnk.core.queryspec.PathSpec;
import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.core.resource.list.ResourceList;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class AgreementRepository extends ResourceRepositoryBase<Agreement, String> {

	private final Map<String, Agreement> agreements = new HashMap<>();

	public AgreementRepository() {
		super(Agreement.class);
		agreements.put("0", new Agreement("0", "Bonjour", Set.of(new User("0", "Adrien"))));
		agreements.put("1", new Agreement("1", "Salut", Set.of(new User("0", "Adrien"))));
		agreements.put("2", new Agreement("2", "Yo", Set.of(new User("0", "Adrien"))));
	}

	@Override
	public ResourceList<Agreement> findAll(final QuerySpec querySpec) {
		querySpec.
		return querySpec.apply(agreements.values());
	}
}
