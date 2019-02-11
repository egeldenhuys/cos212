Integer x = null; // x is a reference so it can be null

try {
    // Without the try-catch the program would crash here
    x = Integer.parseInt("nope");
} catch (NumberFormatException exception) {
    System.out.println("Could not convert string to int");
}

// Check if the string was successfully parsed
if (x != null) {
    System.out.println(x);
}