// automatically generated by the FlatBuffers compiler, do not modify

package com.icfolson.aem.monitoring.serialization.generated;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class EventProperty extends Table {
  public static EventProperty getRootAsEventProperty(ByteBuffer _bb) { return getRootAsEventProperty(_bb, new EventProperty()); }
  public static EventProperty getRootAsEventProperty(ByteBuffer _bb, EventProperty obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public EventProperty __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public String value() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer valueAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public float realValue() { int o = __offset(8); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }

  public static int createEventProperty(FlatBufferBuilder builder,
      int nameOffset,
      int valueOffset,
      float realValue) {
    builder.startObject(3);
    EventProperty.addRealValue(builder, realValue);
    EventProperty.addValue(builder, valueOffset);
    EventProperty.addName(builder, nameOffset);
    return EventProperty.endEventProperty(builder);
  }

  public static void startEventProperty(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addValue(FlatBufferBuilder builder, int valueOffset) { builder.addOffset(1, valueOffset, 0); }
  public static void addRealValue(FlatBufferBuilder builder, float realValue) { builder.addFloat(2, realValue, 0.0f); }
  public static int endEventProperty(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}
