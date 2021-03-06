package org.kiteq.client.util;

import org.kiteq.protocol.KiteRemoting.DeliverAck;
import org.kiteq.protocol.KiteRemoting.Header;

/**
 * @author gaofeihang
 * @since Feb 27, 2015
 */
public class AckUtils {
    
    public static DeliverAck buildDeliverAck(Header header) {
        DeliverAck ack = DeliverAck.newBuilder()
                .setGroupId(header.getGroupId())
                .setMessageId(header.getMessageId())
                .setMessageType(header.getMessageType())
                .setTopic(header.getTopic())
                .setStatus(true)
                .build();
        return ack;
    }
    
}
