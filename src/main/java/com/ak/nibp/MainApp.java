package com.ak.nibp;

import com.fazecast.jSerialComm.SerialPort;

import java.util.Arrays;
import java.util.logging.Logger;

public class MainApp {
  private MainApp() {
  }

  public static void main(String[] args) {
    Arrays.stream(SerialPort.getCommPorts())
        .forEach(serialPort -> Logger.getLogger(MainApp.class.getName())
            .info("[%s] %s".formatted(serialPort.getSystemPortName(), serialPort.getDescriptivePortName()))
        );
  }
}
