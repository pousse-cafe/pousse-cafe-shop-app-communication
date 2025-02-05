package poussecafe.shop.comm.events;

import poussecafe.attribute.Attribute;
import poussecafe.domain.DomainEvent;
import poussecafe.shop.comm.model.CommunicationId;

public interface CommunicationExpected extends DomainEvent {

    Attribute<CommunicationId> messageId();
}
