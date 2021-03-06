package com.amazen.marketplace.infrastructure.repositories;

import com.amazen.core.entities.UniqueId;
import com.amazen.marketplace.domain.entities.Membership;
import com.amazen.core.exceptions.ValueObjectException;
import com.amazen.marketplace.domain.interfaces.InMemoryRepositoryEngine;

public class MembershipInMemoryRepository extends InMemoryRepositoryEngine<UniqueId, Membership> {
    public static final InMemoryRepositoryEngine<UniqueId, Membership> INSTANCE = new MembershipInMemoryRepository();

    @Override
    public UniqueId nextId() throws ValueObjectException {
        return UniqueId.withId(count.incrementAndGet());
    }

    @Override
    public Membership findById(UniqueId uniqueId) {
        return data.get(uniqueId);
    }

    @Override
    public Membership save(Membership membership) throws ValueObjectException {
        membership.setId(membership.getId() != null ? membership.getId() : nextId());
        data.put(membership.getId(), membership);
        return data.get(membership.getId());
    }

    @Override
    public void delete(Membership membership){
        data.remove(membership.getId());
    }
}
