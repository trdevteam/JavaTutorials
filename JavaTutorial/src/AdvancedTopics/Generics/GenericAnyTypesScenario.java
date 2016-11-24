package AdvancedTopics.Generics;

import java.util.List;

public class GenericAnyTypesScenario<H> {

public void readOnly(List<? extends H> values) {
  for (H value : values) {
  System.out.println("readOnly: " + value);
 }
}

public void writeOnly(List<? super H> values, H aValue) {
 values.add(aValue);
}

public void writeAndRead(List<H> values, H aValue) {
 values.add(aValue);
 for (H value : values) {
  System.out.println("readAndWrite: " + value);
 }
}
}
