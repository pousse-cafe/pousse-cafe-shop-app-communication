package poussecafe.shop.comm.events.adapters;

import java.io.Serializable;
import poussecafe.attribute.Attribute;
import poussecafe.attribute.AttributeBuilder;
import poussecafe.discovery.MessageImplementation;
import poussecafe.shop.comm.events.CommunicationExpected;
import poussecafe.shop.comm.model.CommunicationId;

@MessageImplementation(message = CommunicationExpected.class)
@SuppressWarnings("serial")
public class CommunicationExpectedData implements Serializable, CommunicationExpected {

    @Override
    public Attribute<CommunicationId> messageId() {
        return AttributeBuilder.single(CommunicationId.class)
                .storedAs(String.class)
                .adaptOnRead(CommunicationId::new)
                .read(() -> messageId)
                .adaptOnWrite(CommunicationId::stringValue)
                .write(value -> messageId = value)
                .build();
    }

    private String messageId;
}
