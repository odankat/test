//import java.util.*;
//import java.util.stream.Collectors;
//
//public class User {
//    private int age;
//    private String name;
//
//    public int getAge() {
//        return age;
//    }
//    public String getName() {
//        return name;
//    }
//
//    public User(int age, String name) {
//        this.name = name;
//        this.age = age;
//    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return age == user.age && Objects.equals(name, user.name);
//    }
//
//    public String toString() {
//        return name + " " + age;
//    }
//
//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }
//
//
//    public static User old(Collection<User> users) {
//        HashSet<User> qwe = new HashSet<>(users);
//        System.out.println(users);
//        users.clear();
//        users.addAll(qwe);
//        System.out.println(qwe);
//        ArrayList<User> set = users.stream().distinct().sorted(Comparator.comparing(User::getAge).
//                thenComparing(User::getName)).collect(Collectors.toCollection(ArrayList::new));
//        System.out.println(set);
//        return set.stream().max(Comparator.comparing(User::getAge)).orElse(null);
//    }
//
//
//}
