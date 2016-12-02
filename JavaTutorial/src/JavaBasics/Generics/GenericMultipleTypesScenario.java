package JavaBasics.Generics;

import java.util.List;

@SuppressWarnings("hiding")
public class GenericMultipleTypesScenario<Number> {

 public void readOnly(List<? extends Number> numbers) {
   for (Number number : numbers) {
   System.out.println("readOnly: " + number);
  }
 }

 public void writeOnly(List<? super Number> numbers, Number aNumber) {
  numbers.add(aNumber);
 }

 public void writeAndRead(List<Number> numbers, Number aNumber) {
  numbers.add(aNumber);
  for (Number number : numbers) {
   System.out.println("readAndWrite: " + number);
  }

 }
}
