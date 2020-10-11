package hr.fer.ilj.webserver;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

import org.junit.jupiter.api.Test;

class ProtocolTest {

  @Test
  void rootResponse() throws IOException {
    Protocol p = new Protocol();
    BufferedReader inputBuffer = new BufferedReader(new StringReader("GET / HTTP 1.1\n"));
    String protocolResult = p.processInput(inputBuffer);
    assertThat(protocolResult).isEqualTo("default");
  }
}

