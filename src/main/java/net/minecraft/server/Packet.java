package net.minecraft.server;

import java.io.IOException;

public interface Packet<T extends PacketListener> {

    void a(PacketDataSerializer packetdataserializer) throws IOException;

    void b(PacketDataSerializer packetdataserializer) throws IOException;

    void a(T t0);

    // Paper start
    default java.util.List<Packet> getExtraPackets() { return null; }
    default boolean packetTooLarge(NetworkManager manager) {
        return false;
    }
    // Paper end

    default boolean a() {
        return false;
    }
}
