package tag2.pattern.builder;

public interface Builder<T> {
  
  
  boolean reset();
  T build();
  
  
}