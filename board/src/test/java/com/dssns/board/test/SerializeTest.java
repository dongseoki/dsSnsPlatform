package com.dssns.board.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.dssns.common.event.NotificationEvent;
import com.dssns.common.event.NotificationEventSerializer;
import com.dssns.common.event.enums.EventSourceType;
import com.dssns.common.event.enums.EventType;
import java.time.Instant;
import org.junit.jupiter.api.Test;

public class SerializeTest {

  @Test
  void test() {
    // Test logic goes here
    NotificationEventSerializer notificationEventSerializer = new NotificationEventSerializer();
    String topic = "test-topic";

    NotificationEvent data = NotificationEvent.builder()
        .eventType(EventType.LIKE)
        .receiverUserId(1L)
        .eventUserId(2L)
        .eventSourceId(3L)
        .eventSourceType(EventSourceType.POST)
        .message("User 2 liked your post")
        .createdAt(Instant.now())
        .build();

    byte[] serializedData = notificationEventSerializer.serialize(topic, data);

    assertNotNull(serializedData);
  }
}
