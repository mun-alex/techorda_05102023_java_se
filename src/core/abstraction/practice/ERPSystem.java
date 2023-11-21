package core.abstraction.practice;

public class ERPSystem {
    User[] memory = new User[1000];
    int sizeOfUsers = 0;

    void addUser(User u) {
        memory[sizeOfUsers] = u;
        sizeOfUsers++;
    }

    void printTeacher() {
        for (int i = 0; i < sizeOfUsers; i++) {
            if (memory[i] instanceof Teacher) {
                System.out.println(memory[i].getUserData());
            }
        }
    }

    void printStudent() {
        for (int i = 0; i < sizeOfUsers; i++) {
            if (memory[i] instanceof Student) {
                System.out.println(memory[i].getUserData());
            }
        }
    }

    void printUser(int index) {
        for (int i = 0; i < sizeOfUsers; i++) {
            if (i == index) {
                System.out.println(memory[i].getUserData());
                return;
            }
        }
        System.out.println("No such user in this index");
    }
}
