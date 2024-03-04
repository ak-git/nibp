# NIBP

## Raspberry Pi 4B

### 1. Install SDKMAN

https://foojay.io/today/installing-java-with-sdkman-on-raspberry-pi/

```bash
$ sudo apt install zip

$ curl -s "https://beta.sdkman.io" | bash
```

Open a new terminal or run this command

```bash
$ source "$HOME/.sdkman/bin/sdkman-init.sh"

$ sdk list java
```

### 2. Enable SNAPS

https://snapcraft.io/install/gradle/raspbian

```bash
$ sudo apt update

$ sudo apt install snapd
```

```bash
$ sudo reboot
```

```bash
$ sudo snap install core
```

### 3. Install Gradle

https://gradle.org/install/

```bash
$ sdk install gradle 8.6
```

Verify your installation

```bash
$ gradle -v
```