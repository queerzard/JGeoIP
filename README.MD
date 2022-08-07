
# JGeoIP

A geo location library for java



## Maven Installation

```java

<repository>
  <id>reposilite-repository</id>
  <name>Seby's Project Repository</name>
  <url>http://mcsilent.de:8091/{repository}</url>
</repository>

<dependency>
  <groupId>com.github.sebyplays</groupId>
  <artifactId>JGeoIP</artifactId>
  <version>1.0-SNAPSHOT</version>
</dependency>
```

## Used libraries

- [lombok](https://projectlombok.org/)

## Usage/Examples
```java
import com.github.sebyplays.jgeo.api.IGeoServiceProvider;
import com.github.sebyplays.jgeo.utils.dgsp.IPApi2DGSP;
import lombok.Getter;

import java.util.Arrays;

public class JGeo {


    public static void main(String[] args) {
        JGeo jGeo = new JGeo(new IPApi2DGSP("IP-ADDRESS"));
        System.out.println(jGeo.getDetails().getCountry());
    }


}
```

