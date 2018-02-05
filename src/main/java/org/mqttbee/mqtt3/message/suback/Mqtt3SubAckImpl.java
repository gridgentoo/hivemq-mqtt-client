package org.mqttbee.mqtt3.message.suback;

import com.google.common.collect.ImmutableList;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import org.mqttbee.annotations.NotNull;
import org.mqttbee.api.mqtt3.message.Mqtt3SubAck;
import org.mqttbee.mqtt3.message.Mqtt3Message;
import org.mqttbee.mqtt5.message.suback.Mqtt5SubAckReasonCode;

public class Mqtt3SubAckImpl implements Mqtt3SubAck, Mqtt3Message {


    private final int packetId;
    private final ImmutableList<Mqtt3SubAckReasonCode> reasonCodes;


    public Mqtt3SubAckImpl(
            int packetId, ImmutableList<Mqtt3SubAckReasonCode> reasonCodes) {
        this.packetId = packetId;
        this.reasonCodes = reasonCodes;
    }


    public int getPacketId() {
        return packetId;
    }


    @Override
    public void encode(
            @NotNull Channel channel, @NotNull ByteBuf out) {
        //TODO
    }

    @Override
    public int encodedLength() {
        //TODO
        return 0;
    }

    @NotNull
    @Override
    public ImmutableList<Mqtt5SubAckReasonCode> getReasonCodes() {
        return null;
    }
}