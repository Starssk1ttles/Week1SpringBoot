/**
 * 
 */
package com.promineotech.jeep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import lombok.Getter;

/**
 * @author north
 *
 */
public class BaseTest {
  @LocalServerPort
  int serverPort;

  @Autowired
  @Getter
  private TestRestTemplate restTemplate;

  String getBaseUri() {
    return String.format("http://localhost:%d/jeeps", serverPort);
  }
}
