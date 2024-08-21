public class LinkedList {
    Node head;

    // Method to add a new station to the network
     void addStation(int stationData) {
        Node newStation = new Node(stationData);
        if (head == null) {
            head = newStation;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newStation;
        }
    }

     void deleteStation(int stationData) {
        Node temp = head, prev = null;

        // If head station itself holds the station to be deleted
        if (temp != null && temp.data == stationData) {
            head = temp.next; // Change head
            return;
        }

        // Search for the station to be deleted, keep track of the
        // previous station as we need to change temp.next
        while (temp != null && temp.data != stationData) {
            prev = temp;
            temp = temp.next;
        }

        // If station was not present in linked list
        if (temp == null) return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    void show() {
        Node current = head;
        while (current.next != null) {
            System.out.print(current.data + "-");
            current = current.next;
        }
        System.out.println(current.data);
    }

    public static void main(String[] args) {
        // Adding stations with their station IDs
        LinkedList network = new LinkedList();
        network.addStation(101);
        network.addStation(202);
        network.addStation(303);
        network.deleteStation(101);
        network.show();
        network.deleteStation(303);
        network.show();
    }
}

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
