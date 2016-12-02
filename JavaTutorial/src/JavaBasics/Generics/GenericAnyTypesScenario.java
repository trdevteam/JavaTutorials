package JavaBasics.Generics;

import java.util.List;

public class GenericAnyTypesScenario<T> {

public void readOnly(List<? extends T> values) {
  for (T value : values) {
  System.out.println("readOnly: " + value);
 }
}

public void writeOnly(List<? super T> values, T aValue) {
 values.add(aValue);
}

public void writeAndRead(List<T> values, T aValue) {
 values.add(aValue);
 for (T value : values) {
  System.out.println("readAndWrite: " + value);
 }
}
}
