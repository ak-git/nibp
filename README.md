# NIBP

## Raspberry Pi 4B

![Raspberry Pi 4B GPIO](https://raspberrypi-ru.com/wp-content/uploads/2020/07/gpios-diagram-939x528.png)

### 1. Install SDKMAN

https://foojay.io/today/installing-java-with-sdkman-on-raspberry-pi/

```bash
sudo apt install zip
```

```bash
curl -s "https://beta.sdkman.io" | bash
```

```bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
```

```bash
sdk list java
```

### 2. Install Gradle

https://gradle.org/install/

```bash
sdk install gradle 8.6
```

Verify your installation

```bash
gradle -v
```

### 3. Install Minicom

![Check serial port](https://raspberrypi-ru.com/wp-content/uploads/2020/07/connexion_serie_test-939x528.jpg)

https://raspberrypi-ru.com/включить-порт-последовательный-мали/

```bash
sudo apt update -y
```

```bash
sudo apt install minicom -y
```

Find serial port

```bash
ls /dev
```

```bash
sudo minicom -D /dev/serial0
```

### 4. Run program

Clone from Git

```bash
git clone https://github.com/ak-git/nibp.git
```

```bash
cd nibp
```

Build and run

```bash
gradle clean build
```

```bash
gradle run
```
