import java.util.Scanner;

class Child {
    private String name;
    private int numCandies = 2;
    public Child(String name) {
        this.name = name;
    }
    public void givesCandyTo(Child other) {
        if (numCandies > 0) {
            other.numCandies++;
            numCandies--;
        }
        System.out.println("No candies to give!");
    }
    public static Child getChildByName(Child[] children, String name) {
        for (Child child : children) {
            if (child.name.equalsIgnoreCase(name)) {
                return child;
            }
        }
        return null;
    }
    public static void printChildren(Child[] children) {
        String res = "[ ";
        for (Child child: children) {
            res += "(" + child + ") ";
        }
        res += "]";
        System.out.println(res);
    }

    public String toString() {
        return name + ", " + numCandies + " candies";
    }

}

class Person {
    private String name;
    private int age;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

}
public class Task_14 {
    public static void main(String[] args) {
        // Problem 1
//        Child[] children = new Child[3];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("3 children will be created");
//        for (int i = 0; i < children.length; ++i) {
//            System.out.print("Name of the child " + i + ": ");
//            String childName = sc.next();
//            children[i] = new Child(childName);
//        }
//        Child.printChildren(children);
//        System.out.println("Entering the name of the 'giver' starting\nwith 'q' terminates the program\n");
//        while (true) {
//            System.out.print("Enter names of 'giver' and 'receiver': ");
//            String fName = sc.next();
//            System.out.print(" ");
//            String sName = sc.next();
//            if (fName.equalsIgnoreCase("q") || sName.equalsIgnoreCase("q")) {
//                break;
//            }
//            Child firstChild = Child.getChildByName(children, fName);
//            Child secondChild = Child.getChildByName(children,sName);
//
//            if (firstChild != null && secondChild != null) {
//                firstChild.givesCandyTo(secondChild);
//                Child.printChildren(children);
//            } else {
//                if (firstChild == null) {
//                    System.out.println("No child with name " + fName);
//                }
//                if (secondChild == null) {
//                    System.out.println("No child with name " + sName);
//                }
//            }
//        }

    }
}
