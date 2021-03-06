package fr.concord.bff.agreement.model;

import fr.concord.bff.user.model.User;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@NoArgsConstructor
@JsonApiResource(type = "agreements")
public class Agreement {

	@JsonApiId
	private String id;

	@JsonProperty
	private String content;

	@JsonApiRelation
	private Set<User> users;

	public Agreement(final String id, final String content, final Set<User> users) {
		this.id = id;
		this.content = content;
		this.users = users;
	}
}
