package tag2.builder;

public interface Builder<T> {
  
  
  boolean reset();
  T build();
  
  
}