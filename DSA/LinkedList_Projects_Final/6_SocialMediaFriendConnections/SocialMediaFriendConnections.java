import java.util.*;
class UserNode {
    int userId;
    String name;
    int age;
    List<Integer> friendIds;
    UserNode next;

    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
    }
}

public class SocialMediaFriendConnections {
    private UserNode head;

    public void addUser(int userId, String name, int age) {
        UserNode newNode = new UserNode(userId, name, age);
        newNode.next = head;
        head = newNode;
    }

    public UserNode searchById(int userId) {
        UserNode curr = head;
        while (curr != null) {
            if (curr.userId == userId) return curr;
            curr = curr.next;
        }
        return null;
    }

    public void addFriendConnection(int id1, int id2) {
        UserNode user1 = searchById(id1);
        UserNode user2 = searchById(id2);
        if (user1 != null && user2 != null) {
            if (!user1.friendIds.contains(id2)) user1.friendIds.add(id2);
            if (!user2.friendIds.contains(id1)) user2.friendIds.add(id1);
        }
    }

    public void removeFriendConnection(int id1, int id2) {
        UserNode user1 = searchById(id1);
        UserNode user2 = searchById(id2);
        if (user1 != null && user2 != null) {
            user1.friendIds.remove(Integer.valueOf(id2));
            user2.friendIds.remove(Integer.valueOf(id1));
        }
    }

    public void displayFriends(int userId) {
        UserNode user = searchById(userId);
        if (user != null) {
            System.out.println("Friends of " + user.name + ": " + user.friendIds);
        }
    }

    public static void main(String[] args) {
        SocialMediaFriendConnections sm = new SocialMediaFriendConnections();
        sm.addUser(1, "Alice", 20);
        sm.addUser(2, "Bob", 21);
        sm.addUser(3, "Charlie", 22);
        sm.addFriendConnection(1, 2);
        sm.addFriendConnection(1, 3);
        sm.displayFriends(1);
    }
}