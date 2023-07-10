package day01.practice;

public class Cat {

	private int age;
    private String color;
    private String speaks;
    
    // Getters and setters
    public int age() {
        return age;
    }

    public void age(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String getSpeaks() {
		return speaks;
	}

	public void setSpeaks(String speaks) {
		this.speaks = speaks;
	}
    

    // Main method to create Dog objects
    public static void main(String[] args) {
        // Create two Dog objects
    	Cat Cat1 = new Cat();
    	Cat1.setColor("White");
    	Cat1.age(4);
    	Cat1.setSpeaks("Meow!");
    	
        Cat Cat2 = new Cat();
        Cat2.age(3);
        Cat2.setColor("Black");
        Cat2.setSpeaks("Meow!");

        // Print the attributes of each Dog
        System.out.println("Cat 1:");
        System.out.println("Age: " + Cat1.age());
        System.out.println("Color: " + Cat1.getColor());
        System.out.println("Speaks: " + Cat1.getSpeaks());
        

        System.out.println("Cat 2:");
        System.out.println("Age: " + Cat2.age());
        System.out.println("Color: " + Cat2.getColor());
        System.out.println("Speaks: " + Cat2.getSpeaks());
    }
}
