public class Box<T> {...}

// Usage:
Box<Integer> integerBox = new Box<Integer>();
// Or compiler can infer the type for Box
Box<Integer> integerBox = new Box<>();

// Will only accept type Integer
integerBox.set(5);
