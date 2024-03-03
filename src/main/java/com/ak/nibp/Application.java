package com.ak.nibp;

import com.fazecast.jSerialComm.SerialPort;

import java.util.Arrays;
import java.util.logging.Logger;

public class Application {
  private Application() {
  }

  public static void main(String[] args) {
    Arrays.stream(SerialPort.getCommPorts())
        .forEach(serialPort -> Logger.getLogger(Application.class.getName())
            .info("[%s] %s".formatted(serialPort.getSystemPortName(), serialPort.getDescriptivePortName()))
        );
  }
}
